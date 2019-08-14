class Solution {
    fun solution(n: Long): IntArray {
        val answer = arrayListOf<Int>()
        var num = n

        while (num > 0) {
            answer.add((num % 10).toInt())
            num /= 10
        }

        return answer.toIntArray()
    }
}