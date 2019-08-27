class Solution {
    fun solution(n: Int, m: Int): IntArray = intArrayOf(gcd(n, m), lcm(n, m))

    // 최대공약수
    fun gcd(n: Int, m: Int): Int {
        var num1 = n
        var num2 = m

        while (num2 != 0) {
            num1 = num2
            num2 = num1 % num2
        }

        return num1
    }

    // 최소공배수
    fun lcm(n: Int, m: Int): Int = n * m / gcd(n, m)
}