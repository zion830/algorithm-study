package programmers.level1.`2016년`

class Solution2 {
    private val weekday = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

    fun solution(a: Int, b: Int): String {
        var dayCount = 0

        for (i in 1 until a) {
            dayCount += getDay(i)
        }

        dayCount += b
        dayCount = dayCount % 7 - 1

        if (dayCount < 0) {
            dayCount += 7
        }

        return weekday[dayCount]
    }

    private fun getDay(month: Int): Int = when (month) {
        2 -> 29
        4, 6, 9, 11 -> 30
        else -> 31
    }
}