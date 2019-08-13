import java.util.Arrays

class Solution {

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val clothesCount = initClothesCount(n, lost, reserve)

        return changeClothes(clothesCount, lost)
    }

    private fun changeClothes(clothesCount: IntArray, lost: IntArray): Int {
        var answer = 0

        for (i in lost) {
            val lostIdx = i - 1

            if (clothesCount[lostIdx] < 1) {
                if (lostIdx > 0 && clothesCount[lostIdx - 1] >= 2) { // 앞사람 체육복 확인
                    clothesCount[lostIdx]++
                    clothesCount[lostIdx - 1]--
                } else if (lostIdx < clothesCount.size - 1 && clothesCount[lostIdx + 1] >= 2) { // 뒷사람 체육복 확인
                    clothesCount[lostIdx]++
                    clothesCount[lostIdx + 1]--
                }
            }
        }

        for (i in clothesCount) {
            if (i >= 1) {
                answer++
            }
        }

        return answer
    }

    // 각자 몇 벌의 옷을 가지고 있는지 확인
    private fun initClothesCount(n: Int, lost: IntArray, reserve: IntArray): IntArray {
        val clothesCount = IntArray(n)
        Arrays.fill(clothesCount, 1)

        for (i in lost) {
            clothesCount[i - 1]--
        }

        for (i in reserve) {
            clothesCount[i - 1]++
        }

        return clothesCount
    }
}