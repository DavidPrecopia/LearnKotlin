package lesson4


fun main() {
    println(matchMonitors(LgUltrawide()))
    println(matchMonitors(DellUltrasharp()))
}


/**
 * Sealed classes lets you represent a fixed number of types.
 * A sealed class can only be subclassed in the same file it is declared.
 *
 * Sealed classes are Abstract - thus they have the same abilities and limitations.
 *
 * Their constructors are private - they cannot have non-private constructors.
 *
 * When you need to preform some action depending upon the type of Monitor,
 * you (and the compiler) knows exactly how many sub-types of Monitor exist.
 * As shown in the below function.
 *
 * Reference: https://stackoverflow.com/a/50779528
 */
sealed class Monitor(val mfg: String) {
    fun foo() = println("Declaring a function in the sealed class")
}

class LgUltrawide : Monitor("LG")

class DellUltrasharp : Monitor("Dell")


fun matchMonitors(monitor: Monitor) = when (monitor) {
    // You must list all sub-types, otherwise the compiler will complain.
    is LgUltrawide -> "This is an LG"
    is DellUltrasharp -> "This is a Dell"
}