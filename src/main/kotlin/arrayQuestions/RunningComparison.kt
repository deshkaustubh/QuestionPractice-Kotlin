package org.example.arrayQuestions

/*
Running Comparison
Alice and Bob recently got into running, and decided to compare how much they ran on different days.

They each ran for
N
N days — on the
i
t
h
i
th
  day, Alice ran
A
i
A
i
​
  meters and Bob ran
B
i
B
i
​
  meters.

On each day,

Alice is unhappy if Bob ran strictly more than twice her distance, and happy otherwise.
Similarly, Bob is unhappy if Alice ran strictly more than twice his distance, and happy otherwise.
For example, on a given day

If Alice ran
200
200 meters and Bob ran
500
500, Alice would be unhappy but Bob would be happy.
If Alice ran
500
500 meters and Bob ran
240
240, Alice would be happy and Bob would be unhappy.
If Alice ran
300
300 meters and Bob ran
500
500, both Alice and Bob would be happy.
On how many of the
N
N days were both Alice and Bob happy?

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of three lines of input.
The first line of each test case contains a single integer
N
N — the number of days.
The second line of each test case contains
N
N space-separated integers
A
1
,
A
2
,
…
,
A
N
A
1
​
 ,A
2
​
 ,…,A
N
​
  — the distances run by Alice on the
N
N days.
The third line of each test case contains
N
N space-separated integers
B
1
,
B
2
,
…
,
B
N
B
1
​
 ,B
2
​
 ,…,B
N
​
  — the distances run by Bob on the
N
N days.
Output Format
For each test case, output on a new line the number of days when both Alice and Bob were happy.
 */

// !!! STRICTLY MORE DISTANCE
fun main () {
    val t = readln().toInt()
    repeat (t) {
        val n = readln().toInt()
        val aliceDistance = readln().split(" ").map { it.toInt() }
        val bobDistance = readln().split(" ").map { it.toInt() }

        checkHappyOrNotunHappy(n, aliceDistance, bobDistance)
    }
}

fun checkHappyOrNotunHappy (n: Int, aliceDistance: List<Int>, bobDistance: List<Int>) {
    //var aliceIsHappy = false
    //var bobIsHappy = false
    var happyCount = 0

    for ( i in 0 until n) {
        if (aliceDistance[i] <= 2 * bobDistance[i] && bobDistance[i] <= 2 * aliceDistance[i] ) {
            happyCount++
        }
    }
    println(happyCount)
}

