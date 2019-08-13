package programmers.level1.제일_작은_수_제거하기

class Solution {
    fun solution(arr: IntArray): IntArray {
        val answer = arrayListOf<Int>()

        var minVal = arr[0]

        for (value in arr) {
            answer.add(value)

            if (minVal > value) {
                minVal = value
            }
        }

        answer.remove(minVal)

        if (answer.size == 0) {
            answer.add(-1)
        }

        return answer.toIntArray()
    }
}