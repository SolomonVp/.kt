// Везде где только возможно используется абстракция вместо реализации. (Как пример НЕ ArrayList, а List)
// По умолчанию базовые интерфейсы коллекций неизменяемые, чтобы сделать их изменяемыми необходимо использовать интерфейсы с приставкой Mutable.
// К элементам коллекций можно обращаться, как к элементам массива через []
// Быстро проинициализировать коллекцию можно используя методы: listOf, setOf, mapOf, arrayOf. Если нужны изменяемые коллекции, то те же методы с приставкой mutable.

fun main() {
    val array: Array<Int?> = arrayOfNulls(10)
    array[4] = 10
    println(array[4])

    val listOfNumbers: MutableList<Int> = mutableListOf<Int>()
    listOfNumbers.add(5)
    println(listOfNumbers[0])

}
