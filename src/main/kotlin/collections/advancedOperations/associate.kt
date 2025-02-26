package collections.advancedOperations

/*
Given each list item, we compute both key and value for its corresponding map entry.

SYNTAX:
    list.associate{item-> ..returns pair..}
 */

fun main() {
    associateExample()
    println()
    associateExampleOOPS()
}

fun associateExample() {
    val list = listOf(
        "A | 1", "B | 2", "C | 3"
    )

    val map = list.associate {
        val (key, value) = it.split(" | ")
        key to value.toInt()
    }

    println(map)
}

data class Person(
    val id: String,
    val name: String
)

fun associateExampleOOPS() {
    val persons = listOf(
        Person("A1", "Alpha"),
        Person("B1", "Beta")
    )

    val idToNameMap = persons.associate {
        it.id to it.name
    }

    println(idToNameMap)
}