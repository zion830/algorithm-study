fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    for (i in 0 until a) {
        for (j in 0 until b) {
            print("*")
        }

        println()
    }
}