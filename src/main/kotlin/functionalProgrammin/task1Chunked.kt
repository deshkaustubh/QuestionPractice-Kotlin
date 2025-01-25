package org.example.functionalProgrammin


fun main() {
    val givenString = "00101110"
    println(chunkedString(givenString))
}

fun chunkedString(string: String): List<String> {
    return string.chunked(2)
}