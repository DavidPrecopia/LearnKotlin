fun main() {
    val baseList = listOf(11, 12, 13, 14, 15)
    val mutList = mutableListOf<Int>()
    baseList.forEach { mutList.add(it) }

    for ((index, number) in mutList.withIndex()) {
        println("\"$number\" with an index of: $index")
    }

    println(divisibleBySeven())
}

private fun divisibleBySeven(): MutableList<Int> {
    val bySeven = mutableListOf<Int>()
    for (i in 0..1000 step 7) bySeven.add(i)
    return bySeven
}