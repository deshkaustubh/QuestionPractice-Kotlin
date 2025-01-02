package org.example.stringQuestions

/*
Chef and Happy String
Chef has a string
S
S with him. Chef is happy if the string contains a contiguous substring of length strictly greater than
2
2 in which all its characters are vowels.

Determine whether Chef is happy or not.

Note that, in english alphabet, vowels are a, e, i, o, and u.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, a string
S
S.
Output Format
For each test case, if Chef is happy, print HAPPY else print SAD.

You may print each character of the string in uppercase or lowercase (for example, the strings hAppY, Happy, haPpY, and HAPPY will all be treated as identical).
 */

// s -> String
// t -> Test Cases
// SOLUTION S


fun main() {
    val T = readLine()!!.toInt()  // Number of test cases

    repeat(T) {
        val S = readLine()!!  // Read the string
        var vowelCount = 0
        var isHappy = false

        for (i in S.indices) {
            if (S[i] in listOf('a', 'e', 'i', 'o', 'u')) {
                vowelCount++
                if (vowelCount > 2) {
                    println("HAPPY")
                    isHappy = true
                    break
                }
            } else {
                vowelCount = 0
            }
        }

        if (!isHappy) {
            println("SAD")
        }
    }
}