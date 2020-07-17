class Solution {
    fun solution(numbers: IntArray): String {
        val newList = numbers.map { Pair(it.toString().repeat(4).take(4), it) }
        val answer = newList.sortedByDescending { it.first }.joinToString("") { pair -> pair.second.toString() }
        return if (answer.toLongOrNull() == 0L) "0" else answer
    }
}