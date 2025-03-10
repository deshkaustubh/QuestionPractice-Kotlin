package org.example.stringQuestions

/*
Wordle
Chef invented a modified wordle.

There is a hidden word
S
S and a guess word
T
T, both of length
5
5.

Chef defines a string
M
M to determine the correctness of the guess word. For the
i
t
h
i
th
  index:

If the guess at the
i
t
h
i
th
  index is correct, the
i
t
h
i
th
  character of
M
M is
G
G.
If the guess at the
i
t
h
i
th
  index is wrong, the
i
t
h
i
th
  character of
M
M is
B
B.
Given the hidden word
S
S and guess
T
T, determine string
M
M.

Input Format
First line will contain
T
T, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string
S
S - the hidden word.
Second line contains the string
T
T - the guess word.
Output Format
For each test case, print the value of string
M
M.

You may print each character of the string in uppercase or lowercase (for example, the strings
BgBgB
BgBgB,
BGBGB
BGBGB,
bgbGB
bgbGB and
bgbgb
bgbgb will all be treated as identical).
 */

fun main () {
    val T = readln().toInt()

    repeat(T) {
        val S = readln()
        val T = readln()

        println(wordleUsingBuildString(S, T))
    }
}

fun Wordle (S: String, T: String): String {
    var M = ""
    for ( i in S.indices){
        if( S[i] == T[i]) M += "G"
        else M += "B"
    }
    return M
}

fun wordleUsingBuildString(S: String, T: String): String {
    return buildString {
        for (i in S.indices) {
            if(S[i] == T[i]) append('G')
            else append('B')
        }
    }
}