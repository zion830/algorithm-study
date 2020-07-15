class Solution {
    fun solution(heights: IntArray): IntArray {
        val answer = IntArray(heights.size) { 0 }
        for (i in 1 until heights.size) {
            for (j in i downTo 0) {
                if (heights[i] < heights[j]) {
                    answer[i] = j + 1
                    break
                }
            }
        }
        return answer
    }
}