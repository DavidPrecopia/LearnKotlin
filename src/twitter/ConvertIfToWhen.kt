package twitter

/**
 * Alt + Enter to convert an if-expression to a when-expression.
 * https://twitter.com/kotlin/status/1144251537683705856?s=12
 */
fun main() {
    print("Number of points: ")
    val points = readLine()?.toInt() ?: 0

    val size = if (points > 50) "winner" else "looser"
    // Need to place cursor on `if` keyword.
    // This if-expression becomes:
    val sizeWhen = when {
        points > 50 -> "winner"
        else -> "looser"
    }
}