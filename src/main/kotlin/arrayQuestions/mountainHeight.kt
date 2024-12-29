package org.example.arrayQuestions

/*
    Find maximum in an Array
Given a list of
N
N integers, representing height of mountains. Find the height of the tallest mountain.

Input:
First line will contain
T
T, number of testcases. Then the testcases follow.
The first line in each testcase contains one integer,
N
N.
The following line contains
N
N space separated integers: the height of each mountains.
Output:
For each testcase, output one line with one integer: the height of the tallest mountain for that test case.

 */

fun main() {
    val t = readLine()!!.toInt()  // Number of test cases

    repeat(t) {
        val n = readLine()!!.toInt()  // Number of mountains
        val heights = readLine()!!.split(" ").map { it.toInt() }  // Heights of the mountains

        val maxHeight = heights.maxOrNull() ?: 0  // Find the maximum height
        println(maxHeight)
    }
}
