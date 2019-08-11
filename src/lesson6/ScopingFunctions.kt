package lesson6


/**
 * References:
 * https://youtu.be/-Lha9n8VJf0
 * https://kotlinlang.org/docs/reference/scope-functions.html
 *
 * THESE NOTES ARE OLD - SEE EVERNOTE AND REFS.
 */


/**
 * with() {  }
 * - Unlike the others, a value is passed to it.
 * - Returns the result of executing the lambda.
 *
 * Value is given via an argument.
 * You could use `run` instead of `with` - `run` is more concise.
 */
private fun withExample(developer: Developer) = with(developer) { Person(name, age) }

/**
 * run {  }
 * - Returns the result of executing the lambda.
 *
 * In this example, the if-else expression is executed and the result is returned.
 */
private fun runExample() {
    val dev1 = Developer("Drew", 22)
    val dev2 = Developer("David", 26)

    // Instead of,
    val olderDev = if (dev1.age > dev2.age) dev1 else dev2
    olderDev.printDev()
    // Use this,
    run {
        if (dev1.age > dev2.age) dev1 else dev2
    }.printDev()
}

/**
 * `with` and `run` are the same (basically) - use `run` because it is more concise.
 */


/**
 * let { }
 * - Unlike `with` and `run`, the `let` accepts a function instead of a receiver.
 * - Commonly used to execute a function if the receiver is not null.
 */

/**
 * apply {  }
 * - Always returns the receiver.
 * - Very useful.
 */
private fun applyExample() = Developer("Amit Shekhar", 22).apply {
    printDev()
}


private data class Developer(val name: String, val age: Int) {
    fun printDev() = println(this)
}

private data class Person(val name: String, val age: Int)


fun main() {
    println(myWith("hyggelig") { toUpperCase() })

    println(
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0).divisibleByThree { it.rem(3) == 0 }
    )
}

fun myWith(name: String, block: String.() -> String): String {
    return name.block()
}

private fun List<Int>.divisibleByThree(block: (Int) -> Boolean) = filter { block(it) }