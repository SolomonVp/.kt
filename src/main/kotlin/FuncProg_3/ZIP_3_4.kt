fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Имя: ${user.first} Телефон: ${user.second}")
    }

    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Имя$i Фамилия$i")
    }

    val names1 = fullNames.map { it.substringBefore(" ") }
    val lasNames = fullNames.map { it.substringAfter(" ") }

    val users1 = names.zip(lasNames)

    for (user in users1) {
        println("Имя: ${user.first} Фамилия: ${user.second}")
    }


}