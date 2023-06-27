import OOP.methods_4_3.Cat
import OOP.methods_4_3.Worker

fun main() {
    val cat = Cat("Барсик", 12, 3f)
    cat.printInfo()
    println(cat.isOld)

    cat.age = 10
    println(cat.isOld)




    val programmer = Worker("Ivan", "Programmer", 2016)
    programmer.printInfo()


}

fun Worker.printInfo() {
    println("Имя: ${name}, Долждность: ${position}, Год устройства: ${startYear}, Стаж: ${experience}")
}
