package collections.advancedOperations

/*
Compute value for list item, with the corresponding map entry, where list item itself is the key

SYNTAX:
    list.associateWith { item -> .. return value .. }
 */

fun main() {
    associateWith()
}

fun associateWith() {
    val names = listOf(
        "Apple", "Google", "Microsoft"
    )

    val nameToNoOfVowelsMap = names.associateWith {
        it.noOfVowels()
    }

    println(nameToNoOfVowelsMap)
}

// Counts the number of vowels in a String
fun String.noOfVowels(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u')
    return lowercase()
        .toCharArray()
        .count { it in vowels }
}

data class Order(
    val id: String,
    val amount: Int
)

data class People(
    val id: String,
    val name: String,
    val orders: List<Order>
)

fun associateWithOOPS() {
    val people = listOf(
        People(
            id = "A1",
            name = "Alpha",
            orders = listOf(
                Order("O1", 100),
                Order("O2", 500),
            )
        ),
        People(
            id = "B1",
            name = "Beta",
            orders = listOf(
                Order("O3", 50),
                Order("O4", 1000),
            )
        )
    )

    val personToOrdersTotalMap = people.associateWith { person ->
        person.orders.sumOf { it.amount }
    }

    println(personToOrdersTotalMap)
}