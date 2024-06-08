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
    when (obj.count()) {
        5 -> println("Password Length too short")
        6 -> println("Password Length too short")
        7 -> println("Great. Password Set")
        else -> println("Invalid Password")
    }
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
}