class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var temp = num.toLong()

        while (temp > 1) {
            answer++
            if (answer == 500) return -1

            temp = work(temp)
        }

        return answer
    }

    fun work(num: Long): Long = if (num % 2 == 0L) {
        num / 2
    } else {
        num * 3 + 1
    }.toLong()
}