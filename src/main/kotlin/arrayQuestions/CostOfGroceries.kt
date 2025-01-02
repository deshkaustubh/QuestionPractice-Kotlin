package org.example.arrayQuestions

/*
st of Groceries
Chef visited a grocery store for fresh supplies. There are
N
N items in the store where the
i
t
h
i
th
  item has a freshness value
A
i
A
i
​
  and cost
B
i
B
i
​
 .

Chef has decided to purchase all the items having a freshness value greater than equal to
X
X. Find the total cost of the groceries Chef buys.

Input Format
The first line of input will contain a single integer
T
T, denoting the number of test cases.
Each test case consists of multiple lines of input.
The first line of each test case contains two space-separated integers
N
N and
X
X — the number of items and the minimum freshness value an item should have.
The second line contains
N
N space-separated integers, the array
A
A, denoting the freshness value of each item.
The third line contains
N
N space-separated integers, the array
B
B, denoting the cost of each item.
Output Format
For each test case, output on a new line, the total cost of the groceries Chef buys.
 */

fun main() {
    val t = readln().toInt()
    repeat(t){
        // t-> Test Cases
        // n-> no of items
        // x -> minimum freshness
        val(n , x) = readln().split(" ").map {it.toInt() }
        val freshnessValue = readln().split(" ").map {it.toInt() }
        val costsPerItem = readln().split(" ").map {it.toInt() }

        cost(n, x, freshnessValue, costsPerItem)
    }
}

fun cost (n: Int, x: Int, freshnessValue: List<Int>, costsPerItem: List<Int>) {
    var totalCost = 0

    for (i in 0 until n) {
        if (freshnessValue[i] >= x) totalCost += costsPerItem[i]
    }
    println(totalCost)
}