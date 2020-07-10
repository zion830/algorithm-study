class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1
        val hashMap = hashMapOf<String, ArrayList<String>>()

        for (clothe in clothes) {
            val type: String = clothe[1]
            val arrayList = hashMap[type] ?: arrayListOf<String>()
            arrayList.add(clothe[0])
            hashMap[type] = arrayList
        }

        for (mutableEntry in hashMap) {
            answer *= mutableEntry.value.size + 1
        }

        return answer - 1
    }
}