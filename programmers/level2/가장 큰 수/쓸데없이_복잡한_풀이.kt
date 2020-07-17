class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        val list = Array<LinkedList<Int>>(10) { LinkedList() }

        for (s in numbers) {
            val key= s.toString().first().toString().toInt()
            list[key] = addNew(list[key], s)
        }

        for (i in list.size - 1 downTo 0) {
            answer += list[i].joinToString("")
        }

        return if (answer.toLongOrNull() == 0L) "0" else answer
    }

    private fun addNew(numbers: LinkedList<Int>, value: Int): LinkedList<Int> {
        for ((i, num) in numbers.withIndex()) {
            if (isInsertable(num, value)) {
                return numbers.apply { add(i, value) }
            }
        }

        return numbers.apply { add(value) }
    }

    private fun isInsertable(num: Int, num2: Int) = "$num$num2".toInt() < "$num2$num".toInt()
}