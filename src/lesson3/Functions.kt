package lesson3

import java.util.*

// main's parameters where removed in v1.3
// args: Array<String>
fun main() {
    // Exclusive bound
    // This is how you loop
    for (i in 1..5) {
        everythingIsAnExpression(Random().nextInt(25))
    }

    printFortune()

    // foo does not explicitly declare a return type, thus it returns Unit.
    // This prints: kotlin.Unit
    println(foo())
}


private fun everythingIsAnExpression(timeOfDay: Int) = println("God ${if (timeOfDay > 12) "morgen" else "dag"} Kotlin!")


private val fortunes = listOf("fortune0", "fortune1", "fortune2", "fortune3", "fortune4", "fortune5", "fortune6")

private fun printFortune() = println("Birthday fortune: ${fortunes[getBirthday().rem(fortunes.size)]}")

private fun getBirthday(): Int {
    print("Enter your Birthday's day: ")
    // If readLine does not return null, covert to Int - otherwise, return 0.
    return readLine()?.toInt() ?: 0
}


fun foo() {
    println("testing")
}
