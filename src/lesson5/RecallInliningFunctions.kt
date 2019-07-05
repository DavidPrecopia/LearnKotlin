package lesson5

/**
 * You inline functions to optimize them.
 *
 * You only inline function when they have a function parameter - otherwise, there is no point.
 *
 * Inlining means that the compiler will will move the function's body to its invocation site.
 *
 * That helps because when you pass a function to a function, the compiler creates a Function Object.
 *
 * The creation of that object uses resources (duh).
 *
 * @See InlineFunctions for when you should, and should not, use inline functions.
 */
fun main() {
    // without this, the annotation will not work.
}