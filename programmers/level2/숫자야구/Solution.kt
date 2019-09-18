class Solution {
    fun solution(baseball: Array<IntArray>): Int {
        var answer = 0

        for (candidate in 123..987) {
            var status = true

            for (nums in baseball) {
                val c = candidate.toString()
                if (!(isCandidate(c) && isAvailable(c, nums))) {
                    status = false
                    break
                }
            }

            if (status) {
                answer++
            }
        }

        return answer
    }

    private fun isCandidate(num: String): Boolean = !(num.contains('0')
            || num[0] == num[1] || num[0] == num[2] || num[1] == num[2])

    private fun isAvailable(candidate: String, baseball: IntArray): Boolean {
        val num = baseball[0].toString()
        var strike = 0
        var ball = 0

        // 볼 검사
        for (i in 0 until 3) {
            if (candidate[i] == num[i]) {
                strike++
            } else {
                // 볼이 아닐 경우 스크라이크 검사
                if (candidate.contains(num[i])) {
                    ball++
                }
            }
        }

        return (strike == baseball[1]) && (ball == baseball[2])
    }
}
