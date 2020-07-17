class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        for (x in 1..yellow) {
            val y = yellow / (x * 1.0f)
            if (brown.toFloat() == ((x + 2) * 2 + (y * 2))) {
                return intArrayOf(x + 2, y.toInt() + 2).apply { sortDescending() }
            }
        }

        return intArrayOf()
    }
}