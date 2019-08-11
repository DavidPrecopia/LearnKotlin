package lesson6

import lesson6.Directions.*

fun main() {
    val game = Game()

    // These call did not work until I added the parentheses.
    game.addNorth()
    game.addSouth()
    game.addWest()
    game.addEast()
    game.end()
}

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game(private val path: MutableList<Directions> = mutableListOf(START)) {
    val addNorth = { path.add(NORTH) }
    val addSouth = { path.add(SOUTH) }
    val addEast = { path.add(EAST) }
    val addWest = { path.add(WEST) }
    val end = {
        path.add(END)
        println("Game over: $path")
        path.clear()
        false
    }
}