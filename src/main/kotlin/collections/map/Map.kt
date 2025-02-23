package collections.map

// Map data structure is a list of pair pair<K,V> where K and V can be any data  type

// each pair is = entry
// first value -> key || second value -> value

fun main() {
    // Create the map
    val dobsMap = mapOf(
        "A" to "1/1/2001",
        "B" to "1/2/2002",
        "C" to "1/1/2003"
    )

    // Input name
    print("Enter name of person : ")
    val name = readln()

    // Retrieve DOB
    val dob = dobsMap[name]

    // Handle found / not found case
    if (dob != null) {
        println("DOB of $name = $dob")
    } else {
        println("DOB of $name not found!")
    }
}
// need for map -> uses hashing so that time complexity is O(1)