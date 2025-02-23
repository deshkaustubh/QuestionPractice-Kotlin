package collections.map

// Map  -> Immutable maintains orders of pairs [
// mapOf(......)
// emptyMap<K,V> ()
// ]

// Mutable Map -> mutable, does not maintain order of pairs [
// map.toMutableMap()
// mutableMapOf<K,V>() -> Empty
// mutableMapOf(.....)
// ]

// Hash Map -> Mutable, does not maintain order of pairs[
// hashMapOf<K,V>() -> Empty
// hashMapOf(.....)
//]


fun main() {
    val grades = mapOf(
        "A+" to 10,
        "A" to 9,
        "B" to 8,
        "C" to 7,
        "D" to 6
    )
    println(grades)
}

// Output : {A+=10, A=9, B=8, C=7, D=6}
