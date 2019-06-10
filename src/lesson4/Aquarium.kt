package lesson4

// This is the Primary Constructor
// Can make them private
// Notice that height does not include val nor var
// because of that, Kotlin will not make it a field - you will
// only be able to access it an init block.
class Aquarium(private val length: Int, val width: Int, height: Int) {
    val size: Int
        // This override the default getter
        // Setters work the same way.
        get() = length * width


    // This will be called post primary constructor
    // You can have as many init blocks as you want.
    // This is meant to complement the primary constructor
    // because it cannot have logic.
    init {
        // this is the only place you can access this field because
        // it declaration does not include val nor var.
        println("Height is $height")
    }

    // a Secondary Constructor
    // a secondary constructor must call the primary constructor
    // `this` call the primary constructor
    // this must pass all required values (i.e., non-default values).
    constructor(numberOfFish: Int) : this(100, 50, 20)
}