fun main() {
    var element: Int = 10
    val sub = element
    val school: String = "Lion School of Computer Science"

    println("My school is $school and there were $element teachers in the last academic year")

    element = 40
    println("This year the number of teachers is $element. This shows an increase of ${element - sub}. teachers")
}