import kotlin.math.max
import kotlin.math.min

object Prob4 {
    fun findMedianSortedArrays(array1: IntArray, array2: IntArray): Double {
        return when {
            array1.size > array2.size -> medianOf(array2, array1)
            else -> medianOf(array1, array2)
        }
    }

    fun medianOf(array1: IntArray, array2: IntArray): Double {
        var result = -1.0
        var low = 0
        var high = array1.size
        while (low <= high) {
            val partitionX = (high + low) / 2
            val partitionY = (array1.size + array2.size + 1) / 2 - (partitionX)

            val leftX = if (partitionX == 0) Int.MIN_VALUE else array1[partitionX - 1]
            val rightX = if (partitionX == array1.size) Int.MAX_VALUE else array1[partitionX]

            val leftY = if (partitionY == 0) Int.MIN_VALUE else array2[partitionY - 1]
            val rightY = if (partitionY == array2.size) Int.MAX_VALUE else array2[partitionY]


            if (leftX <= rightY && leftY <= rightX) {
                if ((array1.size + array2.size) % 2 == 0)
                    result = (max(leftX, leftY) + min(rightX, rightY)) / 2.0
                else
                    result = max(leftX, leftY).toDouble()
                break
            } else if (leftX > rightY)
                high = partitionX - 1
            else
                low = partitionX + 1

        }
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
//        findMedianSortedArrays(intArrayOf(1, 3, 8, 9, 15), intArrayOf(7, 11, 18, 19, 21, 25)).let {
//        findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)).let {
        findMedianSortedArrays(intArrayOf(3), intArrayOf(-2, -1)).let {
            println(it)
        }
    }

}

