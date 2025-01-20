package org.example.stringQuestions



// New List Approach
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    println(listReversal(list))
}

fun listReversal(list: List<Int>): List<Int>{
    val reversedList = mutableListOf<Int>()

    for ( i in list.size - 1 downTo 0) {
        reversedList.add(list[i])
    }
    return reversedList
}