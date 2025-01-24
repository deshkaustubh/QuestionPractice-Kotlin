package org.example.functionalProgrammin

fun funcBlobbyVolley(s: String): Pair<Int, Int> {
    var a = 0
    var b = 0
    "A$s".windowed(2) {
        when (it) {
            "AA" -> a++
            "BB" -> b++
            else -> {}
        }
    }
    return a to b
}


fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val s = readln()
        println(calculateScores(n, s))
    }
}

fun calculateScores(n: Int, s: String): String {
    var serverIsA = true
    var aliceScore = 0
    var bobScore = 0

    for (i in s.indices) {
        when {
            // Score Calculation
            serverIsA && s[i] == 'A' -> aliceScore++
            !serverIsA && s[i] == 'B' -> bobScore++
            // Server Selection
            !serverIsA && s[i] == 'A' -> serverIsA = true
            serverIsA && s[i] == 'B' -> serverIsA = false
        }
    }
    return "$aliceScore $bobScore"
}