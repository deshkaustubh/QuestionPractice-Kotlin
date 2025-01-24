package org.example.functionalProgrammin

fun funcChefandHappy(s: String): Boolean {
    val vowels = listOf('a','e','i','o','u')
    return s.windowed(3).any {subStr -> subStr.all { vowels.contains(it) }}
}

fun main() {
    val t = readln().toInt()  // Number of test cases

    repeat(t) {
        val s = readln()  // Read the string
        println(funcChefandHappy(s))
    }
}

//fun checkHappiness(S: String): String {
//    var vowelCount = 0
//    for (i in S.indices) {
//        if (S[i] in listOf('a', 'e', 'i', 'o', 'u')) {
//            vowelCount++
//            if (vowelCount > 2) {
//                return "HAPPY"
//            }
//        } else {
//            vowelCount = 0
//        }
//    }
//    return "SAD"
