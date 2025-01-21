package org.example.stringQuestions

// Library Functions ❌❌❌
// Mutable List ❌❌❌
// Adds from last and removes from front

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7)
    println(reversedList(list))
}

fun reversedList(list: List<Int>): List<Int> {
    val mutableList = list.toMutableList()
    var forwardCount = 0
    var backwardCount = list.size - 1

    repeat(list.size / 2) {

        val temp = mutableList[forwardCount]
        mutableList[forwardCount] = mutableList[backwardCount]
        mutableList[backwardCount] = temp

        forwardCount++
        backwardCount--
    }
    return mutableList
}