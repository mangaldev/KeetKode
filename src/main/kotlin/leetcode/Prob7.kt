
fun reverse(x: Int): Int {
    var reverseNum = 0L
    var num: Long = Math.abs(x.toLong())

    while (num != 0L) {
        reverseNum = when {
            reverseNum == 0L -> num % 10
            else -> reverseNum * 10 + num % 10
        }
        num /= 10
    }
    return when {
        reverseNum > Int.MAX_VALUE -> 0
        x > 0 -> reverseNum.toInt()
        else -> -1 * reverseNum.toInt()
    }
}

fun main(args: Array<String>) {
    val reverse = reverse(223)
    println("reverse = $reverse")
}