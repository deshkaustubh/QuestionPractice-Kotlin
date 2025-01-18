package org.example.stringQuestions

/*
Different Consecutive Characters
Chef has a binary string
S
S of length
N
N. Chef can perform the following operation on
S
S:

Insert any character (
0
0 or
1
1) at any position in
S
S.
Find the minimum number of operations Chef needs to perform so that no two consecutive characters are same in
S
S.

Input Format
The first line contains a single integer
T
T — the number of test cases. Then the test cases follow.
The first line of each test case contains an integer
N
N — the length of the binary string
S
S.
The second line of each test case contains a binary string
S
S of length
N
N containing
0
0s and
1
1s only.
Output Format
For each test case, output on a new line the minimum number of operations Chef needs to perform so that no two consecutive characters are same in
S
S.
 */


fun main() {
    val T = readLine()!!.toInt()

    repeat(T) {
        val N = readLine()!!.toInt()
        val S = readLine()!!

        println(minOperations(S, N))
    }
}

fun minOperations(S: String, N: Int): Int {
    var result = 0
    for (i in 0 until N - 1) {
        if (S[i] == S[i + 1]) result++
    }
    return result
}

