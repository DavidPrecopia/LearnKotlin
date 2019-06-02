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

    print("Your birthday: ")
    // If `readLine()` does not return null, pass its return to `getBirthday()`
    val birthday = readLine()?.let { getBirthday(it) }

    // Because `readLine()` could return null, birthday might be null.
    // If birthday is not null, return birthday, otherwise return 0.
    println(getFortuneCookie(birthday ?: 0))


    // foo does not explicitly declare a return type, thus it returns Unit.
    // This prints: kotlin.Unit
    println(foo())
}

fun foo() {
    println("testing")
}


// Do not need to check for null because String is not null
fun getBirthday(it: String) = it.toInt()

private fun everythingIsAnExpression(timeOfDay: Int) {
    println("God ${if (timeOfDay > 12) "morgen" else "dag"}, Kotlin!")
}


private val fortunes = listOf("fortune0", "fortune1", "fortune2", "fortune3", "fortune4", "fortune5", "fortune6")

private fun getFortuneCookie(birthdayDay: Int): String {
    println("Birthday parameter is: $birthdayDay")
    return fortunes[birthdayDay.rem(fortunes.size)]
}
