package collections

// Pair is a data structure that stores related values A and B of a common type

fun main() {
    val pair = Pair("Jan", 31) // Pair<String, Int>
    // OR
    val pair1 = "Jan" to 31
    println(pair) // Prints (Jan, 31)
}