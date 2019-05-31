fun main() {
    val baseList = listOf(11, 12, 13, 14, 15)
    val mutList = mutableListOf<Int>()
    baseList.forEach { mutList.add(it) }

    for ((index, number) in mutList.withIndex()) {
        println("\"$number\" with an index of: $index")
    }

    println(divisibleBySeven())

    val myList = listOf(1, -2, -5, 56, -0, 9)

    // this val becomes a List<Int>
    val positiveNumbers = myList.filter { it > 0 }
    println(positiveNumbers)
}

private fun divisibleBySeven(): MutableList<Int> {
    val bySeven = mutableListOf<Int>()
    for (i in 0..100 step 7) bySeven.add(i)
    return bySeven
}