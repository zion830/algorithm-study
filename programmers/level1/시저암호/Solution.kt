class Solution {
    fun solution(s: String, n: Int): String {
        var answer = ""

        for (c in s) {
            answer += getLetter(c, n)
        }

        return answer
    }

    private fun getLetter(c: Char, n: Int): Char {
        val diff = 'Z' - 'A' + 1
        val letter = c + n

        return if (c == ' ') {
            c
        } else if ((c in 'a'..'z' && letter > 'z')
                || (c in 'A'..'Z' && letter > 'Z')) {
            letter - diff
        } else {
            letter
        }
    }
}
