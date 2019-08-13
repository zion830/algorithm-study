package programmers.level1.이상한_문자_만들기

class Solution2 {

    fun solution(s: String): String {
        var answer = ""
        var isOdd = false

        for (c in s) {
            answer += if (isOdd) {
                c.toLowerCase()
            } else {
                c.toUpperCase()
            }

            isOdd = if (c != ' ') {
                !isOdd
            } else {
                false
            }
        }

        return answer
    }
}