package collections.advancedOperations

/*
To tackle exception thrown in case of index out of bounds

 -> getOrNull() : returns element at specified index (if found ) if not returns null
 -> getOrElse() : if found returns element at specified index if not executes given code lock

SYNTAX
    coll.getOrNull()
    coll.getOrNull() ?: defaultValue -> Default Value is returned in case of null [?: -> Elvis Operator]
    coll.getOrElse() { Code to execute, return default value} -> Executes the lambda in case of null
 */

fun main() {
//    println("In List and Array")
//    safeGetInListAndArray()
//    println()
//    println("In Map")
    safeGetInMap()
}

fun safeGetInListAndArray() {
    val nums = listOf(1, 2, 3)

    // typeof x = Int?
    val x = nums.getOrNull(3)

    // typeof y = Int (Default value provided)
    val y = nums.getOrNull(3) ?: -1

    // typeof z = Int (Default value provided)
    val z = nums.getOrElse(3) {
        println("z: nums[$it] not found!")
        0 // Default value
    }

    println("""
        x = $x
        y = $y
        z = $z
    """.trimIndent())
}

/*
In map null is returned when given key is not found in the map, to handle this :
    getOrDefault(key , default value) ==> returns value if found if not returns default value
    getOrElse() {Code to execute, returned as default} ==> returns value if found if not executes code block
 */

fun safeGetInMap() {
    val map = mapOf(
        "A" to 1, "B" to 2, "C" to 3
    )

    val a = map["G"] // Type : Int?

    val b = map.getOrDefault("E", "default Value") // Type : Int

    val d = map.getOrElse("D") {
        println("D not found!")
        -1 // Default value
    }

    println("""
        a = $a
        b = $b
        d = $d
    """.trimIndent())
}

