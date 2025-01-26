package org.example.functionalProgrammin


fun main() {
    val givenString = "00101110"
    println(iterativeChunked(givenString))
}

fun chunkedString(string: String): List<String> {
    return string.chunked(2)
}

// Output: [00, 10, 11, 10]

fun iterativeChunked(string: String): List<String> {
    val outputList = mutableListOf<String>()
    var tempString = ""
    for (num in string.indices) {
        tempString += string[num]
        if(tempString.length == 2) {
          outputList.add(tempString)
            tempString = ""
        }
    }
    if (tempString.isNotEmpty()) {
        outputList.add(tempString)
    }
    return outputList
}


