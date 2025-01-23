package org.example.functionalProgrammin

import java.util.*

fun funcChess(x: Int, results: String): Int {
    val counts = results.groupBy { it }.mapValues { it.value.size }
    val c = counts['C']?: 0
    val n = counts['N']?: 0
    return when {
        c > n -> 60 * x
        c == n -> 55 * x
        else -> 40 * x
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    repeat(t) {
        val x = sc.nextInt()
        val s = sc.next()
        println(funcChess(x, s))
    }
}

//fun calculatePrize(x: Int, s: String): Int {
//    var c = 0
//    var n = 0
//    var d = 0
//    for (i in s.indices) {
//        when (s[i]) {
//            'C' -> c++
//            'N' -> n++
//            else -> d++
//        }
//    }
//    return when {
//        c > n -> 60 * x
//        c == n -> 55 * x
//        else -> 40 * x
//    }
//}