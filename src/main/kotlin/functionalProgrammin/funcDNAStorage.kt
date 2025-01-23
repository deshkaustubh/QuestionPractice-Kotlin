package org.example.functionalProgrammin

import org.example.stringQuestions.solveUsingStringBuilder


fun dnaStorge(s: String): String {
    return s.chunked(2).map {pair->
        when(pair) {
            "00" -> 'A'
            "01" -> 'T'
            "10" -> 'C'
            "11" -> 'G'
            else -> error("Invalid pair: $pair")
        }
    }.joinToString { "" }
}

fun main() {
    val t = readln().toInt()  // Read the number of test cases
    repeat(t) {
        val n = readln().toInt()
        val s = readln()          // Read the binary string

        println(dnaStorge(s))  // Output the encoded sequence
    }
}

//fun solve(s: String): String {
//    val result = StringBuilder()  // Initialize an empty StringBuilder for the result
//    val n = readLine()!!.toInt()  // Read the length of the binary string
//
//    for (i in 0 until n step 2) {
//        val pair = s.substring(i, i + 2)  // Get each pair of characters
//        when (pair) {
//            "00" -> result.append('A')
//            "01" -> result.append('T')
//            "10" -> result.append('C')
//            "11" -> result.append('G')
//        }
//    }
//    return result.toString()
//}