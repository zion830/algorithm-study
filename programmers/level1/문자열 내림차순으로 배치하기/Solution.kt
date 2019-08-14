class Solution {
    fun solution(s: String): String = s.toCharArray()
            .apply { sortDescending() }
            .joinToString("")
}