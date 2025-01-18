package org.example.arrayQuestions


// Let us assume that at least three inputs are given
fun main() {
    val t = readln().toInt()
    repeat(t){
        val n = readln().toInt()
        val a = readln().split(" ").map { it.toInt() }.toMutableList()
        println(sumOfAllThree(a))
    }
}

fun sumOfAllThree(a: MutableList<Int>): Int? {
    var temp = a.maxOrNull() // also separate can be made for this
    var sum = a.maxOrNull()

    repeat(2) {
        a.removeAll{it == temp}
        temp = a.maxOrNull()
        sum = sum?.plus(temp!!)
    }

    return sum
}

// If not this another method would be to call the second largest function which would give sum of two and we shall iterate and remove both the element and now find the largest and add to it 👍🏼