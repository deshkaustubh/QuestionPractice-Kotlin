package org.example.stringQuestions

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6)
    println(reversedList(list))
}

fun reversedList(list: MutableList<Int>): List<Int> {
    for(i in list.size-1 downTo 0) {
        var tempInt: Int = list.removeAt(i)
        list.add(tempInt)
    }
    return list
}