class Prob36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        var result = true
        for (i in 0 until board.size)
            result = result && isValidRow(board[i])
        println(result)
        for (i in 0 until board[0].size)
            result = result && isValidColumn(board, i)
        println(result)
        for (i in 0 until 9 step 3)
            for (j in 0 until 9 step 3)
                result = result && isValidMatrix(board, i, j)
        println(result)
        return result
    }

    private fun isValidRow(row: CharArray): Boolean {
        println(row)
        val seen = mutableSetOf<Char>()
        for (i in 0 until row.size) {
            if (row[i] == '.') continue
            if (seen.contains(row[i])) return false
            if (row[i].numericValue() > 9 || row[i].numericValue() < 1) return false
            seen.add(row[i])
        }
        return true
    }

    private fun Char.numericValue(): Int{
        return this.toString().toInt()
    }

    private fun isValidColumn(board: Array<CharArray>, col: Int): Boolean {
        val seen = mutableSetOf<Char>()
        for (row in 0 until board.size) {
            val value = board[row][col]
            if (value == '.') continue
            if (seen.contains(value)) return false
            if (value.numericValue() > 9 || value.numericValue() < 1) return false
            seen.add(value)
        }
        return true
    }

    private fun isValidMatrix(board: Array<CharArray>, row: Int, col: Int): Boolean {
        val seen = mutableSetOf<Char>()
        for (i in row until row + 3) {
            for (j in col until col + 3) {
                val value = board[i][j]
                if (value == '.') continue
                if (seen.contains(value)) return false
                if (value.numericValue() > 9 || value.numericValue() < 1) return false
                seen.add(value)
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    Prob36().isValidSudoku(arrayOf(charArrayOf('.', '8', '7', '6', '5', '4', '3', '2', '1'), charArrayOf('2', '8', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('3', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('4', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('5', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('6', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('7', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('8', '.', '.', '.', '.', '.', '.', '.', '.'), charArrayOf('9', '.', '.', '.', '.', '.', '.', '.', '.')))
}