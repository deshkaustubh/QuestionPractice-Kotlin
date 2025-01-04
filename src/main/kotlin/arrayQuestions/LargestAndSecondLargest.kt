package org.example.arrayQuestions

/*
Largest and Second Largest
You are given an array
A
A of
N
N integers.
Find the maximum sum of two distinct integers in the array.

Note: It is guaranteed that there exist at least two distinct integers in the array.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains single integer
N
N — the size of the array.
The next line contains
N
N space-separated integers, denoting the array
A
A.
Output Format
For each test case, output on a new line, the maximum sum of two distinct integers in the array.
 */

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
