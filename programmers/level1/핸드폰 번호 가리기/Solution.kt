class Solution {
    fun solution(phone_number: String): String {
        val length = phone_number.length - 4
        var blind = ""
        
        for (i in 0 until length) {
            blind += "*"
        }
        
        return blind + phone_number.substring(length, length + 4)
    }
}
