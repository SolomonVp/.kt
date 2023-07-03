import OOP.anonimClasses_4_10.*

fun main() {
    val car: Transport = Car()
    val bicycle: Transport = Bicycle()

    val sportsmen = Sportsmen()
//    sportsmen.invokeWaterBoy(object : WaterBoy {
//        override fun bringWater() {
//            println("Вода принесена!")
//        }
//    })




    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет...")
        }
    })

//    if (car is Car) {
//        car.name = "Машина2"
//    }

//    if (car !is Car) return
//    car.name = "Машина2"
//    println(car.name)

//    if (car !is Car || car.startEngine())

    //------------------------------------- Анонимные класы ------------------------------------------------------------


}

fun travel(transport: Transport) {
    transport.drive()
}