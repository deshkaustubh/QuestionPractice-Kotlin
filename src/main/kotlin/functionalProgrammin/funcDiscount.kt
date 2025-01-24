package org.example.functionalProgrammin

import org.example.arrayQuestions.readInt
import org.example.arrayQuestions.readInts


fun takeCoupon(n: Int, x: Int, y: Int, listA : List<Int>): Boolean {
    val originalCost = listA.sum()
    val discountedCost = listA.sumOf { if (it <= y) 0 else it - y }
    return x + discountedCost < originalCost
}

fun main() {
    val t = readInt()
    repeat(t) {
        val (n, x, y) = readInts()
        val listA = readInts()
        println(takeCoupon(n, x, y, listA))
    }
}

//fun solve(n : Int, x : Int, y : Int, listA : List<Int>) {
//    val originalCost = listA.sum()
//    val discountedCost = listA.map { if (it <= y) 0 else it -y }.sum()
//    val withCouponCost = x + discountedCost
//
//    if (withCouponCost < originalCost) println("Coupon")
//    else println("No Coupon")
//}
//
//fun readInt() = readln().toInt()
//fun readInts(): List<Int> = readln().split(" ").map { it.toInt() }