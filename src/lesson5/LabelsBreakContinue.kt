package lesson5

/**
 * Any expression can be marked with a Label.
 * labelName@
 */

fun main() {
    someFun(Person(null))
    breakLabel()
    continueLabel()
}


private fun someFun(person: Person) {
    // This will return from this entire function
    val s = person.name ?: return
    println(s)
}

class Person(val name: String?)


private fun breakLabel() {
    println("\nUn-labeled Break")
    for (i in 1..3) {
        for (x in 1..10) {
            // Unlabeled break on kills this inner for-loop.
            if (x == 1) break
            println("x - post if-expression")
        }
        println("i - outer unlabeled for-loop")
    }

    println("\nLabeled Break")
    outerLoop@ for (q in 1..3) {
        // This will kill both the inner && outer for-loop
        for (w in 1..10) {
            if (w == 1) break@outerLoop
            println("w - post if-expression")
        }
        println("q - outer unlabeled for-loop")
    }
}

private fun continueLabel() {
    println("\nUn-labeled Continue")
    for (i in 1..3) {
        for (x in 1..3) {
            // This executes the print expression because continue
            // advances the inner-loop to its next iteration.
            if (x == 1) continue
            println("x - post if-expression")
        }
        println("i - outer for-loop")
    }

    println("\nUn-labeled Continue")
    outerLoop@ for (q in 1..3) {
        for (w in 1..10) {
            // Nothing is printed because this continue is
            // iterating the outer-loop, not this inner-loop.
            if (w == 1) continue@outerLoop
            println("w - post if-expression")
        }
        println("q - outer unlabeled for-loop")
    }
}