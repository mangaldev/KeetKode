package leetcode

class Prob14 {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""

        val minLen = strs.map { it.length }.min() ?: 0
        for (i in 1..minLen) {
            var found = true
            val pattern = strs[0].substring(0, i)
            for (str in strs) {
                if (found && str.substring(0, i) != pattern)
                    found = false
            }
            if (found) {
                result = pattern
            }
        }
        return result
    }
}