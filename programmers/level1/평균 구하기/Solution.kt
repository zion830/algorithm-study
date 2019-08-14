class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0

        for (value in arr) {
            answer += value
        }

        return answer / arr.size
    }
}