

fun namedArguments(sender: String, message: String) {
    println("[$sender] $message\n")
}

fun defaultParameter(sender: String, message: String = "No message sent") {
    println("[$sender] $message\n")
}

val mappedMessages = mapOf("Kofi" to "Hi", "Afia" to "Charle I got my visa", "King" to "All praise to the Most Hight", "Abena" to null)

fun main() {

    // Named Arguments
    for (arg in mappedMessages.keys) {
        mappedMessages[arg]?.let { namedArguments(message = it, sender = arg) }
    }

    println("----------")
    // Default Parameter Values
    for (arg in mappedMessages.keys) {
        if (mappedMessages[arg] is String) {
            defaultParameter(message = mappedMessages[arg]!!, sender = arg)
        } else defaultParameter(sender=arg)
    }

    println("----------")

    // single expression functions
    fun singleExpression(x: Int, y: Int) = println(x+y)
    singleExpression(4, 5)

}