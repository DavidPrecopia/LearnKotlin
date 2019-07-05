package lesson5

class Foo() {
    /**
     * Numerous methods available.
     */
    fun someFun() {
        println(Foo::class.simpleName)

        println(Foo::class.constructors)

        println(Foo::class.isSealed)

        println(Foo::class.supertypes)
    }
}