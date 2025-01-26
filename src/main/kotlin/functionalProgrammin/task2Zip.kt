package org.example.functionalProgrammin

fun main() {
    val s1 = "ABC"
    val s2 = "DEF"
    println(iterativeZipString(s1, s2))
}

fun zipStrings(s1: String, s2: String): List<Pair<Char, Char>> {
    return s1.zip(s2)
}

// OUTPUT -> [(A, D), (B, E), (C, F)]

fun iterativeZipString(s1: String, s2: String): List<Pair<Char,Char>> {
    val length = if (s1.length > s2.length) s1.length else s2.length // maxOf(s1.length, s2.length)
    val outputList = mutableListOf< Pair<Char, Char>>()

    repeat(length) { // since we have calculated length from string there isn't need of subtracting 1
        outputList.add(s1[it] to s2[it])
    }
    return outputList
}