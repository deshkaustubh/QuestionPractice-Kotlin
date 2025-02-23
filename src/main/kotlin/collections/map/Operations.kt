package collections.map

fun main() {
    val grades = mutableMapOf(
        "A+" to 10,
        "A" to 9,
        "B" to 8,
        "C" to 7,
        "D" to 6
    )

    println("Access and Entry: ")
    println(grades["A+"]) // Prints 10
    println(grades.get("A")) // Prints 9

    println()
    println("Iteration: ")
    for ((key, value) in grades) {
        println("grades [$key] = $value")
    }

    println()
    println("Adding a new Entry: ")
    grades["E"] = 5
    grades.put("F", 4)
    println(grades)

    println()
    println("Check for entry: ")
    println(grades.containsKey("G"))
    println(grades.containsValue(4))

    println()
    println("Remove an Entry: ")
    grades.remove("F")
    print(grades)
}