class Solution {
    fun solution(name: String): Int {
        val countToChange = name.filter { it != 'A' }.length
        var nameToChange = name
        var answer = 0
        var count = 0
        var cursor = Pair(0, 0)

        while (count < countToChange) {
            cursor = findNext(nameToChange, cursor.first)
            answer += getDistance(name[cursor.first]) + cursor.second
            nameToChange = setCharToStr(nameToChange, cursor.first, 'A')
            count++
        }

        return answer
    }

    private fun setCharToStr(name: String, index: Int, char: Char) = name.take(index) + char + name.drop(index + 1)

    /**
     * 현재 위치에서 가까운 A가 아닌 문자열을 찾는다.
     * 반환 값은 Pair(문자를 발견한 index, 움직인 횟수)
     */
    private fun findNext(name: String, cursor: Int): Pair<Int, Int> {
        if (name[cursor] != 'A') {
            return Pair(cursor, 0)
        }

        var left = cursor
        var right = cursor
        var move = 0

        while (true) {
            move++
            left = if (left == 0) name.length - 1 else left - 1
            right = if (right == name.length - 1) 0 else right + 1

            if (name[right] != 'A') {
                return Pair(right, move)
            }

            if (name[left] != 'A') {
                return Pair(left, move)
            }
        }

        return Pair(cursor, -1)
    }

    private fun getDistance(destination: Char) =
        if (destination - 'A' > 12) 'Z' - destination + 1 else destination - 'A'
}
