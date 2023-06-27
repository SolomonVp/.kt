import OOP.getSet_4_1.Dog
import OOP.getSet_4_1.User

fun main() {
    val user1 = User()
    user1.name = null
    user1.age = -15
    println("Имя: ${user1.name} Возраст: ${user1.age}" )

    //------------------------------------------------------------------------------------------------------------------
    val user2 = User()
    user2.age = 10
    user2.age = 18
    user2.age = -9
    user2.name = "Nastya"
    println(user2.age)

    //------------------------------------------------------------------------------------------------------------------
    val dog = Dog()
    dog.name = "shark"
    dog.age = 12
    dog.weight = 2.3f
    println("Имя: ${dog.name}, возраст: ${dog.age}, вес: ${dog.weight}")



}