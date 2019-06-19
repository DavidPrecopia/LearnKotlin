package lesson5

fun main() {
    pairing()
    tripling()

    // Practice
    val book = Book("The Road", "Cormac McCarthy", 2006)
    println("\n${book.getTitleAuthor().first} was written by ${book.getTitleAuthor().second} in ${book.getBookInfo().third}")
}


/**
 * When you want to return more then one value.
 */


/**
 * A Pair can hold two values of the same or different types.
 */
private fun pairing() {
    // This is like mapping.
    val pairing = "Engelsk" to "Norsk"
    val pairingTwo = Pair("First", 2)

    // Invoking `pairing.third
    println("Directly accessing the Pair val:\nFirst: ${pairing.first} \nSecond: ${pairing.second} \nComponent2: ${pairing.component2()}")

    // Destructuring
    // This is just like destructuring a Data Class' values.
    val (firstValue, secondValue) = pairing
    println("\nThis is Destructuring a Pair:\nFirst: $firstValue and Second: $secondValue")

    // Covert to a List
    println("\nTo List: ${pairing.toList()}")
}

/**
 * Just like Pair, Triple can store values of the same or different types.
 *
 * Has the same methods has Pair
 */
private fun tripling() {
    val tripling = Triple("First", "Second", "Third")
    val triplingTwo = "First" to 2 to "Three"
}


/**
 * Practicing using Pairs.
 */

class Book(private val title: String, private val author: String, private val year: Int) {
    fun getBookInfo() = Triple(title, author, year)
    fun getTitleAuthor() = Pair(title, author)
}