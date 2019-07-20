package extra

fun main() {
    labelReturn()
    println(anyObjectForWhenExpression(Corsair, Ducky))
    println(anyObjectForWhenExpression(Corsair, Razer))
}

fun labelReturn() {
    val listOf = listOf(1, 2, 3, 4)

    // Labeled return
    listOf.forEach label@{
        if (it == 2) return@label
    }

    // Implicit return
    listOf.forEach {
        if (it == 2) return@forEach
    }
}

fun anyObjectForWhenExpression(key1: Keyboard, key2: Keyboard) = when (setOf(key1, key2)) {
    setOf(Corsair, Ducky) -> "Valid"
    else -> throw IllegalArgumentException("Unknown values")
}

sealed class Keyboard

object Corsair : Keyboard()
object Ducky : Keyboard()
object Razer: Keyboard()
object Logitech: Keyboard()
