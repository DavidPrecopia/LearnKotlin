package lesson6

fun main() {
    val myRunnable = {
        println("Kotlin Lambda")
    }
    SamExampleJava.foo(myRunnable)

    SamExampleJava.foo { println("Kotlin Lambda") }
}