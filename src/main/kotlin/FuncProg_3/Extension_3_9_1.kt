fun main() {
    val age = 5
    val name = ""
    if (name.isNotEmpty()) {
        println("abc!")
    }
//    if (isAgeValid(age)) {
//        println("Valid!")
//    }
//    if (isAgeValid(age)) {
//        println("Valid two!")
//    }
//    if (isAgeValid(age)) {
//        println("Valid three!")
//    }

    if (age.isAgeValid()) {
        println("Valid!")
    }
    if (age.isAgeValid()) {
        println("Valid two!")
    }
    if (age.isAgeValid()) {
        println("Valid three!")
    }
    println(age.isPositive())

    println(28.isPrime())
}

//fun isAgeValid(age: Int) = age in 6..100

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}