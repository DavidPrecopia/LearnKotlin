package lesson4

/**
 * Enums let you limit and explicitly specify correct values.
 *
 * For example, if I were to use constants instead of an enum in this case:
 * The setCurrentColor function would accept a String/Int, thus you would be able to pass-in
 * any String/Int you want and I would have to add code to verify that the String/Int
 * parameter is valid.
 */

/**
 * Each enum value is a singleton.
 *
 * Because each enum is an instance of the enum class, I can set values.
 * Need to declare a primary constructor to do so.
 */
enum class EnumTrafficLightColors(val hexColorCode: String) {
    RED("#FF0000"),
    YELLOW("#FFFF00"),
    GREEN("#008000")
}

private var currentColor = EnumTrafficLightColors.RED

private fun setCurrentColor(newColor: EnumTrafficLightColors) {
    // Because assignments are not expression, I have to use the curly braces.
    currentColor = newColor
}