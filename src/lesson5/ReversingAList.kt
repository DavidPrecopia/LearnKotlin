package lesson5

fun main() {
    reverseAList()
}


/**
 * Reversing a List
 */
private fun reverseAList() {
    val myList = listOf("one", "two", "three", "four")
    myList.printThis()

    // Use the `downTo` function and a for-loop
    val reversedList = mutableListOf<String>()
    for (i in myList.size - 1 downTo 0) {
        reversedList.add(myList[i])
    }
    reversedList.printThis()

    // The `reverse` function returns a new *Immutable* List
    // To make a mutable List, you also need to invoke the `toMutableList` function
    val simplerWayToReverse = myList.reversed().toMutableList()
    simplerWayToReverse.printThis()
}

/**
 * Practice using Extensions and Generics
 * Need to declare the T post `fun` and prior the receiver type.
 */
private fun <T> List<T>.printThis() = println(this)