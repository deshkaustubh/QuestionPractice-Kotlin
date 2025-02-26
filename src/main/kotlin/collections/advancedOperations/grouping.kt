package collections.advancedOperations

/*
We can group a list of data based on a parameter. Parameter may be a field
( if we have list of objects) or it can be a computed parameter. Grouping
operation creates a Map where key is the parameter, and we choose & value is
the list of all the list items matching that particular parameter. We use the
groupBy() function to perform grouping on a list.

SYNTAX
    list.groupBy { item -> .. return parameter .. }
 */

fun main() {
    simpleGrouping()
    println()
    OOPsGrouping()
}

fun simpleGrouping() {
    val text = "Hail Hydra 4 ever !"
    val occurrences = text
        .groupBy {
            when {
                it.isLetter() -> "Alphabets"
                it.isDigit() -> "Digits"
                else -> "Other"
            }
        }.mapValues {
            it.value.count()
        }

    println(occurrences)
}


enum class Gender { Male, Female, Other }

data class Peon(
    val name: String,
    val gender: Gender
) {
    override fun toString() = name
}

fun OOPsGrouping() {
    val persons = listOf(
        Peon("Alpha", Gender.Male),
        Peon("Beta", Gender.Female),
        Peon("Alpha1", Gender.Male),
        Peon("Beta1", Gender.Female),
        Peon("Gamma", Gender.Other)
    )

    val genderToPersonsMap = persons.groupBy { it.gender }

    println(genderToPersonsMap)
}