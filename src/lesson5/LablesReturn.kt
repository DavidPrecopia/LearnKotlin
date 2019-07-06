package lesson5

fun main() {
    println("\nNormal behavior")
    normalBehavior()
    println("\nReturn label")
    labeledReturn()

    println("\nExample from SO")
    println(foo(listOf(1, -1, 1))) // []
    println(foo(listOf(1, 0, 1))) // ["number 1", "zero", "number 1"]
}

/**
 * Normally, `return` will return, and thus kill, the outer function.
 *
 * The println at the bottom is unreachable because once `it` reaches
 * 2, the entire function will be killed.
 */
private fun normalBehavior() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 2) return
        println(it)
    }
    println("This is unreachable")
}


/**
 * The println is now reachable because the return will only
 * from the lambda.
 *
 * You have explicit and implicit return labels.
 */
private fun labeledReturn() {
    listOf(1, 2, 3, 4, 5).forEach iteration@{
        if (it == 2) return@iteration
        println(it)
    }
    println("Now this will print")

    // NOTICE: in this lambda, I do not declare a label,
    // instead, I am referencing the </em>name of the function</em>.
    // This is an implicit label.
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 1) return@forEach
        println(it)
    }
}


/**
 * Example from: https://stackoverflow.com/a/40166597
 */
private fun foo(ints: List<Int>): List<String> {
    return ints.map f@{
        if (it == 0) return@f "zero" // return at named label
        if (it == -1) return emptyList() // return at foo
        "number $it" // expression returned from lambda
    }
}