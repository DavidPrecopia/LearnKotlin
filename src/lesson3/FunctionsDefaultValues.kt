package lesson3

fun main() {
    // This would not be valid if the age parameter is first - that is because it is a default value.
    defaultParameters("mark")

    // If a default value is before a non-default value, you have to specify that you are tyring to set the non-default value.
    defaultParametersTwo(username = "calvin")

    // The default value of age is set via a function.
    defaultParametersFun(username = "jeremy")
}


private fun defaultParameters(username: String, age: Int = 25) = printAgeUsername(age, username)

private fun defaultParametersTwo(age: Int = 25, username: String) = printAgeUsername(age, username)

private fun defaultParametersFun(age: Int = getUserAge(), username: String) = printAgeUsername(age, username)

private fun getUserAge() = 25


private fun printAgeUsername(age: Int, username: String) {
    println("Parameters: $age and $username")
}
