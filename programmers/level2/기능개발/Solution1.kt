class Solution1 {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = arrayListOf<Int>()

        var startIdx = 0

        while (startIdx < progresses.size) {
            var count = 0

            for (i in startIdx until progresses.size) {
                progresses[i] = progresses[i] + speeds[i]
            }

            for (i in startIdx until progresses.size) {
                if (progresses[i] >= 100) {
                    count++
                } else {
                    break
                }
            }

            if (count > 0) {
                answer.add(count)
                startIdx += count
            }
        }

        return answer.toIntArray()
    }
}
