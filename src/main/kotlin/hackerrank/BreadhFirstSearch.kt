import java.util.*

fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        var cases: Int = nextInt()
        while (cases-- != 0) {
            val vertices: Int = nextInt()
            val distanceMap = mutableMapOf<Int,Int>().withDefault { -1 }
            val graph = mutableMapOf<Int, MutableList<Int>>().withDefault { mutableListOf() }
            var edges: Int = nextInt()
            while (edges-- != 0) {
                val (to:Int,from:Int) = nextLine().split(" ").map { it -> it.toInt() }
                graph[to]!!.add(from)
            }

        }
    }
}