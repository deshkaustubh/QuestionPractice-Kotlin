package org.example.functionalProgrammin

import org.example.stringQuestions.wordleUsingBuildString


fun funcWordle(s:String, t: String): String {
    return s.zip(t).map { (sI, tI)->
        if (sI == tI) 'G' else 'B'
    }.joinToString ("")
}


fun main () {
    val t = readln().toInt()

    repeat(t) {
        val s = readln()
        val t = readln()

        println(funcWordle(s, t))
    }
}

//fun Wordle (S: String, T: String): String {
//    var M = ""
//    for ( i in S.indices){
//        if( S[i] == T[i]) M += "G"
//        else M += "B"
//    }
//    return M
//}