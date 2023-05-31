import java.util.StringJoiner

fun main() {
    printInfo("Иванов")
    printInfo("Сидоров", "Олег")
    printInfo("Петров", "Башир", "Сергеевич")
    println("----------------------------------------------------------")
    printInfo(patronymic = "Тамбович")
    printInfo(patronymic = "Петрович", lastName = "Шишкин")
    printInfo(patronymic = "Стасов", lastName = "Олегов", name = "Виктор")
    println("----------------------------------------------------------")
    println( volume(10))
    println(volume(10, 20))
    println(volume(10, 20, 30))
}

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("\nФамилия: $lastName")
    }
    if (name.isNotEmpty()) {
        println("Имя: $name")
    }
    if (patronymic.isNotEmpty()) {
        println("Отчество: $patronymic")
    }
}

fun volume(a:Int, b:Int = a, c:Int = a) = a * b * c

