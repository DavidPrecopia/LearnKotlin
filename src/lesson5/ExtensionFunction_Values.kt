package lesson5

/**
 * You do not need to use the `this` keyword
 */
fun Int.double() = times(2)


/**
 * You can declare properties and their getter and setter.
 */
val String.someBooleanValue: Boolean
    get() = true


/**
 * The receiver type can be nullable.
 */
fun String?.someFunction() = println(this?.let { substring(length - 2, length - 1) })