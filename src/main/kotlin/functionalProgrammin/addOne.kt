package org.example.functionalProgrammin

import org.example.stringQuestions.addOne

fun funcAddOne(n: String): String {
    var carry = 1
    val newN = n.reversed().map { char->
        val d = char.code - '0'.code  // d -> Digit
        val newD = d + carry //NewD -> New Digit
        carry = newD / 10 // because it is int not float
        newD % 10
    }.reversed().joinToString("")
    return if (carry == 0) newN else "1$newN"
}

fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln()
        println(funcAddOne(n))
    }
}

//fun addOne (n: String): String {
//    val digits = n.map { it - '0' }.toMutableList()
//    var carry = 1
//
//    for ( i in digits.size -1 downTo 0) {
//        val sum = digits[i] + carry
//
//        digits[i] = sum % 10
//        carry = sum / 10
//    }
//
//    if ( carry == 1) {
//        digits.add(0,1)
//    }
//    return digits.joinToString("")
//
//}
