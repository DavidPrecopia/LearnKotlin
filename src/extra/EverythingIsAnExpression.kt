package extra

fun main() {
    var x = 0
    do {
        // Because `5..7` returns a range, you can invoke functions on it.
        // This could also be, x in 5..7
        if ((5..7).contains(x)) print(">")
        println(++x)
    } while (x < 10)
}