package OOP.Nasledov_4_8

class Dog(weight: Float) : Animal("Собака", weight, "Суша") {
    override fun eat() {
        super.eat()
    }
}