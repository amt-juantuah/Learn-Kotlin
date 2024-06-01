fun main() {

    //  More of List
    val liSt = listOf("triangle", "square", "circle")
    println(liSt)

    val mutableList: MutableList<String> = mutableListOf("triangle", "square", "circle")
    println(mutableList)

    mutableList[0] = "rectangle"
    println(mutableList)

    val mutableToUnmutableList: List<String> = mutableList
    println(mutableToUnmutableList)

    println("(mutableToUnmutableList[0] = 'trapezium') will result in an error")

    val accessListItem = "The second item in the list is: ${mutableToUnmutableList[1]}"
    println(accessListItem)

    println("The last item in the list is: ${mutableToUnmutableList.last()}")
    println("The first item in the list is: ${mutableToUnmutableList.first()}")

    val countOfmutableList = mutableToUnmutableList.size
    val anotherCountOfmutableList = mutableToUnmutableList.count()

    println("The size of the list is: $countOfmutableList")
    println("The count of the list is: $anotherCountOfmutableList")

    val itemInList: Boolean = "trapezium" in mutableToUnmutableList
    println("It is $itemInList that the list has 'trapezium' as an element")

    mutableList.add("rhombus")
    println(mutableList)

    mutableList.remove("triangle")
    println(mutableList)

    mutableList.add("circle")
    println(mutableList)

    //  More of Sets
    val uniqueMutableSet: MutableSet<String> = mutableSetOf()
    for (item in mutableList) {
        uniqueMutableSet.add(item)
    }
    println(uniqueMutableSet)


    //  More of Maps
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "trapezium", 2 to "circle", 3 to "triangle", 4 to "circle", 5 to "rectangle")
    println("example of mutableMap is $mutableMap")

    val unMutableMap: Map<Int, String> = mutableMapOf(1 to "trapezium", 2 to "circle", 3 to "triangle", 4 to "circle", 5 to "rectangle")
    println("example of unMutableMap is $unMutableMap")


    // Exercises
    // 1. In a list of “green” numbers and a list of “red” numbers
    // how many numbers there are in total

    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println("The total size of both lists is ${greenNumbers.size + redNumbers.size}")

    // 2. In a list of supported network protocols
    // check whether the requested protocol is supported or not

    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED
    println("Support for $requested: $isSupported")


    // 3. Define a map that relates integer numbers from 1 to 3
    // to their corresponding spelling
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")

}
