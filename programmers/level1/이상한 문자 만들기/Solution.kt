package programmers.level1.이상한_문자_만들기

class Solution {

    fun solution(s: String): String {
        var answer = ""
        var isOdd = false // 홀수인가?
        val diff = 'a' - 'A'

        for (c in s) {
            answer += if (!isOdd && c >= 'a' && c <= 'z') {
                (c - diff)
            } else if (isOdd && c <= 'Z' && c >= 'A') {
                (c + diff)
            } else {
                c
            }

            isOdd = if (c.toInt() != 32) {
                !isOdd
            } else {
                false
            }
        }

        return answer
    }
}