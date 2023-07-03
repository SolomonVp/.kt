package OOP.anonimClasses_4_10

class Car(override var name: String = "Машина") : Transport(name) {
    override fun drive() {
        println("Машина едет...")
    }

    fun startEngine(): Boolean {
        println("Запускаю двигатель...")
        return true
    }
}