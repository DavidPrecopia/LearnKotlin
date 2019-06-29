package twitter

/**
 * Use !is and !in - the counterparts of is and in operators
 * https://twitter.com/kotlin/status/1143451265000759296?s=12
 *
 * @see InKeyword
 *
 */
fun main() {
    println("in: ${'5'.isADigit()} -- ${'A'.isADigit()}")
    println("!in: ${'5'.isNotADigit()} -- ${'A'.isNotADigit()}")

    val someValue = "some string"
    println("is ${someValue is String}")
    println("!is ${someValue !is Nothing}")
}

private fun Char.isADigit() = this in '0'..'9'
private fun Char.isNotADigit() = this !in '0'..'9'
