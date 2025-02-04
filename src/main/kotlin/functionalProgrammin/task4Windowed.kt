package org.example.functionalProgrammin

//fun iterativeWindowed(string: String, size: Int, step: Int = 1): List<String> {
//    val outputList = mutableListOf<String>()
//
//
//    var counter = 0
//
//    while( counter != string.length - step) {
//        var tempString = ""
//        var tempInt = counter
//        repeat(size) {
//            if(tempInt < string.length) {
//                tempString += string[tempInt]
//                tempInt++
//            }
//        }
//        if(tempString.length == size)  outputList.add(tempString) // This is because by default windowed omits if in case elements are less than the specified size but this can be changed if you set partialWindows to true
//        counter += step
//    }
//    return outputList
//}


fun windowed(string: String, size: Int, step: Int = 1): List<String> {
    return string.windowed(size, step = step)
}

// Target 1-> use buildList and buildString
//        2-> concise and readable code

fun iterativeWindowed(string: String, size: Int, step: Int = 1): List<String> {
    return buildList {
            var i = 0
            while (i <= string.length-size) {
        buildString {
                repeat(size) {
                    append(string[i + it])
                }
            add(toString())
            }
                i += step
        }
    }
}

fun main() {
    val givenString = "00101110"
    println(iterativeWindowed(givenString, 3))
    println(windowed(givenString, 3))
}

//OUTPUT -> [00, 01, 10, 01, 11, 11, 10]



