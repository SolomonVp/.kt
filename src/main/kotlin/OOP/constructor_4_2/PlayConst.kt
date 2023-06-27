package OOP.constructor_4_2


fun main() {
    val russia = Country("Russia", 144_000_000)
    println(russia.name)
    println(russia.population)

//    russia.population = 145_000_000
    println(russia.population)

    val russia1 = Country()
    println(russia1.name)
    println(russia1.population)

    val russia2 = Country(population = 100_000)
    println(russia2.name)
    println(russia2.population)

    //--------------------------------------------------------------------

    val book = Book(name = "Don Vito", year = 10, price = 1)
//    book.name = "gjgj"
    println(book.name)
    println(book.year)
    println(book.price)

}