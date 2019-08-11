package lesson6

import lesson6.Directions.*

fun main() {
    val game = Game()

    game.makeMove("n")
    game.makeMove("w")
    game.makeMove(null)
}

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(private val path: MutableList<Directions> = mutableListOf(START)) {
    private val addNorth = { path.add(NORTH) }
    private val addSouth = { path.add(SOUTH) }
    private val addEast = { path.add(EAST) }
    private val addWest = { path.add(WEST) }
    private val end = {
        path.add(END)
        println("Game over: $path")
        path.clear()
        false
    }

    // To invoke `where`, you need to added parentheses to it OR call `.invoke()` on it.
    private inline fun move(where: () -> Boolean) = where.invoke()

    // I can simply pass the lambda function to the higher-order function because
    // the higher-order function will invoke the lambda function.
    fun makeMove(direction: String?) = when (direction) {
        "n" -> move(addNorth)
        "s" -> move(addSouth)
        "e" -> move(addEast)
        "w" -> move(addWest)
        else -> move(end)
    }
}