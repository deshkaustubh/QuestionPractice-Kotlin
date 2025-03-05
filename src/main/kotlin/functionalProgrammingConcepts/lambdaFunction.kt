package functionalProgrammingConcepts

// Functions defined using fun keyword are called named functions


// Lambda function to calculate the square of a number


fun main() {
    // Lambda function to calculate the square of a number
    val square: (Int) -> Int = { x -> x * x }

    // Using the lambda function
    val result = square(5)
    println(result) // Output: 25

    // Higher-order function that takes a lambda as a parameter
    fun <T, R> List<T>.map(transform: (T) -> R): List<R> {
        val result = ArrayList<R>()
        for (item in this) {
            result.add(transform(item))
        }
        return result
    }

    // Using a lambda with the higher-order function
    val numbers = listOf(1, 2, 3, 4, 5)
    val squares = numbers.map { it * it }
    println(squares) // Output: [1, 4, 9, 16, 25]
}
