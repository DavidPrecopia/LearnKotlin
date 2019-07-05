package lesson5

// declare an annotation
annotation class MyAnnotation

// apply it to a class
@MyAnnotation class NewYork

fun main() {
    // The Annotations applied to the class.
    println(NewYork::class.annotations)
}