fun main() {
    val array = (0..1000).toList()
    val employees = array.map { "Employee №$it" }
//    val first30 = employees.take(30)                                    // 30 первых берет
    val first30 = employees.takeLast(30)                    // 30 последних берет
//    val first30 = employees.drop(30)                                    // 30 первых выбрасывает
//    val first30 = employees.dropLast(30)                                // 30 последних выбрасывает
    for (employee in first30) {
        println(employee)
    }


    // -----------------------------------------------------------------------------------------------------------------

    val array2 = generateSequence(0) {
        println("Сгенерированно: ${it + 2}")
        it + 2
    }
    val evenList = array2.take(10)
    for (i in evenList) {
        println(i)
    }

    // Задача. Сгенерировать бесконечную последвательно строк: "Сотрудник1", "Сотрудник2", ..., "СотрудникN"....... Вывести первые 100 элементоа.

    val array3 = generateSequence("Сотрудник №1") {
        val index = it.substring(11).toInt()
         "Сотрудник №${index + 1}"
    }
    val listOfFirst100 = array3.take(100)
    for (employee in listOfFirst100) {
        println(employee)
    }
}