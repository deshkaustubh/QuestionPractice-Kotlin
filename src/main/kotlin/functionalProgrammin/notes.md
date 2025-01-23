# Functional Programming Notes

### Chunked
* The chunked function splits a string into chunks of the specified size and returns a list of strings.
* Since  it returns a list of Strings incase if you need string use joinToString this creates a string with default separator ','  which can also be changed.

### Zip
* The zip function in Kotlin is a powerful tool used to merge two collections into a single collection of pairs. This function combines elements from both collections based on their positions, creating pairs where the first element is from the first collection and the second element is from the second collection.
* For example, if s = "abc" and t = "abd", the zip function produces [(a, a), (b, b), (c, d)]

### Windowed
* The windowed function creates windows of a specified size from the original collection or string.
* Each window is a list containing elements from the original collection.
* You can specify a step parameter to control the step size between windows, which determines the overlap.
* Example 
  * val numbers = listOf(1, 2, 3, 4, 5)
  * val windows = numbers.windowed(3, step = 2)
  * println(windows)  // Output: [[1, 2, 3], [3, 4, 5]]
* If you want to include a window that is smaller than the specified size you have to use partial window = true 
* Example -> val windows = numbers.windowed(3, partialWindows = true)