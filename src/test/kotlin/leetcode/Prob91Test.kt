package leetcode

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Prob91Test {
    @Test
    fun basic() {
        assertThat(Prob91().decodingss("7893749912342187894921836847319981199844151766195952528631828655978178193192959793156142441128167383"))
                .isEqualTo(1990656)
    }
}