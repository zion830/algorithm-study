class Solution {
    fun solution(s: String): Boolean = checkLength(s) && isNumber(s)

    fun checkLength(s: String): Boolean = (s.length == 4 || s.length == 6)

    fun isNumber(s: String): Boolean {
        for (c in s) {
            if (!(c >= '0' && c <= '9')) {
                return false
            }
        }

        return true
    }
}