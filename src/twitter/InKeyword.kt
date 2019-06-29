package twitter

class InKeyword()

/**
 * https://try.kotlinlang.org/#/Examples/Basic%20syntax%20walk-through/Use%20ranges%20and%20in/Use%20ranges%20and%20in.kt
 */
fun main() {
    val myList = mutableListOf<Int>()
    // Iterate over a range
    for (x in 0..50) {
        myList.add(x)
    }

    // Check is a Collection contains a specific value.
    if (30 in myList) {
        println("Contains 30")
    }
}

// Check is something lies within a range
private fun Int.isGreaterThan10OrLessThanZero() = this !in 0..10

/**
 * Instead of `!in`, IntellijJ recommends `util`.
 * `util` is a function of all Numbers.
 * `util` returns a range from this value <em>up to, but excluding,</em> the specified to value.
 */
private fun <T> isInvalidRange(list: List<T>, index: Int) = index !in 0.until(list.size)