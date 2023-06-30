package OOP.Nasledov_4_8

open class Worker(val name: String, val age: Int) {
    open fun work() {
        println("I'm work...")
    }
}