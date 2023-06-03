fun main() {

//    val sum = {a: Int, b: Int -> a + b}
    val sum:(Int, Int) -> Int = {a, b -> a + b}
    println(sum(2,10))


//    val square = {a: Int -> a * a}
//    val square: (Int) -> Int = {a -> a * a}
    val square: (Int) -> Int = { it * it}
    println(square(3))


    // Принимает две стороны прямоугольника в качестве параметра и возвращает его периметр.
    val perimeter: (Int, Int) -> Int = {a, b -> (a + b) * 2 }
    println(perimeter(2, 2)) //8

    // Принимает имя в качестве параметра, выводит на экран строчку "Привет, (имя)!, ничего не возвращает.
    val sayHello: (String) -> Unit = {println("Hello, $it")}
    sayHello("Андрей") // Hello, Андрей!

    // Принимает массив чисел в качестве параметра, возвращает массив, отсортированный по убыванию.
    val sort: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0 .. i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(5,9,-8,6,85,1))
    for (i in sortedArray) {
        println(i)
    }

}