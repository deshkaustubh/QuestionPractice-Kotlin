package org.example.functionalProgrammin

fun main() {
    val s1 = "ABC"
    val s2 = "DEF"
    println(zipStrings(s1, s2))
}

fun zipStrings(s1: String, s2: String): List<Pair<Char, Char>> {
    return s1.zip(s2)
}