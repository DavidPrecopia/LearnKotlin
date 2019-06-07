package lesson3

fun main() {
    println(stackingCaseStatements(0))
    println(stackingCaseStatementsTwo(0, "Monday"))
}

private fun stackingCaseStatements(activity: Int) = when (activity) {
    0, 1 -> "foo!"
    else -> throw IllegalArgumentException("Unknown Activity $activity")
}

private fun stackingCaseStatementsTwo(activity: Int, day: String) = when {
    activity == 0 && day == "Monday" -> "can evaluate two different parameters"
    else -> throw IllegalArgumentException("Unknown parameters")
}
