package lesson3

fun main() {

}

/**
 * This example function could be used in an abstract Base class (e.g., ViewModelBase)
 * to save a user's input to persistence storage.
 * The pass-in function would return Unit.
 */
private fun saveInput(list: List<String>, storage: (List<String>) -> Unit) = storage(list)

/**
 * In this example the storage function does not accept anything
 * and returns Unit.
 * You cannot omit the Unit return type.
 */
private fun saveInput(storage: () -> Unit) = storage

/**
 * The parentheses and the nullable operator indicate that function may be null.
 */
private fun nullableLambdaFunction(operator: ((Int) -> String)?) {
    // Call the operator function if it is not null, otherwise return the String literal
    println(operator?.let { it(10) } ?: "The lambda is null")
}