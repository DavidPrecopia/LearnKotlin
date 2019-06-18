package lesson4

/**
 * Recall last lesson because I took a couple of days off.
 *
 * This is the primary constructor.
 *
 * Kotlin combines constructor and field declaration.
 * Unlike Java, you do not have to create fields to
 * save the values passed into the constructor.
 *
 * NOTE: the second parameter does not have var nor val,
 * because of that, Kotlin will not make it a field.
 * You will only be able to access it in an init block.
 */
class Recall(private val firstNum: Int, secondNum: Int) {

    // This overrides the getter for this val.
    // You can do the same for the setter.
    val overrideGetter
        get() = firstNum * 10


    // You can have multiple init blocks.
    // This is along side the primary constructor because
    // you can only declare values in the primary constructor.
    init {
        // this is the only place you can access
        // the secondNum constructor parameter.
    }


    // This is a secondary constructor.
    // It must call the primary constructor.
    constructor(anotherNum: Int) : this(anotherNum, 2)

    // You can have multiple secondary constructors.
    constructor(evenAnotherNum: Int, someMessage: String) : this(1, 2)
}