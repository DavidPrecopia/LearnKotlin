package lesson5

/**
 * If the `check` expression evaluates to false,
 * an IllegalStateException is thrown with the provided message.
 */
fun main() {
    check(true) { "This will not be thrown" }

    try {
        check(false) { "This will be thrown" }
    } catch (e: IllegalStateException) {
        println(e.toString())
    }
}