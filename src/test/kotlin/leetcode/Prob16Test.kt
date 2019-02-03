package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Prob16Test {

    @Test
    fun `given input1, should pass`() {
        assertThat(Prob16.threeSumClosest(intArrayOf(-1, 2, 1, -4), 1)).isEqualTo(2)

    }

    @Test
    fun `given input2, should pass`() {
        assertThat(Prob16.threeSumClosest(intArrayOf(1, 1, -1, -1, 3), -1)).isEqualTo(-1)
    }

}