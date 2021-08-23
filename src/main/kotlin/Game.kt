import kotlin.random.Random

fun main(args: Array<String>) {
    val options = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(options)
}

fun getGameChoice(optionsParam: Array<String>) = optionsParam[(Random.nextInt(optionsParam.size))]
