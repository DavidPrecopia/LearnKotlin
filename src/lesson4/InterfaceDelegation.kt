package lesson4

/**
 * You should prefer composition over inheritance.
 *   - With inheritance, the subclasses behavior depends upon its superclasses implementation.
 *     - The superclass may not operate as expected - e.g., HashSet may not add elements the way you thing it does.
 *   - You should only inherit if their is a "IS-A" relationship (e.g., a Honda Pilot is a Car).
 *
 * Composition is more malleable, but do not use a composition-always approach.
 * With composition you can "easily" change implementation via DI.
 * OTOH, inheritance is rigid because you can only inherit from only one type.
 *
 * Another way to put it - when you inherit, you are tightly coupled to the type you are inheriting from
 * - with composition, coupling is reduced.
 * Again, you should only inherit when there is a "IS-A" relationship.
 *
 * Reminder/Reference: https://stackoverflow.com/a/53354
 */

/**
 * Using norsk words for fun.
 */


fun main() {
    val myFisk = Fisk()
    fiskSpiserAction(myFisk)
    fiskFargeAction(myFisk)
}

private fun fiskSpiserAction(fisk: FiskSpiser) = println(fisk.spiser("lunsj"))

private fun fiskFargeAction(fisk: FiskFarge) = println(fisk.farge())


/**
 * Both interfaces as satisfied with Interface Delegation.
 * I am setting default values for both of the constructors parameters.
 * The `by` keyword
 */
class Fisk(fiskSpiser: FiskSpiser = MatSpiser(), fiskFarge: FiskFarge = GoldFarge())
    : FiskSpiser by fiskSpiser, FiskFarge by fiskFarge


class MatSpiser : FiskSpiser {
    override fun spiser(maten: String) = "Fisken spiser $maten"
}

class GoldFarge : FiskFarge {
    override fun farge() = "Gold"
}


interface FiskSpiser {
    fun spiser(maten: String): String
}

interface FiskFarge {
    fun farge(): String
}