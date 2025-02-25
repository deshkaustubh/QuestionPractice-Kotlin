package collections.advancedOperations

/*
To transform all elements of a list and create a new list using the map() function:
SYNTAX:
    coll.map{/* Return a new value */}
 */

fun main() {
    println("Use of Map")
    useOfMap()
    println()
    println("Transform all Keys of a Map")
    transformAllKeysOfAMap()
    println()
    println("Transform all Values of a Map")
    transformAllValuesOfAMap()
    println()
    println("Transform all Entries of a Map")
    transformAllEntriesOfAMap()
}

fun useOfMap() {
    val nums = 1..5
    val squares = nums.map{it* it}
    println(squares)
}

fun transformAllKeysOfAMap() {
    var map = mapOf(
        "apple" to 2f,
        "micorosoft" to 1.8f,
        "fanngX" to 1.7f
    )
    map = map.mapKeys { it.key.uppercase() }
    println(map)
}

fun transformAllValuesOfAMap() {
        val map = mapOf(
            "apple" to 2f,
            "micorosoft" to 1.8f,
            "fanngX" to 1.7f
        )
        val newMap = map.mapValues { "$ ${it.value} Trillion" }
        println(newMap)
}

fun transformAllEntriesOfAMap() {
    var mapTransform = mapOf(
        "apple" to 2f,
        "micorosoft" to 1.8f,
        "fanngX" to 1.7f
    )

    val newMap = mapTransform.map{
        it.key.uppercase() to "${it.value} Trillion"
    }.toMap()

    println(newMap)
}