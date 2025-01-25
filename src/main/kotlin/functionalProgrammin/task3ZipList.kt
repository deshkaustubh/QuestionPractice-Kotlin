package org.example.functionalProgrammin

fun main() {
    val listFirst = listOf(1, 2, 3, 4)
    val listSecond = listOf(6, 7, 8, 9, 10, 11)
    println(zipLists(listFirst,listSecond ))
}

fun zipLists(l1: List<Int>, l2: List<Int>): List<Pair<Int, Int>> {
    return l1.zip(l2)
}