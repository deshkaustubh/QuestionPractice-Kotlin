# Functional Programming Notes

### Chunked
* The chunked function splits a string into chunks of the specified size and returns a list of strings.
* Since  it returns a list of Strings incase if you need string use joinToString this creates a string with default separator ','  which can also be changed.

### Zip
* The zip function in Kotlin is a powerful tool used to merge two collections into a single collection of pairs. This function combines elements from both collections based on their positions, creating pairs where the first element is from the first collection and the second element is from the second collection.
* For example, if s = "abc" and t = "abd", the zip function produces [(a, a), (b, b), (c, d)]