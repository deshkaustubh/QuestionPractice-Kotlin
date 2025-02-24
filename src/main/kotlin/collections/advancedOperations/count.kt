package collections.advancedOperations

// Used to count the number of elements in a collection that match a given predicate / condition
// overall time complexity O(n)
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // Count the number of even numbers in the list
    val evenCount = numbers.count { it % 2 == 0 }

    println("The number of even numbers in the list: $evenCount")
}
/*
In this example,
the count function iterates through the list numbers and counts how many elements satisfy the condition it % 2 == 0
(i.e., the number is even). The result is then printed out,
showing the count of even numbers in the list.
 */