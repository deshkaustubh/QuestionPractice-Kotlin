package org.example.functionalProgrammin


fun titleCase(s:String): String  {
    return s.split(" ").joinToString(" ") { word->
        if (word.length == 1) {
            word.uppercase()
        } else if(word == word.uppercase()) {
            word
        } else {
            word[0].uppercaseChar() + word.substring(1).lowercase()
        }
    }
}



fun main() {
    val t = readln().toInt()
    repeat(t) {
        val s = readln()
        println(titleCase(s))
    }
}

//fun convertToTitleCase(s: String): String {
//    return s.split(" ").joinToString(" ") { word ->
//        if (word.all { it.isUpperCase() }) {
//            word // Keep acronyms unchanged
//        } else {
//            word.toLowerCase().capitalize() // Convert to title case
//        }
//    }
//}
