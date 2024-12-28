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

fun main() {
    val t = readln().toInt()  // Read the number of test cases
    repeat(t) {
        val n = readln().toInt()  // Read the length of the binary string
        val s = readln()          // Read the binary string

        val result = StringBuilder()  // Initialize an empty StringBuilder for the result
        for (i in 0 until n step 2) {
            val pair = s.substring(i, i + 2)  // Get each pair of characters
            when (pair) {
                "00" -> result.append('A')
                "01" -> result.append('T')
                "10" -> result.append('C')
                "11" -> result.append('G')
            }
        }
        println(result.toString())  // Output the encoded sequence
    }
}