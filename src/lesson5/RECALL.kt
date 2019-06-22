package lesson5

/**
 * Created 05/22/19
 */

fun main() {
    // Map
    val myMap = mutableMapOf("norsk" to "language", "elg" to "dyr", "jente" to "kvinne")
    // duh
    myMap.getOrDefault("norsk", "Norwegian")
    // get this key, if the key does not exist, execute the function
    myMap.getOrElse("language") { "Execute this function if that is not a key" }
    // get this key, or add this KVP if it does not exist
    myMap.getOrPut("ulv") { "wolf" }

    // Set - cannot contain duplicate values
    // even though I can put the same String twice,
    // the print statement will only show one of theme
    val mySet = setOf("some sting", "some sting")
    println(mySet)


    // Lists
    val myList = listOf(2, 4, 6)
    // sum the contents of a list
    myList.sum()
    // specify how to sum the contents
    listOf("sad", "some", "mad").sumBy { it.length /*`it` in lambdas, `this` in extension functions*/ }
    // reverse its contents
    myList.reversed()

    // Pair - hold 2 values of any type, even different types
    Pair("string", SomeClass())

    // Triple - hold one more value then Pair
    Triple(5.21, "harper", SomeClass())
}

private class SomeClass


/**
 * Reversing a List without using List's function.
 */
private fun <T> reverseAList(aList: List<T>) {
    val reversedList = mutableListOf<T>()
    for (i in aList.size downTo 0) {
        reversedList.add(aList[i])
    }
}

/**
 * Along with Extension Functions, you have Extension Properties
 */
private val String.lengthGreaterThenTen: Boolean
    // No need to put `this`
    get() = length > 10


/**
 * A Companion Object is similar to static members in Java.
 * Its members are tied to the Class, not its instances.
 * Unlike Java, YOU CANNOT access a companion object's members from an instance of its containing class.
 */
class HasACompanionObject {
    companion object {
        val teamRed = "AMD"

        fun someFoo(cores: Int) = "Number of cores $cores"
    }
}

/**
 * Unlike normal vals, const CANNOT be declared during runtime, ONLY compile time.
 * Additionally, you CANNOT declare consts in normal classes, ONLY object classes.
 */
private const val tdd = "wiseAss"

object SUV {
    const val honda = "Pilot"
}