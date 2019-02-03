package leetcode

import kotlin.math.absoluteValue

object Prob16 {

    fun threeSumClosest(nums: IntArray, target: Int): Int {
        nums.sort()
        var minDiff = Int.MAX_VALUE
        var result = -1
        nums.forEachIndexed { index, current ->
            var low = index + 1
            var high = nums.size - 1
            while (low < high) {
                val currentSum = current + nums[low] + nums[high]
                val diff = target - currentSum
                if (diff.absoluteValue < minDiff) {
                    minDiff = diff.absoluteValue
                    result = currentSum
                }
                when {
                    diff > 0 -> low++
                    else -> high--
                }
            }
        }
        return result
    }


}