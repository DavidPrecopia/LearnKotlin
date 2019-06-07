package lesson3

fun main() {
    val loopList = listOf(0, 1, 2, 3)
    for (element in loopList) {
        // for-each loop
    }

    for (i in 0..100) {
        // i will hold 0 through 100
    }

    // times to repeat, function to run
    repeat(5) {
        println("this is what should repeat")
    }
}