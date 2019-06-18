package lesson4

/**
 * The keyword `object` declares a class as a Singleton.
 * https://kotlinlang.org/docs/reference/object-declarations.html#object-declarations
 *
 * It cannot have a constructor (duh).
 */
object ThisIsASingleton : FiskFarge {
    override fun farge() = "Singleton"
}