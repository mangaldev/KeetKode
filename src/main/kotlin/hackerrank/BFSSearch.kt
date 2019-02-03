import java.util.*

object BFSSearch {
    internal var adjList: MutableMap<Int, List<Int>> = HashMap()
    internal var result: MutableMap<Int, Int> = HashMap()
    internal var queue: Deque<Int> = LinkedList()

    @JvmStatic fun main(args: Array<String>) {
        val sc = Scanner(System.`in`)
        var casese = sc.nextInt()
        while (casese-- != 0) {
            val nodes = sc.nextInt()
            var edges = sc.nextInt()
            adjList = HashMap<Int, List<Int>>()
            result = HashMap<Int, Int>()
            queue.clear()
            while (edges-- != 0) {
                val x = sc.nextInt()
                val y = sc.nextInt()
                if (!adjList.containsKey(x))
                    adjList.put(x, mutableListOf())
                if (!adjList.containsKey(y))
                    adjList.put(y, mutableListOf())
                adjList[x]?.plus(y)
                adjList[y]?.plus(x)
            }
            val givenNode = sc.nextInt()
            result.put(givenNode, 0)
            queue.addLast(givenNode)
            while (!queue.isEmpty()) {
                val somenode = queue.removeFirst()
                if (adjList.containsKey(somenode)) {
                    for (neighbour in adjList[somenode]!!) {
                        if (!result.containsKey(neighbour)) {
                            result.put(neighbour, result[somenode]!! + 1)
                            queue.addLast(neighbour)
                        }
                    }
                }
            }
            for (i in 1..nodes) {
                if (i == givenNode) continue
                if (result.containsKey(i))
                    print((result[i]?.times(6)).toString() + " ")
                else
                    print("-1 ")
            }
            println()
        }
    }
}