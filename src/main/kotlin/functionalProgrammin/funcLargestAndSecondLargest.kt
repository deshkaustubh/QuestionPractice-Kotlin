package org.example.functionalProgrammin


fun funSumOfLargestAndSecondLargest(a: List<Int>): Int {
    return a.toSet().sortedDescending().take(2).sum()
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }
        funSumOfLargestAndSecondLargest(a)
    }
}

//fun checkForTheSum(n: Int, a: List<Int>) {
//    var max1 = Int.MIN_VALUE
//    var max2 = Int.MIN_VALUE
//
//    for (num in a) {
//        if (num > max1) {
//            max2 = max1
//            max1 = num
//        } else if (num > max2 && num != max1) {
//            max2 = num
//        }
//    }
//
//    println(max1 + max2)
//}
