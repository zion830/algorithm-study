import kotlin.math.max

class Solution {
    fun solution(citations: IntArray): Int {
        var appear = 0
        var answer = 0
        citations.sort()

        for (i in 0..citations.last()) {
            for (citation in citations) {
                if (citation >= i) {
                    appear++
                }
            }

            if (appear >= i && (citations.size - appear) < i) {
                answer = max(answer, i)
            }
            appear = 0
        }

        return answer
    }
}

fun main(args: Array<String>) {
    println(Solution().solution(intArrayOf(3, 0, 6, 1, 5)))
}