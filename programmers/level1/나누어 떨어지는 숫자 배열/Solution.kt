package programmers.level1.나누어_떨어지는_숫자_배열

class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val answer = arrayListOf<Int>()

        for (i in arr) {
            if (i % divisor == 0) {
                answer.add(i)
            }
        }

        if (answer.size == 0) {
            answer.add(-1)
        }

        return answer.sorted().toIntArray()
    }
}