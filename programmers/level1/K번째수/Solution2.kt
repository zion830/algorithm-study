class Solution2 {

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

        for ((i, command) in commands.withIndex()) {
            val start = command[0] - 1
            val end = command[1] - 1
            val key = command[2] - 1
            val splitArray = array.slice(IntRange(start, end))

            answer[i] = splitArray.sorted()[key]
        }

        return answer
    }
}