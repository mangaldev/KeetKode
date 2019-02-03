import java.util.*

fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        val year: Int = nextInt()
        when {
            (year < 1918 && year % 4 == 0) || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) -> println("12.09.$year")
            year == 1918 -> println("26.09.$year")
            else -> println("13.09.$year")
        }
    }
}
