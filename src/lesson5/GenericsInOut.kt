package lesson5

/**
 * INITIAL UNDERSTANDING
 *
 * In types: can only be passed-into an object.
 * Only valid as a function's argument.
 *
 * Valid:
 * - fun foo(value: T) {  }
 *
 * Invalid:
 * - val property: T
 * - fun foo(): T {  }
 * - class MyClazz<in T>(myValue: T)
 *
 * Out types: can only be passed-out of an object - exception being the constructor.
 * Only valid as a function's return type and a val's property type.
 *
 * Valid:
 * - val property: T
 * - fun foo(): T {  }
 * - class MyClazz<out T>(myValue: T) // this is the only exception
 *
 * Invalid:
 * - fun foo(value: T) {  }
 */

/**
 * SUPERIOR UNDERSTANDING
 *
 * For example, `val myList: listOf<Any> = listOf<String>()`
 * - This is OK as along as you exclusively READ from myList because Strings are a sub-type of Any - you can safely treat a
 * String as an Any.
 * - However, if you were to WRITE to myList, you would have an issue because you could mix Any types with String types.
 *
 * This is where `in` and `out` come in. If you tell Kotlin that the generic type will only be used `out`
 * (only returned and val types), then the above example will be OK.
 *
 * `in`
 * - Class C is a producers of Ts, not a consumer
 * - In `class C<out T>`, T many only occur in the outward-facing members
 *
 * `out`
 * - Class C is a consumer of Ts, not a producer.
 * - In `class C<in T>`, T many only occur in the in-ward facing members.
 */


/**
 * STRONGEST UNDERSTANDING - this took longer to grasp then I thought.
 * Thanks to,
 * https://typealias.com/guides/illustrated-guide-covariance-contravariance/
 * https://typealias.com/guides/ins-and-outs-of-generic-variance/

>>Inheritance

THESE RULES MAINTAIN THE “IS-A” RELATIONSHIP.

Parameters (EXPAND)
- The sub-type must accept the same range of types as the super-type.
- Expand, not narrow.
- If you change from a Cat to a Blue, then something could no longer pass a Maine, because a Maine is not a Blue - however, changing to Animal would work fine, because a Maine is an Animal.

Return (NARROW)
- The sub-type must return at least the same range of types
- If you changed a Cat to an Animal, you could return a Dog, causing problems because a Dog is not a Cat - however, changing it to a Blue is ok because a Blue is a cat.

——

>>In and Out

ENFORCES TYPE-SAFETY

in
- When the sub-type violates the return rule (return *at most* the type the super returns).
- Can only use functions that accept ‘? super T’ (to use Java parlance).

out
- When the sub-type violates the parameter rules (accept *at least* the type the super accepts).
- Can only use functions that return ‘? extends T’ (to use Java parlance).

——

When Animal is the super-type of Cat.
- Co-variant: Cat is the sub-type of Animal
- Contra-variant: Animal is the sun-type of Cat

 */


fun main() {
    val arrayOf: Array<Int> = arrayOf(1, 2, 3)
    copy(arrayOf, Array<Any>(3) {})
}

/**
 * For this to work with the above example, `out` needs to be added to the from val
 * to tell the compiler that the from val will only be READ from.
 * Without the `out` keyword, the compiler will complain because bad things might happen,
 * e.g., write an Array of Strings to an Array of Ints.
 *
 *  From the docs:
 * "What has happened here is called type projection: we said that from is not simply an array,
 * but a restricted (projected) one: we can only call those methods that return the type parameter T,
 * in this case it means that we can only call get(). This is our approach to use-site variance,
 * and corresponds to Java's Array<? extends Object>, but in a slightly simpler way."
 */
private fun copy(from: Array<out Any>, to: Array<in Any>) {
    check(from.size == to.size) { "Arrays must be the exact same size" }
    for (x in from.indices) {
        to[x] = from[x]
    }
    println(to[0])
}


open class Car(val title: String)

class Pilot: Car("Pilot")
class Outback: Car("Outback")

/**
 * This is Type Projection
 * https://kotlinlang.org/docs/reference/generics.html#type-projections
 * https://typealias.com/guides/ins-and-outs-of-generic-variance/#keeping-both-of-those-functions
 */
class MyClazz<in Outback>

private fun practicingWtihInOut() {
    val myOutback = MyClazz<Outback>()
    val myOutbackPilot = MyClazz<Pilot>()
}