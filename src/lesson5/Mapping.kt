package lesson5

/**
 * Just like Lists, you can create a Map with `mapOf` and `mutableMapOf`
 */

fun main() {
    val myImmutableMap = mapOf("Elg" to "moose", "Edderkopp" to "Spider")
    myImmutableMap.printThis()

    // Retrieve values with `get` or [] - compiler recommends the latter.
    println(myImmutableMap["Elg"])

    // If the key does not exist, return this value instead.
    myImmutableMap.getOrDefault("And", "Duck is not in the Map")

    // If the key does not exist, execute a function that has
    // no-parameters and returns the same type as the values stored in this Map.
    myImmutableMap.getOrElse("Ulv") { "Some function that returns a String" }
}

// Regarding Generics, note that I have to declare the
// K and V post `fun` and prior the receiver type
private fun <K, V> Map<K, V>.printThis() = println(this)