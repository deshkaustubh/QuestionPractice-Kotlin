package org.example.stringQuestions

/*
World Chess Championship
The World Chess Championship
2022
2022 is about to start.
14
14 Classical games will be played between Chef and Carlsen in the championship, where each game has one of three outcomes — it can be won by Carlsen, won by Chef, or it can be a draw. The winner of a game gets
2
2 points, and the loser gets
0
0 points. If it’s a draw, both players get
1
1 point each.

The total prize pool of the championship is
100
⋅
X
100⋅X. At end of the
14
14 Classical games, if one player has strictly more points than the other, he is declared the champion and gets
60
⋅
X
60⋅X as his prize money, and the loser gets
40
⋅
X
40⋅X.

If the total points are tied, then the defending champion Carlsen is declared the winner. However, if this happens, the winner gets only
55
⋅
X
55⋅X, and the loser gets
45
⋅
X
45⋅X.

Given the results of all the
14
14 games, output the prize money that Carlsen receives.

The results are given as a string of length
14
14 consisting of the characters C, N, and D.

C denotes a victory by Carlsen.
N denotes a victory by Chef.
D denotes a draw.
Input Format
The first line of input contains an integer
T
T, denoting the number of test cases. The description of
T
T test cases follows.
The first line of each test case contains one integer
X
X, denoting that the total prize pool is
100
⋅
X
100⋅X.
The second line contains the results of the match, as a string of length
14
14 containing only the characters C, N, and D.
Output Format
For each test case, output in a single line the total prize money won by Carlsen.
 */

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()

    repeat(t) {
        val x = sc.nextInt()
        val s = sc.next()
        println(calculatePrize(x, s))
    }
}

fun calculatePrize(x: Int, s: String): Int {
    var c = 0
    var n = 0
    var d = 0
    for (i in s.indices) {
        when (s[i]) {
            'C' -> c++
            'N' -> n++
            else -> d++
        }
    }
    return when {
        c > n -> 60 * x
        c == n -> 55 * x
        else -> 40 * x
    }
}
