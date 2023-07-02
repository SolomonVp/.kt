package OOP.AISC_4_9

class Seller(name: String, age: Int) : Worker2(name, age), Cleaner {
    override fun work() {
        println("Продаю товар!")
    }

    override fun clean() {
        println("Продавец убирает!")
    }
}