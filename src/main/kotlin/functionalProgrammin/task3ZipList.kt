package org.example.functionalProgrammin

fun main() {
    val listFirst = listOf(1, 2, 3, 4)
    val listSecond = listOf(6, 7, 8, 9, 10, 11)
    println(zipLists(listFirst,listSecond ))
}

fun zipLists(l1: List<Int>, l2: List<Int>): List<Pair<Int, Int>> {
    return l1.zip(l2)
}

// OUTPUT -> [(1, 6), (2, 7), (3, 8), (4, 9)]

fun iterativeZipLists(l1: List<Int>, l2: List<Int>): List<Pair<Int, Int>> {
    val length = if (l1.size < l2.size) l1.size else l2.size // minOf(l1.size, l2.size)
    val outputList = mutableListOf< Pair<Int, Int>>()

    repeat(length) { // since we have calculated length from string there isn't need of subtracting 1
        outputList.add(l1[it] to l2[it])
    }
    return outputList
}