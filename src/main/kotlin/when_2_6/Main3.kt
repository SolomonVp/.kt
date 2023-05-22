fun main() {
    val time = 8
    val weatherIsGood = false
    val result = when{
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать"
        else -> "Спать"
    }
    println(result)


    val t = 12
    val w = false
    val r = when {
        t in 8 .. 22 && w -> "Гулять"
        t in 8 .. 22 && !w -> "Читать"
        else -> "Спать"
    }
    println(r)
}