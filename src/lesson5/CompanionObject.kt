package lesson5


/**
 * Companion Objects are equivalent to static in Java
 * When you need a function or values to tied to the class,
 * and not a specific instance of it.
 *
 * You can declare const vals in a normal class IF they are
 * within a companion object.
 *
 * Only one allowed per class.
 */


fun main() {
    // Can directly access members just like static in Java.
    TeamRed.mfg
    TeamBlue.mfg

    /**
     * This is invalid.
     * Unlike Java, you cannot access a companion object's
     * members via an instance of it containing class.
     */
//    TeamRed().mfg
}


class TeamRed {
    // Does not need a name, it can be directly accessed
    // (as shown in fun main).
    companion object {
        const val mfg = "AMD"
    }
}

class TeamBlue {
    // However, you can declare a name
    // As shown in fun main, you do not need to use this name when
    // accessing it members.
    companion object Static {
        const val mfg = "Intel"
    }
}