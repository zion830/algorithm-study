package programmers.level1.`2016년`

class Solution {
    private val weekday = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    fun solution(a: Int, b: Int): String {
        var index = 4

        for (i in 1 until a) {
            index = getWeekDayIndex(index + 1, getDay(i))
        }

        index = getWeekDayIndex(index + 1, b)

        return weekday[index]
    }

    // 달이 종료되는 날의 요일을 구한다
    private fun getWeekDayIndex(index: Int, dayCount: Int): Int {
        var result = index + dayCount % 7 - 1

        if (result > 6) {
            result -= 7
        }

        return result
    }

    private fun getDay(month: Int): Int = if (month == 2) {
        29
    } else if ((month < 8 && month % 2 == 1) || (month >= 8 && month % 2 == 0)) {
        31
    } else {
        30
    }
}