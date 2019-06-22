package lesson2

/**
 * You do not need the `this` keyword.
 */

fun Double.multiply(divideBy: Double) = times(divideBy.div(this))

fun Double.eatFish(numToEat: Int) = minus(numToEat)

fun Double.numberOfAquariums(divideBy: Int) = div(divideBy)