package org.example.stringQuestions

/*
Add One
You are given a large number
N
N. You need to print the number
N
+
1
N+1.

Note: The number is very large and it will not fit in standard integer data type. You have to take the input as String and then manipulate the digits to convert it to
N
+
1
N+1.

Input Format
The first line of the input contains a single integer
T
T - the number of test cases. The description of
T
T test cases follows.

The first line of each test case contains a single integer
N
N.

Output Format
For each test case, print a single line containing one integer - the number
N
+
1
N+1.
 */

import java.math.BigInteger

fun main () {
    val T = readLine()!!.toInt()  // Test Cases
    val N = readLine()!! // Reading input as a Integer

    repeat(T) {
        addOne(N)
    }
}

fun addOne(N: String): BigInteger {
    val bigIntN = BigInteger(N)
    val result = bigIntN.add(BigInteger.ONE)
    return result
}
