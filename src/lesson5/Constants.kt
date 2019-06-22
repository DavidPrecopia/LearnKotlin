package lesson5

/**
 * Normal vals can be set during runtime - Constants can only be set at compile time.
 *
 * Constants can only be declared at the top-level and in object classes - not normal classes.
 */

val setAtCompilerOrRunTime = "some string"
const val onlySetAtCompileTime = "some string"

object Singleton {
    const val inObjectClass = "some sting"
}

//class MyClazz {
//    const val thisIsInvalid = "some sting"
//}