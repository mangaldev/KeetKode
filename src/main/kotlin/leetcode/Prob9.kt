class Solution {
    fun isPalindrome(x: Int): Boolean {
        return x.toString().reversed() == x.toString()
    }

    fun isPalindromee(x: Int): Boolean {
        if (x < 0) return false
        var first: Int = x
        var second: Int = x
        val len: Int = first.toString().length
        var count: Int = 0
        var leftDivisor: Int = Math.pow(10.0, (len - 1).toDouble()).toInt()
        while (count++ < len / 2) {
            if (second / leftDivisor != first % 10) return false
            second = second % leftDivisor
            leftDivisor = leftDivisor / 10
            first /= 10
        }
        return true
    }
}

fun main(args: Array<String>) {
    println(Solution().isPalindrome(-10))
}
