fun main() {
    println("--------------------Просто прогоняем массив через for и выводим на экран-----------------------------------")
    val array = arrayOf(1, 5, 3, 6, 5, 5)
    for (i in array) {
        println(i)
    }

    println("--------------------Инициализируем массив от 0 до 100 и выводим через for----------------------------------")
    val array1 = arrayOfNulls<Int?>(101)
    for (i in 0 .. 100) {
        array1[i] = i
    }
    for (i in array1) {
        println(i)
    }
    println("--------------------Инициализируем массив от 0 до 100 через until(до верхнего индекса массива)-------------")
    val array2 = arrayOfNulls<Int?>(101)
    for (i in 0 until  array2.size) {
        array2[i] = i
    }
    for (i in array2) {
        println(i)
    }

    println("--------------------Выводим числа в обратном порядке с помощью downTo--------------------------------------")
    for (i in 100 downTo 0) {
        println(i)
    }

    println("--------------------Выводим числа в обратном порядке с помощью downTo с шагом(step)------------------------")
    for (i in 100 downTo 0 step 3) {
        println(i)
    }

    println("--------------------Create array. Init array. Update array. Read array.----------- ------------------------")
    val array3 = arrayOfNulls<Int?>(101)
    for (i in 1..100) {
        array3[i] = i
    }

    for ((index, i) in array3.withIndex()) {
        array3[index] = i?.times(2)
    }
    for (i in array3) {
        println(i)
    }

    println("--------------------Question-------------------------------------------------------------------------------")
    val array4 = arrayOfNulls<Int?>(301)
    for ((index, i) in (300 .. 600).withIndex()) {
        array4[index] = i
    }

    for (i in array4.size - 1 downTo 0 step 5) {
        println(array4[i])
    }


























}