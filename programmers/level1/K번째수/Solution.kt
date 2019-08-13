class Solution {

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = arrayListOf<Int>()

        for (command in commands) {
            val start = command[0] - 1
            val end = command[1] - 1
            val key = command[2] - 1
            val splitArray = array.slice(IntRange(start, end))

            answer.add(splitArray.sorted()[key])
        }

        return answer.stream().mapToInt { i -> i }.toArray()
    }
}