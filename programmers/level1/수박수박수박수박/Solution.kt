class Solution {
    fun solution(n: Int): String {
        var answer = ""

        for (i in 0 until (n / 2)) {
            answer += "수박"
        }

        return if (n % 2 == 0) answer else answer + "수"
    }
}