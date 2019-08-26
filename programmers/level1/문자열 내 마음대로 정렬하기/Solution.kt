import java.util.Arrays

class Solution {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        Arrays.sort(strings) { o1, o2 ->
            if (o1[n] != o2[n]) {
                o1[n].compareTo(o2[n])
            } else {
                o1.compareTo(o2)
            }
        }

        return strings
    }
}