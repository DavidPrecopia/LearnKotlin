package lesson3

fun main() {
    val list = listOf("Pie", "KitKat", "Oreo", "Peanut Brittle", "Jello", "pancake")
    println(howManyStartWitPEager(list))

    // Without calling `toList()` this would print FilteringSequence's object ID
    println("Lazy list: ${howManyStartWithPLazy(list).toList()}")


    val spices = listOf("pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper", "curry")
    // Eager
    println("Curry things: ${filterCurry(spices)}")
}


// the filter function creates a new List with the filtered elements.
private fun howManyStartWitPEager(myList: List<String>) = myList.filter { startsWithP(it) }.size

// the filter function is eager - meaning it creates a new List immediately
// - to make filter lazy - only create the filtered List when it is called -
// you can use the `asSequence()` function - shown below.
/**
 * @return FilteringSequence
 * Contains all of this List's elements and the filter to apply - you need to
 * call `toList()` on this to apply the filter.
 */
private fun howManyStartWithPLazy(list: List<String>) = list.asSequence().filter { startsWithP(it) }


/**
 * @return boolean
 */
private fun startsWithP(it: String) = it.startsWith("P", true)

// This also sorts the filtered list by the length of each element
private fun filterCurry(list: List<String>) = list.filter { containsCurry(it) }.sortedBy { it.length }

// this `take()` function takes the first X element(s) of the List
//private fun filterCurry(list: List<String>) = list.take()

/**
 * @return boolean
 */
private fun containsCurry(it: String) = it.contains("curry", true)
