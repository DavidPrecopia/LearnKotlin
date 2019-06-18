package lesson4

/**
 * Constructors: abstract classes can have them, while interfaces cannot.
 * Function implementation: both
 * Declare fields: abstract class can directly initialize a field, while interface cannot
 * - however, they can create a getter method for the declared field.
 */


abstract class AbstractClass(private val username: String) {
    // the class that subclasses this must implement this field.
    abstract val avatarUrl: String

    // Can directly initialize a field in an abstract class.
    val joinDate = "January"

    fun foo(message: String) = println(message)
}

class ImplementsAbstractClass(override val avatarUrl: String) : AbstractClass("Harper")


interface InterfaceFile {
    // Unlike abstract classes, you cannot directly
    // initialize a field in an interface.
    val joinMonth
        get() = "December"

    val birthDate: String
    fun foo()
}

/**
 * The val declared in the Interface can either be a
 * constructor parameter or a field.
 */
class ImplementsInterfaceFile(override val birthDate: String) : InterfaceFile {
    override fun foo() {
        TODO("not implemented")
    }
}