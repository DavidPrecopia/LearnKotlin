package generics

fun main() {
    // Invalid
//    someGenericMethod(Driving<String>())

    someGenericMethod(Driving<Mazda>())
}

private fun <T : AnotherCarClass> someGenericMethod(driving: Driving<T>) {
    driving.someFoo()
}


open class AnotherCarClass(val title: String)

class Mazda: AnotherCarClass("Mazda")

class Driving<T> {
    fun someFoo() = println("Driving class")
}