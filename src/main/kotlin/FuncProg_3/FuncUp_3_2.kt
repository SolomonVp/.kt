fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers) {
        println(i)
    }

    // Создать коллекцию имен. Из первой коллекции оставить только те имена, которые начинаются с буквы "А" и добавить их в новую коллекцию.
    val names = listOf("Иван", "Андрей", "Алексей", "Роман", "Ирина")
    val namesStartsFromA = names.filter { it.startsWith("А") }
    for (name in namesStartsFromA) {
        println(name)
    }

    println("---------------------------------------------------------------------------------------------------------")

    val numbers = (0..100).toList()
    val doubleNumbers = numbers.map { number: Int -> number * 2 }
    for (i in doubleNumbers) {
        println(i)
    }

    val employees = numbers.map { "Employee №$it" }
    for (i in employees) {
        println(i)
    }

    println("---------------------------------------------------------------------------------------------------------")

    val array = arrayOf(8, 10, -6, 45, 51)
//    val sortedArray = array.sorted()
    val sortedArray = array.sortedDescending()
    for (i in sortedArray) {
        println(i)
    }

    println("---------------------------------------------------------------------------------------------------------")

    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt())
    }

    val result = initArray.filter { it % 5 == 0 || it % 3 == 0}.map { it * it }.sortedDescending().map { "$it" }
    for (i in result) {
        println(i)
    }

}