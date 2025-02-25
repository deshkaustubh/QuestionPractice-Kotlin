package collections.advancedOperations

/*
Used to perform operations on collections to accumulate a single value out of it
SYNTAX
    coll.reduce {acc, i, -> return computed value }
        here acc ==> Accumulated Value
             i ==> current item, this lambda here computes the new value and returns it

     NOTE: For the first iteration acc is taken as 0 to explicitly specify another value for initial acc, you can use fold() function
     SYNTAX:
        coll.fold( ..initial acc....) {acc, i, -> ... return computed value...}
 */

fun reduceFunction() {
    val digits = listOf(3, 4, 2, 1)

    val num = digits.reduce{ acc, i ->
        acc * 10 + i
    }
    println(num)
}

fun foldFunction(){
    val digits = listOf(1, 2, 3, 4, 5)
    val initialAcc = 10
    val sum = digits.fold(initialAcc) { acc, i ->
        acc + i
    }
    print(sum)
}

fun main() {
    reduceFunction()
    foldFunction()
}