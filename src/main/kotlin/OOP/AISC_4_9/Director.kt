package OOP.AISC_4_9



class Director(name: String, age: Int): Worker2(name, age) {
    override fun work() {
        println("Управляю процессом")
    }
}