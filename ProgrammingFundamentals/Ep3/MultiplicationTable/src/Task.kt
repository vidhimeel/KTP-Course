import com.faangx.ktp.basics.MultiplicationTableMiniApp

fun printTable(num: Int) {
    repeat(10){
        //println("$num X $i = ${num * i}")
    }
}

fun main() {
    MultiplicationTableMiniApp(::printTable)
}