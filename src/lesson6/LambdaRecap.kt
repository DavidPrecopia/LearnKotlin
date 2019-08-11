package lesson6

fun main() {
    println(doubleValue(5))

    val nameList = listOf("Dan", "Scott", "Trudy", "randy")
    // 2 lambdas and an extension function
    nameList.filter { it.contains('r') }.joinToString(" ").printThis()
}

val doubleValue = {value: Int -> value * 2}

fun String.printThis() = println(this)