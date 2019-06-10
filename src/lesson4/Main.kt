package lesson4

fun main() {
    // this calls the primary constructor
    val aquarium = Aquarium(12, 15, 50)
    println("The aquarium's width: ${aquarium.width}\nSize: ${aquarium.size}")

    // use the secondary constructor
    val aquariumTwo = Aquarium(5)
}