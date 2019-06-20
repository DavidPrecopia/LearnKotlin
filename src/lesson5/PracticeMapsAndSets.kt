package lesson5

/**
 * Sets are Collections, except they cannot contain duplicates.
 */


fun main() {
    val authorKey = "C.S. Lewis"
    val setOfBooks = setOf("The Magicians Nephew", "The Silver Chair", "The Last Battle")
    val mapOfAuthor = mapOf(authorKey to setOfBooks)

    // the `value` functions returns the value associated with this entry.
    // you also have the `key` function.
    println(mapOfAuthor.any { it.value.contains("The Voyage of the Dawn Treader") })

    // the `getOrPut` function will get the value associated with that key,
    // or if that key does not exist, it will add that key and the value
    // returned by the lambda to the Map.
    val myMutableMap = mutableMapOf(authorKey to "The Voyage of the Dawn Treader")
    val someValue = myMutableMap.getOrPut("Some Key") { "Some Value" }

    println("getOrPut result: $someValue\nThe map: $myMutableMap")
}