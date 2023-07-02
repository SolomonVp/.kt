import OOP.AISC_4_9.*

fun main() {
    val workers = mutableListOf<Worker2>()
    workers.add(Seller("Leonid", 27))
    workers.add(Seller("Ivan", 30))
    workers.add(Seller("Sergey", 23))
    workers.add(Programmer2("Max", 34, "Java"))
    workers.add(Programmer2("John", 18, "Kotlin"))
    workers.add(Director("Nick", 50))

    for (worker in workers) {
        worker.work()
        if (worker is Programmer2) {
            println(worker.language)
        }
        if (worker is Cleaner) {
            worker.clean()
        }
    }

    val cleaners = workers.filter { it is Cleaner }.map { it as Cleaner }
    for (cleaner in cleaners) {
        cleaner.clean()
    }














}