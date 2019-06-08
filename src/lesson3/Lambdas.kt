package lesson3

import kotlin.random.Random

fun main() {
    lambdaFunctions()
    higherOrderFunctionExample()
    practice()
}


private fun lambdaFunctions() {
    // Lambda function
    // num is an argument
    val gallons = { num: Int -> num.times(4) }
    // explicit version of above
    // This variable holds a function the accepts an Int, and then return an Int
    // The the val's type is explicitly declared here, thus you do not need to declare num's type
    val gallonsTwo: (Int) -> Int = { num -> num.times(4) }


    // this will print 16
    println(gallons(4))
    // print the same
    println(gallonsTwo(4))
}


/**
 * A Higher Order Function takes a function as an argument.
 */
private fun higherOrderFunctionExample() {
    // passing a lambda function
    val multipleIntByFour = { num: Int -> num.times(4) }
    acceptsFunction(4, multipleIntByFour)

    // passing a named function
    // you pre-fix with :: to indicate that you are not calling it.
    acceptsFunction(5, ::namedFunction)

    // because the last parameter is a function
    // the compiler knows that `it` is an Int
    // You have does this multiple times before - e.g., list.filter { }
    acceptsFunction(10) { it.times(4) }
}

private fun namedFunction(num: Int) = num.times(4)

/**
 * This is a higher-order function
 * @param lambdaFunction: a function that takes an Int, and then return an Int
 */
private fun acceptsFunction(number: Int, lambdaFunction: (Int) -> Int) = lambdaFunction(number)


private fun practice() {
    // this is assigned at compile time, and does not change
    val random1 = myRandom()
    // need to call `invoke()` on this for it to work
    // this is because this lambda function does not have a parameter
    // did not need to do this on the other lambda functions in this file
    val random2 = { myRandom() }

    // You have to call the `invoke` function on random2 because it returns Unit.
    repeat(2) {
        println("Val randoms: $random1 && ${random2.invoke()}")
    }

    for (x in 0..10) {
        println("Roll die: ${rollDie(x)}")
    }
}

/**
 * This uses Kotlin's Random class.
 * The nextInt parameters are a range.
 */
private fun myRandom() = Random.nextInt(1, 10)

/**
 * For this to work, you need to call the `invoke` function on it.
 */
private val rollDie = { sidesOfDie: Int -> if (sidesOfDie == 0) -1 else Random.nextInt(1, 12) }