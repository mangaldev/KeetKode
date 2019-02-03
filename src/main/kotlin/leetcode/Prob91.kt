package leetcode

import java.util.Arrays.fill

class Prob91 {
    fun numDecodings(s: String): Int {
        decodings(s)
        return count
    }

    var count = 0

    fun decodings(s: String) {
        if (s.isEmpty()) {
            count++
            return
        }
        val number = s.substring(0..0).toInt()
        if (number > 0)
            decodings(s.substring(1))
        if (s.length >= 2) {
            val doubleNumber = s.substring(0..1).toInt()
            if (doubleNumber in 10..26)
                decodings(s.substring(2))
        }
    }

    fun decodingss(s: String): Int {
        var lastNum = -1
        val cached = IntArray(s.length + 2) { 0 }
        cached[1] = 1
        s.forEachIndexed { index, c ->
            val indexOnCache = index + 2
            val currentNum = c.toString().toInt()
            if (currentNum in 1..9) {
                cached[indexOnCache] += cached[indexOnCache - 1]
            }
            if (lastNum != -1 && (lastNum * 10 + currentNum) in 10..26) {
                cached[indexOnCache] += cached[indexOnCache - 2]
            }
            lastNum = currentNum
        }
        return cached.last()
    }
}