package lesson2

// Mutable (duh)
// MutableList
val myMutableList = mutableListOf("python", "kotlin", "java")

// Immutable
// List
val myList = listOf(1, 5, 0)

fun main() {
    // for-loop
    // these both do the same thing
    myList.forEach { println(it) }
    for (element in myList) {
        println(element)
    }

    // for-loop with index
    // withIndex gets you the index
    for ((index, element) in myMutableList.withIndex()) {
        println("$element with $index")
    }

    // another way
    myMutableList.forEachIndexed { index, element ->
        println("$element with $index")
    }

    // for-each
    // `it` is the implicit name of a single parameter
    myMutableList.forEach { println(it.length) }

    arrayStuff()
}

private fun arrayStuff() {
    // initialize an Array with a size of 5
    // each value will its index times 2
    val myArray = Array(5) { it * 2 }
}