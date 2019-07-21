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


    // Inclusive
    for (i in 1..10) println(i)

    // Exclusive
    for (x in 1 until 10) println(x)

    // downTo - Inclusive
    for (x in 10 downTo 0) println(x)

    // step - skip X number of steps
    for (x in 'a'..'z' step 5) println(x)

    // You can also uses a List's indices function
    // to get a Range.
    for (x in loopList.indices) print(x)
}