import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {

    for (i in 1..lines) {
        for (space in 2..i) {
            print(" ")
        }
        print(char2)

        for (space in (lines-1) downTo i) {
            print(" ")
        }
        print(char1)

        for (space in (lines-1) downTo i) {
            print(" ")
        }
        print(char2)
        println()
    }

    for (star in 1..(2 * lines +1)){
        print(char1)
    }
    println()

    for (i in lines downTo 1) {
        for (space in 2..i) {
            print(" ")
        }
        print(char2)

        for (space in (lines-1) downTo i) {
            print(" ")
        }
        print(char1)


        for (space in (lines-1) downTo i) {
            print(" ")
        }
        print(char2)
        println()
    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P5", ::printPattern)
}