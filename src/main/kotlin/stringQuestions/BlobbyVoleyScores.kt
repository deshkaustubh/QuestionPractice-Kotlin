package org.example.stringQuestions

/*
Blobby Volley Scores
Alice and Bob are playing a game of Blobby Volley. In this game, in each turn, one player is the server and the other player is the receiver. Initially, Alice is the server, and Bob is the receiver.

If the server wins the point in this turn, their score increases by 1, and they remain as the server for the next turn.
But if the receiver wins the point in this turn, their score does not increase. But they become the server in the next turn.
In other words, your score increases only when you win a point when you are the server.
Please see the Sample Inputs and Explanation for more detailed explanation.

They start with a score of
0
0 each, and play
N
N turns. The winner of each of those hands is given to you as a string consisting of 'A's and 'B's. 'A' denoting that Alice won that point, and 'B' denoting that Bob won that point. Your job is the find the score of both of them after the
N
N turns.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains one integer
N
N — the number of turns.
The line contains a string
S
S of length
N
N.
If the
i
t
h
i
th
  character of this string is 'A', then Alice won that point.
If the
i
t
h
i
th
  character of this string is 'B', then Bob won that point.
Output Format
For each test case, output on a new line, two space-separated integers - Alice's final score, and Bob's final score.
 */

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val s = readln()
        println(calculateScores(n, s))
    }
}

fun calculateScores(n: Int, s: String): String {
    var serverIsA = true
    var aliceScore = 0
    var bobScore = 0

    for (i in s.indices) {
        when {
            // Score Calculation
            serverIsA && s[i] == 'A' -> aliceScore++
            !serverIsA && s[i] == 'B' -> bobScore++
            // Server Selection
            !serverIsA && s[i] == 'A' -> serverIsA = true
            serverIsA && s[i] == 'B' -> serverIsA = false
        }
    }
    return "$aliceScore $bobScore"
}
