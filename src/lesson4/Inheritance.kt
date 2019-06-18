package lesson4


fun main() {
    val superClass = Inheritance("Scott")
    val sub = SubClass("Harper")

    println("Close super: ${superClass.rankClosed}, open super: ${superClass.rankOpen}, name super: ${superClass.username}")
    println("Close sub: ${sub.rankClosed}, open sub: ${sub.rankOpen}, name sub: ${sub.username}")
}


/**
 * open means it is open for extension - classes and field are closed by default (final in Java parlance).
 */
open class Inheritance(open val username: String) {
    // You cannot override this because it is closed.
    val rankClosed: Int
        get() = 100

    open val rankOpen: Int
        get() = 12
}


/**
 * Can override a super constructor's parameter.
 */
class SubClass(override val username: String) : Inheritance(username) {
    override val rankOpen: Int
        get() = super.rankOpen.times(-2)
}