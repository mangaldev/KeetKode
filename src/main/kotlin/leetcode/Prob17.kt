package leetcode

object Prob17 {
    fun letterCombinations(digits: String): List<String> {
        val result = mutableListOf<String>()
        combination(digits, "", result)
        return result
    }

    private val digitToCharMap = mapOf('2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
    )

    private fun combination(digits: String, prefix: String, result: MutableList<String>) {
        if (digits.isEmpty()) {
            if(prefix.isNotBlank())
            result.add(prefix)
            return
        }
        digitToCharMap[digits[0]]?.forEach { char ->
            combination(digits.substring(1), prefix + char, result)
        }
    }
}