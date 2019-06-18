package lesson4


fun main() {
    val teamRedDesktop = Desktop("Ryzen 7", "Vega 64", 32)

    // Works as expected.
    val teamRedDesktopTwo = teamRedDesktop
    // Both of these comparision are the same and will evaluate to true.
    // In fact, the IDE recommends replacing the latter with the former.
    println("Red: ${teamRedDesktop == teamRedDesktopTwo} and ${teamRedDesktop.equals(teamRedDesktopTwo)}")


    // Also works as expected.
    // Regarding copy's parameters, you can leave its members unchanged,
    // or you can choose to modify selected ones.
    val teamRedDesktopThree = teamRedDesktop.copy(ramSize = 64)
    // This will evaluate to false.
    println("Red desktop three: ${teamRedDesktopThree == teamRedDesktop}")


    /**
     * This is Decomposition.
     * It is copying the field values from teamRedDesktop.
     * The number of variables must match the number of fields the object has.
     */
    val (cpu, videoCard, ramSize) = teamRedDesktop
}


/**
 * This creates getters and overrides the toString. equals, hashCode, and copy methods.
 */
data class Desktop(val cpu: String, val videoCard: String, val ramSize: Int)