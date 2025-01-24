package org.example.functionalProgrammin


fun funcMinToMax(list: List<Int>): Int {
    val min = list.min()
    return list.count { it > min }
}

fun main() {
    val t = readln().toInt()

    repeat(t) {
        var n = readln().toInt()
        val values = readln().split(" ").map { it.toInt() }
        println(funcMinToMax(values))
    }
}

//fun mintoMax(values: List<Int>): Int {
//    var smallestElement = org.example.arrayQuestions.findSmallest(values) // Alternately = values.minOrNull()
//    var operationCount = 0
//
//    for(i in values.indices) {
//        if(values[i] > smallestElement) {
//            operationCount++
//        }
//    }
//    return operationCount
//}
//
//fun findSmallest(values: List<Int>): Int {
//    var smallestElement = values[0]
//
//    for(i in values.indices) {
//        if(values[i] < smallestElement) {
//            smallestElement = values[i]
//        }
//    }
//    return smallestElement
