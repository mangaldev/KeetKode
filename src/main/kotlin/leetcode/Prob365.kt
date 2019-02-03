package leetcode

import kotlin.math.absoluteValue

object Prob365 {
    fun canMeasureWater(x: Int, y: Int, z: Int): Boolean {
        var x1 = x
        var y1 = y
        var z1 = z
        if(z ==0 ) return true
        if(x == 0 || y == 0) return false
        if (z > x + y) return false
        if(x > y){
            x1 = y
            y1 = x
        }
        if(z1 % x1 == 0) return true

        var rem = y1 - x1 // 29
        while(rem <= (y1+x1)){
            if(rem == z1 || rem == x1 + z1 || rem == y1 + z1 ) return true

            rem = y1 - (x1 - rem).absoluteValue //34 - (29 - 5) . .10
        }


        return false
    }

    @JvmStatic
    fun main(args: Array<String>) {
        println(canMeasureWater(2, 6, 5))
    }
}