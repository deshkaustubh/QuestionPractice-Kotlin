package org.example.functionalProgrammin

fun main() {
    val givenString = "00101110"
    println(windowed(givenString, 2))
}

fun windowed(string: String, size: Int, step: Int = 1): List<String> {
    return string.windowed(size, step = step)
}