package lesson4

/**
 * The keyword `object` declares a class as a Singleton.
 * https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations
 *
 * It cannot have a constructor (duh).
 *
 * You cannot declare objects inside of a functions (just like final in Java).
 * You can declare an object inside other objects and non-inner class.
 */
object ThisIsASingleton : FiskFarge {
    override fun farge() = "Singleton"
}