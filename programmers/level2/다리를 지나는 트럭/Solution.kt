import java.util.*

class Solution {
    fun solution(bridgeLength: Int, weight: Int, truckWeights: IntArray): Int {
        var answer = 0
        val bridge: Queue<Int> = LinkedList<Int>(IntArray(bridgeLength) { 0 }.toList())
        val truckQueue: Queue<Int> = LinkedList<Int>(truckWeights.toList())

        while (true) {
            // println("$answer 초 - 지나가는 트럭 : ${bridge.joinToString()}")

            bridge.poll()
            bridge.offer(if (truckQueue.peek() != null && bridge.sum() + truckQueue.peek() < weight) {
                truckQueue.poll()
            } else {
                0
            })

            answer++
            if (truckQueue.peek() == null && bridge.sum() == 0) {
                return answer
            }
        }
    }
}