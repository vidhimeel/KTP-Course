import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines){ i ->
        repeat(lines){ j->
            val t = if (i == j) char1 else char2

                print(t)
            }

        println()
    }
}

    fun main() {
        PatternLinesAndTwoCharsBasedMiniApp("P1", ::printPattern)
    }
