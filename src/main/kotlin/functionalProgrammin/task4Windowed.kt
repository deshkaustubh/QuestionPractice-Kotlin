package org.example.functionalProgrammin

fun main() {
    val givenString = "00101110"
    println(iterativeWindowed(givenString, 3, ))
    println(windowed(givenString, 3, ))
}

fun windowed(string: String, size: Int, step: Int = 1): List<String> {
    return string.windowed(size, step = step)
}

//OUTPUT -> [00, 01, 10, 01, 11, 11, 10]

fun iterativeWindowed(string: String, size: Int, step: Int = 1): List<String> {
    val outputList = mutableListOf<String>()


    var counter = 0

    while( counter != string.length - step) {
        var tempString = ""
        var tempInt = counter
        repeat(size) {
            if(tempInt < string.length) {
                tempString += string[tempInt]
                tempInt++
            }
        }
        if(tempString.length == 3)  outputList.add(tempString)
        counter += step
    }
    return outputList
}