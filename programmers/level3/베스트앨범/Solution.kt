class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val hash = hashMapOf<String, ArrayList<Pair<Int, Int>>>()
        val result = ArrayList<Int>()

        genres.forEachIndexed { index, genre ->
            val playList = hash[genre] ?: arrayListOf()
            playList.add(Pair(index, plays[index]))
            hash[genre] = playList
        }

        val sortedMap = hash.toSortedMap(compareByDescending { hash[it]!!.sumBy { pair -> pair.second } })

        for (entry in sortedMap) {
            entry.value.apply {
                sortBy { it.first }
                sortByDescending { it.second }
            }
            for (pair in entry.value.take(2)) {
                result.add(pair.first)
            }
        }

        return result.toIntArray()
    }
}
