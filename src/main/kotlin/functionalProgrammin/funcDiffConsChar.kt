package org.example.functionalProgrammin


fun funcDiffConsChar(s:String): Int {
    return s.windowed(2).count(){it in listOf("00","11")}
}
// here we use count along with windowed it counts the number of times the elements in the list occur

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val s = readln()

        println(funcDiffConsChar(s))
    }
}

//
//fun minOperations(S: String, N: Int): Int {
//    var result = 0
//    for (i in 0 until N - 1) {
//        if (S[i] == S[i + 1]) result++
//    }
//    return result
//}
