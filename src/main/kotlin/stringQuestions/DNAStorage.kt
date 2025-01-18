package org.example.stringQuestions

/*
DNA Storage
For encoding an even-length binary string into a sequence of A, T, C, and G, we iterate from left to right and replace the characters as follows:

00 is replaced with A
01 is replaced with T
10 is replaced with C
11 is replaced with G
Given a binary string
S
S of length
N
N (
N
N is even), find the encoded sequence.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains two lines of input.
First line contains a single integer
N
N, the length of the sequence.
Second line contains binary string
S
S of length
N
N.
Output Format
For each test case, output in a single line the encoded sequence.

Note: Output is case-sensitive.
*/

// My Kotlin Code
fun main() {
    val t = readLine()!!.toInt()  // Read the number of test cases
    repeat(t) {
        val s = readLine()!!          // Read the binary string

        println(solveUsingStringBuilder(s))  // Output the encoded sequence
    }
}

fun solve(s: String): String {
    val result = StringBuilder()  // Initialize an empty StringBuilder for the result
    val n = readLine()!!.toInt()  // Read the length of the binary string

    for (i in 0 until n step 2) {
        val pair = s.substring(i, i + 2)  // Get each pair of characters
        when (pair) {
            "00" -> result.append('A')
            "01" -> result.append('T')
            "10" -> result.append('C')
            "11" -> result.append('G')
        }
    }
    return result.toString()
}

fun solveUsingStringBuilder(s: String): String {
    val n = s.length
    return buildString {
        for (i in 0 until n step 2) {
            val pair = s.substring(i, i+2)
            when (pair) {
                "00" -> append('A')
                "01" -> append('T')
                "10" -> append('C')
                "11" -> append('G')
            }
        }
    }
}