import java.util.*

fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        val (total,givenPoiston) = nextLine().split(' ').map { a -> a.toInt() }
        val result = nextLine().split(' ').map { a -> a.toInt() }.max()?.minus(givenPoiston)
        if (result!! > 0)  println(result)  else println(0)
    }
}