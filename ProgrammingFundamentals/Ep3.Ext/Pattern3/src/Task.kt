import com.faangx.ktp.patterns.single.PatternLinesAndTwoCharsBasedMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {

    var k = 0

    for (i in 1..lines) {
        for (j in 1..lines - i) {
            print(char2)
        }

        print(char1)

        while (k != 2 * i - 1) {
            if (i != 1)
                print(char2)
            k++
        }
        if (i != 1)
            print(char1)

        for (j in 1 .. lines - i){
            print(char2)}

        k = 2
        println()

    }
}

fun main() {
    PatternLinesAndTwoCharsBasedMiniApp("P3", ::printPattern)
}