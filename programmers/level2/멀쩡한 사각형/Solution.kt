import kotlin.math.max
import kotlin.math.min

class Solution {
    fun solution(w: Int, h: Int): Long {
        val gcd = gcd(w, h).toLong()
        return (w.toLong() * h.toLong()) - (w + h - gcd)
    }

    fun gcd(a: Int, b: Int): Int {
        var max = max(a, b)
        var min = min(a, b)

        while (min != 0) {
            val temp = max % min
            max = min
            min = temp
        }

        return max
    }
}