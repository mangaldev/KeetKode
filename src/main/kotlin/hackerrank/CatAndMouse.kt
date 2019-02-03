import java.util.*

/*
3
1 2 3
1 3 2
2 1 3
 */
fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        var cases: Int = nextLine().split(' ').map { i -> i.toInt() }.get(0)
        while (cases-- != 0) {
            val (x,y,z) = nextLine().split(' ').map { i -> i.toInt() }
            when {
                Math.abs(x - z) < Math.abs(y - z) -> println("Cat A")
                Math.abs(x - z) > Math.abs(y - z) -> println("Cat B")
                else -> println("Mouse C")
            }
        }
    }
}