package org.example.functionalProgrammin


fun funcRunningComparison(aliceDistance: List<Int>, bobDistance: List<Int>): Int {
    return aliceDistance.zip(bobDistance).count{(a,b) -> a<= 2 * b && b <= 2 * a}
}


fun main () {
    val t = readln().toInt()
    repeat (t) {
        val n = readln().toInt()
        val aliceDistance = readln().split(" ").map { it.toInt() }
        val bobDistance = readln().split(" ").map { it.toInt() }

        funcRunningComparison(aliceDistance, bobDistance)
    }
}

//fun checkHappyOrNotunHappy (n: Int, aliceDistance: List<Int>, bobDistance: List<Int>) {
//    //var aliceIsHappy = false
//    //var bobIsHappy = false
//    var happyCount = 0
//
//    for ( i in 0 until n) {
//        if (aliceDistance[i] <= 2 * bobDistance[i] && bobDistance[i] <= 2 * aliceDistance[i] ) {
//            happyCount++
//        }
//    }
//    println(happyCount)
//}