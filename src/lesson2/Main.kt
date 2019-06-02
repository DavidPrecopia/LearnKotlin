package lesson2

fun main() {
    val startingFishes = 2.0
    printMessage("Starting: ${startingFishes.toInt()}")

    val breed1 = startingFishes.multiply(71.0)
    printMessage("${breed1.toInt()}")

    val breed2 = breed1.multiply(233.0)
    printMessage("${breed2.toInt()}")

    val spiser = breed2.eatFish(13)
    printMessage("Number left: ${spiser.toInt()}")

    printMessage("Needed number of aquariums: ${spiser.numberOfAquariums(30)}")

    printMessage("Their solution: ${2.plus(71).plus(233).minus(13).div(30).plus(1)}")

    printMessage("${1 + 1}")

    // Practice null things
    practiceValVar()
    practiceListNullability()
}

// Basic function
private fun printMessage(message: String) = println(message)


private fun practiceValVar() {
    // Question mark
    var rainbowColor: Item = Item("qwerty", "This is a title", 0)

    // var variable - this works because of the question mark
    var rainbowColorTwo: Item? = null

    printMessage("Elvis operator: ${rainbowColorTwo?.title ?: rainbowColor.position}")
}

private fun practiceListNullability() {
    var nullList: List<String>?
    var nullListType: List<String?>
    var nullListBoth: List<String?>?
}


data class Item(val id: String, val title: String, val position: Int)