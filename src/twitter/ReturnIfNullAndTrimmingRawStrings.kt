package twitter

fun main() {
    rawStrings()
    ifValueIsNull()
    ifValueIsNullThrowException()
}


/**
 * Simplify handling of "if value is null, return".
 */
private fun ifValueIsNull() {
    val x = computeX() ?: return
    println(x)
}

/**
 * Throw an Exception if value is null
 */
private fun ifValueIsNullThrowException() {
    // This will thrown a NPE.
    val y = computeX()!!

    // This way you can specify the exception that will be thrown.
    val x = computeX() ?: throw IllegalArgumentException("Value cannot be null")

    println("$x and $y")
}


private fun computeX(): String? = "Result"


/**
 * Raw String and trimIndent() and trimMargin().
 * Raw Strings let you type a String without escape characters.
 *
 * Both of the method produce the same result and the docs
 * are unclear on how they differ.
 */
private fun rawStrings() {
    val indent =
            """
Coding in Flow
        and wiseAss
    """.trimIndent()

    val margin = """Coding in Flow
        and wiseAss
    """.trimMargin()

    listOf(indent, margin).forEach { println(it) }
}