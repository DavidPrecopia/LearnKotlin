package extra

import lesson2.Item

/**
 * Reference:
 * https://proandroiddev.com/kotlin-sealed-classes-enums-with-swag-d3c4b799bcd4
 */

/**
 * Sealed classes can store different data, while Enums can only
 * statically store the same type of data.
 *
 * An enum can have a constructor - when you declare an enum value,
 * you must invoke the constructor because they are constants.
 *
 * Sealed classes, OTOH, can have multiple instances that store state.
 */

/**
 * Sealed classes && when-expression:
 * - if a when-expression is evaluating a sealed class,
 * then the case statements must exhaust evey single
 * type of that sealed class.
 */

fun main() {

}


/**
 * If you need an enum to store values, you can declare a constructor,
 * however, because enums are constants the constructor must be invoke
 * at compile time, not runtime.
 *
 * - MUST invoke the constructor at compile time, not runtime.
 * - ALL of them have to invoke the constructor.
 * - Primary constructor ONLY.
 */
enum class ViewState(val value: String) {
    LOADING(""),
    DATA(""),
    ERROR("")
}


/**
 * - Unlike enums, sealed class types can be objects OR instances.
 * - They can store different types of data, or no data at all.
 * - Can be a Data Class.
 */
sealed class UiState {
    object Loading : UiState()
    class Data(val items: List<Item>) : UiState()
    class Error(val message: String) : UiState()
    // is data class
    data class User(val id: String, val name: String) : UiState()
}

sealed class AuthResult {
    object Success : AuthResult()
    object Canceled : AuthResult()
    class Error(val reason: String) : AuthResult()
}