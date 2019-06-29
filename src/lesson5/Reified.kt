package lesson5

/**
 * Reified: make something abstract more concrete.
 *
 * Because of Type Erasure, the declared generic type is only available at compile time, NOT runtime.
 * Thus, normally, to access/reference the generic type, you need declare a field - e.g.,
 * ```
 * fun <T> genericFun(clazz: Class<T>)
 *
 * genericFun(MyClazz::class.java)
 * ```
 *
 * To simplify, you can use `inline` with `reified` -- inline will inline the function's body to
 * its call site so the compiler can infer the generic type and thus replace the `T` with a concrete class.
 *
 * A `reified` generic type is equivalent to `val clazz: Class<T>` - you can access/reference it.
 *
 * You must use `reified` injunction with `inline`
 *
 * @see InlineFunctions
 *
 * See "Reified in Action" at https://kotlinexpertise.com/kotlin-reified-types/ for solid example.
 *
 * References:
 *
 * https://kotlinlang.org/docs/reference/inline-functions.html#reified-type-parameters
 */

class Fountian<T>(val waterSupply: T) {
    // You must use `reified` injunction with `inline`
    inline fun <reified R : WaterSupply> isTypeOfWaterSupply() = waterSupply is R
}

open class WaterSupply