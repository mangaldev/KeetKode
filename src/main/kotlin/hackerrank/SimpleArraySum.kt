import java.util.*

/**
 * Created by mdev on 7/17/17.
 */

fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        nextLine()
        println(nextLine()!!.split(' ').map(String::toInt).sum())
    }
}
