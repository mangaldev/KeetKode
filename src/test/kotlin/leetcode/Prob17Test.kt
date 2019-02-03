package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Prob17Test {

    @Test
    fun `given first test, should pass`() {
        assertThat(Prob17.letterCombinations("23")).hasSize(9)
                .containsExactlyInAnyOrder("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
    }
}