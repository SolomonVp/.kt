package OOP.AISC_4_9

class Programmer2(name: String, age: Int, val language : String) : Worker2(name, age), Cleaner {
    override fun work() {
        println("Пишу код на ${language}")
    }

    override fun clean() {
        println("Программист убирает...")
    }
}