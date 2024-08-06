import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    var k = 0

    for (i in lines downTo 1) {
        for (space in 0..lines - i) {
            print(char1)
        }

        for (j in lines downTo  1){
            print(char2)
        }

        while (k != 2 * i) {
            print(char1)
            ++k
        }

        for (j in lines downTo  1){
            print(char2)
        }
        for (space in 0..lines - i) {
            print(char1)
        }
        k = 0
        println()

    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P4", ::printPattern)
}