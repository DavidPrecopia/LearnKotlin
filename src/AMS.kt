import java.util.*

val daysOfTheWeek = listOf("Monday", "Tuesday", "Wednesday","Thursday", "Friday")
val food = listOf("Pellets", "Beef", "Chipotle", "Five Guy\'s", "Burgers")

fun main() {
    val today = getRandomDay()
    val food = getFood(today)
    feedFish(today, food)
}

private fun feedFish(day: String, food: String) {
    println("Today is $day and the fish will eat $food")
}


private fun getRandomDay(): String {
    // The bound of 5 is exclusive.
    return daysOfTheWeek[Random().nextInt(5)]
}

private fun getFood(today: String) = when (today) {
    daysOfTheWeek[0] -> food[0]
    daysOfTheWeek[1] -> food[1]
    daysOfTheWeek[2] -> food[2]
    daysOfTheWeek[3] -> food[3]
    daysOfTheWeek[4] -> food[4]
    else -> throw IllegalArgumentException()
}
