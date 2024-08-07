import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {

}

fun factorialOf(x: Long): Long {
    var factorial = 1L
    for (i in 2L..x){
        factorial *= i
    }
    return factorial
}

fun permutationsOf(n: Long, r: Long): Long {
    var permutations = 1L
    for (i in (n - r + 1)..n) {
        permutations *= i
    }
    return permutations
}

fun combinationsOf(n: Long, r: Long): Long {
    return permutationsOf(n , r) / factorialOf(r)
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}