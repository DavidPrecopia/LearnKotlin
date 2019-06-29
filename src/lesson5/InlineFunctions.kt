package lesson5

/**
 * When you pass a function as a parameter, the compiler turns it into a Function Object.
 * Function objects lets you pass them and store them to variables
 * - however, this increases overhead.
 *
 * When you inline a function, you are inlining its body into the function's call site,
 * this reduces overhead while increases the amount of generated code.
 *
 * Put another way (per, https://medium.com/@agrawalsuneet/inline-function-kotlin-3f05d2ea1b59),
 * "To reduce the memory overhead of such functions we can use the
 * inline keyword which ultimately requests the CPU to not allocate any memory for the
 * function and simply copy the body of that function at the calling place."
 *
 * You can only use inlining on functions that have a function parameter.
 *
 * When not to use inline - and when you should:
 * https://stackoverflow.com/a/55077072
 *
 * When you should (per above SO post):
 * - Can inline when a function is a parameter and is invoked or passed to another function.
 * - Cannot when the function parameter is being assigned to a variable
 * - Should not when the function in question in large - remember, that function's body will be copied to
 * all of its call sites.
 * - More examples at the link.
 *
 * References:
 * https://stackoverflow.com/a/44471411
 * https://kotlinlang.org/docs/reference/inline-functions.html
 * (deeper dive) https://medium.com/@agrawalsuneet/inline-function-kotlin-3f05d2ea1b59
 */
fun main() {
    /**
     * Under the hood, the passed function will be turned into a Function Object.
     * (this is what lets you pass functions as arguments).
     * Because of that, overhead is increased.
     */
    notInlined { println("Not inlined") }

    /**
     * With inline functions, the function's body will be *inlined* into its
     * invocation site.
     * In the generated code, the below will be turned into:
     * ```
     * System.out.println("before");
     * System.out.println("Inlined");
     * System.out.println("after");
     * ```
     */
    inlined { println("Inlined") }
}

fun notInlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}

inline fun inlined(block: () -> Unit) {
    println("before")
    block()
    println("after")
}

/**
 * So this file can be referenced in doc comments.
 */
class InlineFunctions