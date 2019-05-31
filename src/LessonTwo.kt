fun main() {
    val event = OPEN
    eventHandling(event).toConsole()
    // this apparently does not change the value of event
    // it's evaluating the
    eventHandling(event = ADD).toConsole()
}


const val OPEN = 100
const val ADD = 200
const val DELETE = 300
const val EDIT = 400

private fun eventHandling(event: Int) = when (event) {
    OPEN -> event.multiply(OPEN)
    ADD -> event.multiply(ADD)
    DELETE -> event.multiply(DELETE)
    EDIT -> event.multiply(EDIT)
    else -> throw IllegalArgumentException("Unknown event")
}

// value is within a range
fun checkRange(event: Int) {
    println(event in 1..100)
}
