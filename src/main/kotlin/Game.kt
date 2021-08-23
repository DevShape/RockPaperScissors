import kotlin.random.Random

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
    val userChoice = getUserChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Random.nextInt(optionsParam.size))]

fun getUserChoice(optionsParam: Array<String>) {
    var x = "Please enter one of the following: "
    for (item in optionsParam) {
        x += "$item, "
    }
    x = x.dropLast(2)
    x += "."
    println(x)
    while (true) {
        val userInput = readLine()
        if (userInput != null && userInput in optionsParam) {
            break
        } else
            println("Please try again")
    }
}
