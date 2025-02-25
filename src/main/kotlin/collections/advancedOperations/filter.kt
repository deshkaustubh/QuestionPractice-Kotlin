package collections.advancedOperations

/*
Used to filter a list based on specified predicate and create a new list using the filter() function

SYNTAX:
    coll.filter{..predicate..}
 */

fun main() {
    val nums = -2..2
    val negatives = nums.filter { it < 0 }
    println(negatives)
}