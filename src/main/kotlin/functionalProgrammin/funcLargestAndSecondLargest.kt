package org.example.functionalProgrammin



fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val n = readLine()!!.toInt()
        val a = readLine()!!.split(" ").map { it.toInt() }
        checkForTheSum(n, a)
    }
}

fun checkForTheSum(n: Int, a: List<Int>) {
    var max1 = Int.MIN_VALUE
    var max2 = Int.MIN_VALUE

    for (num in a) {
        if (num > max1) {
            max2 = max1
            max1 = num
        } else if (num > max2 && num != max1) {
            max2 = num
        }
    }

    println(max1 + max2)
}
