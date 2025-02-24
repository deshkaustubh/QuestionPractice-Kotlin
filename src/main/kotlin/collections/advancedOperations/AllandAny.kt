package collections.advancedOperations

/* used to check a condition,
all -> returns true only if condition holds true for all elements ===> coll.all{.....}
any -> returns true if predicate holds true for at least one element ===> col.any{.....}
*/

fun main() {
    val nums = listOf(-1, 0, 1)
    println("all > 0 ? ${nums.all { it > 0 }}") //OUTPUT = false
    println("at least one > 0 ? ${nums.any { it > 0 }}") // OUTPUT = true
}

// Special case: When collections is empty, all() returns true and any() returns false