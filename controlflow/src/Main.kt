fun main() {
    // IF
    // general if else flow
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)
    println("\n")

    // one line if else flow

    println(if (check) "done" else "try again")
    println("\n")


    // WHEN
    val obj = "kkkkkkkk" + "jjh"
    println(
        when (obj.count()) {
            5 -> "Password Length too short"
            6 -> "Password Length too short"
            7 -> "Great. Password Set"
            else -> "Invalid Password"
        }
    )

    println("\n")

    when {
        obj.count() <= 5 -> println("Password is too weak")
        obj.count() < 7 -> println("Password is strong")
        obj.count() == 7 -> println("Password is strong")
        obj.count() < 8 -> println("Password is strong")
        obj.count() > 8 -> println("Password is very strong")
        else -> println("Invalid Password")
    }

    println("\n")

    // Ranges and Loops
    for (i in 1..obj.count()) {
        println(i)
    }
    println("\n")

    val cakes = listOf("vanilla", "sweet", "white", "strawberry")
    for (cake in cakes) {
        println("We serve $cake cake. Yummy!!")
    }
    println("\n")

    val riceFood = mapOf("monday" to "jollof", "tuesday" to "brail", "wednesday" to "plain", "thursday" to "brown", "friday" to "porridge")
    for (day in riceFood.keys) {
        println("On $day, the house will serve ${riceFood[day]} rice")
    }

    // WHILE LOOP
    var earning = 0
    while (earning < 5) {
        println("We need to word at building our own business")
        earning++
    }
    if (earning == 5) {
        println("Financial Security achieved")
    }

    // Exercises
    // 1. Using WHEN print out Yes when Button is A, No when B, Menu when X
    // Nothing when Y. Default should print out There is no such button

    val button = "A"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )


    // 2. Refactor a program in two ways, using while loop and a do-while loop

    var pizzaSlices = 0

    fun pizz() {
        println(
            when (pizzaSlices) {
                8 -> "There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D"
                else -> ""
            }
        )
    }
    while (pizzaSlices < 8) {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
        pizz()
    }



    pizzaSlices = 0
    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)
    pizz()

    // 3. Write a program that simulates the Fizz buzz game.
    // Your task is to print numbers from 1 to 100 incrementally,
    // replacing any number divisible by three with the word "fizz",
    // and any number divisible by five with the word "buzz".
    // Any number divisible by both 3 and 5 must be replaced
    // with the word "fizzbuzz".

    for (game in 1..100) {
        println(
            when {
                game % 15 == 0 -> "fizzbuzz"
                game % 3 == 0 -> "fizz"
                game % 5 == 0 -> "buzz"
                else -> game
            }
        )
    }

    val words = listOf("dinosaur", "limousine", "magazine", "language")

    for (word in words) {
        if (word.startsWith("l")) {
            println(word)
        }
    }
}