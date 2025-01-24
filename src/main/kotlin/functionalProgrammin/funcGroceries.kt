package org.example.functionalProgrammin


fun funcGroceriesCost(n: Int, x:Int, freshness: List<Int>, costs: List<Int>): Int {
    return costs.foldIndexed(0) {i, sum, cost ->
        if (freshness[i] >= x) sum + cost else sum
    }
}

fun main() {
    val t = readln().toInt()
    repeat(t){
        // t-> Test Cases
        // n-> no of items
        // x -> minimum freshness
        val(n , x) = readln().split(" ").map {it.toInt() }
        val freshnessValue = readln().split(" ").map {it.toInt() }
        val costsPerItem = readln().split(" ").map {it.toInt() }

        funcGroceriesCost(n, x, freshnessValue, costsPerItem)
    }
}

//fun cost (n: Int, x: Int, freshnessValue: List<Int>, costsPerItem: List<Int>) {
//    var totalCost = 0
//
//    for (i in 0 until n) {
//        if (freshnessValue[i] >= x) totalCost += costsPerItem[i]
//    }
//    println(totalCost)
//}