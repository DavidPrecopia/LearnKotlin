package generics

fun main() {
    println(listOf(1, 2, 3, 4).manuallyReverse())

    // There is no need to use `<>` because of inference.
    println(SabatonBound(Heroes()).album.releaseDate)
}


/**
 * Using `this` for legibility.
 * `it` is used in lambdas.
 */
private fun <T> List<T>.manuallyReverse(): List<T> {
    val reversedList = mutableListOf<T>()
    for (x in (this.size - 1) downTo 0) {
        reversedList.add(this[x])
    }
    return reversedList
}


// By default, a generic type is unbound - thus it accepts Null.
class SabatonNullable<T : Any?>(val album: T)

// To remove nullable as an option, simply remove the safe call operator.
class SabatonNotNullable<T : Any>(val album: T)

// To restrict what the generic type can be, simply bound it by extending.
class SabatonBound<T : HistoricalMetalAlbum>(val album: T)

// Open means that it can be extended.
open class HistoricalMetalAlbum(songList: List<String>)

class Heroes : HistoricalMetalAlbum(listOf("Smoking Snakes", "Resist And Bite")) {
    val releaseDate = "05/16/2014"
}