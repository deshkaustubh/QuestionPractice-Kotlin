package org.example.arrayQuestions

/*
Difficulty Rating Order
Our Chef has some students in his coding class who are practicing problems. Given the difficulty of the problems that the students have solved in order, help the Chef identify if they are solving them in non-decreasing order of difficulty. Non-decreasing means that the values in an array is either increasing or remaining the same, but not decreasing. That is, the students should not solve a problem with difficulty
d
1
d
1
​
 , and then later a problem with difficulty
d
2
d
2
​
 , where
d
1
>
d
2
d
1
​
 >d
2
​
 .

Output “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of
2
2 lines of input.
The first line contains a single integer
N
N, the number of problems solved by the students
The second line contains
N
N space-separate integers, the difficulty ratings of the problems attempted by the students in order.
Output Format
For each test case, output in a new line “Yes” if the problems are attempted in non-decreasing order of difficulty rating and “No” if not. The output should be printed without the quotes.
Each letter of the output may be printed in either lowercase or uppercase. For example, the strings yes, YeS, and YES will all be treated as equivalent.
 */

fun main() {
    val T = readLine()!!.toInt()
    repeat(T) {
        val N = readLine()!!.toInt()
        val difficulties = readLine()!!.split(" ").map { it.toInt() }
        if (isNonDecreasing(difficulties)) {
            println("Yes")
        } else {
            println("No")
        }
    }
}

fun isNonDecreasing(arr: List<Int>): Boolean {
    for (i in 1 until arr.size) {
        if (arr[i] < arr[i - 1]) {
            return false
        }
    }
    return true
}
