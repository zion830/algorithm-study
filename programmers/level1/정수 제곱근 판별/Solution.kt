import kotlin.math.floor
import kotlin.math.sqrt

class Solution {
    fun solution(n: Long): Long {
        val x = sqrt(n.toDouble())

        return (if (x == floor(x)) ((x + 1) * (x + 1)).toLong() else -1L)
    }
}