import OOP.dataClass_4_6.Student

fun main() {
    val student1 = Student("Иван", "Иванов", "123")
    val student2 = Student("Иван", "Иванов", "123")
//    val student3 = student1.copy()
//    val (name, lastName, id) = student1
//    println(name)
//    println(lastName)
//    println(id)
    println(student1)
    println(student1.hashCode())
    println(student2)
    println(student2.hashCode())
//    println(student3)
//    println(student3.hashCode())

    println(student1 == student2)
    println(student1 === student2)
//    println(student1 === student3)



}