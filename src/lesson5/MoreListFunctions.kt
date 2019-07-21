package lesson5

fun main() {
    val myList = listOf(1, 2, 3, 4, 5)

    // Just like Collections in Java, you can:
    myList.contains(4)
    val subMyList = myList.subList(2, myList.size - 1)

    // add all of the elements of a List
    myList.sum()
    // You can specify how to sum the elements of a List
    listOf("one", "two", "three", "four").sumBy { it.length }


    // Get the last index of a Collection or Array
    println(myList.lastIndex)

    // Get the last element of a Collection or Array
    println(myList.last())
}