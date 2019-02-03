import java.util.*

/**
 * Created by mdev on 7/18/17.
 */

fun main(vararg args: String) {
    with(Scanner(System.`in`)) {
        var bobCount = 0
        var aliceCount = 0
        val bobsPoints = nextLine().split(' ').map { a -> a.toInt() }
        val alicePoints = nextLine().split(' ').map { a -> a.toInt() }
//        bobsPoints.zip(alicePoints, {bob,alice -> if(bob > alice) return 1 else return 0}).sum();
        val bobTotal = bobsPoints.zip(alicePoints, { bob, alice -> if (bob > alice) 1 })
        println("bobTotal = $bobTotal")
        for ((i, bobsPoint) in bobsPoints.withIndex()) {
            if (bobsPoint > alicePoints[i])
                bobCount++
            if (bobsPoint < alicePoints[i])
                aliceCount++
        }
        println("$bobCount $aliceCount")
    }

}

