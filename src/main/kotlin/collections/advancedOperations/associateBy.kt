package collections.advancedOperations


/*
List item, itself is the value
SYNTAX:
    list.associateWidth{ item-> ..return key.. }
 */
fun main() {
    associateBy()
    associateByOOPS()
}

fun associateBy() {
    val names = listOf(
        "Apple", "Boat", "Coat"
    )
    val initialToNameMap = names.associateBy {
        it[0]
    }
    println(initialToNameMap)
}


fun associateByOOPS() {
    val persons = listOf(
        Person("A1", "Alpha"),
        Person("B1", "Beta")
    )
    val idToPersonMap = persons.associateBy { it.id }
    println(idToPersonMap)
}