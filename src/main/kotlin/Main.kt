//n = array length
// x = magical number

fun main () {
    val t = readln().toInt()
    repeat(t) {
        val(n , x) = readln().split(" ").map {it.toInt() }
        val elements = readln().split(" ").map {it.toInt() }
        println(StreakStar(elements, x))
    }
}

fun StreakStar(elements: List<Int>, y: Int): Int {
    //val elements = givenElements.toString()
    var x = y
    var count = 0
    for (i in elements) {
        count++
        if (i < i - 1) {
            if (i * x < i -1 && i*x > i + 1) continue
            else if(i * x > i -1 && i*x < i + 1) {
                count++
                x = 1
            }
            else if(i*x < i + 1) {
                count ++
                x = 1
            }
        } else {
            count = 0
        }
    }
    return count
}