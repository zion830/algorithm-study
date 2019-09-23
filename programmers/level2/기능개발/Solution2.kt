import java.util.*
import kotlin.math.ceil

class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val answer = arrayListOf<Int>()
        val leftDay = progresses.mapIndexed { index, i -> ceil((100.0 - i) / speeds[index]) }

        var startIdx = 0

        while (startIdx < leftDay.size) {
            var count = 0

            for (i in startIdx until leftDay.size) {
                if (leftDay[i] - leftDay[startIdx] <= 0) {
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
