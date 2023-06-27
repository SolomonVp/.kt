package OOP.methods_4_3

class Cat(val name: String, var age: Int, val weight: Float = 0f) {

    val isOld: Boolean
        get() = age >= 12

    fun printInfo() {
        println("Кличка: ${name}, Возраст: ${age}, Вес: ${weight}")
    }

//    fun isOld() = age >= 12

}