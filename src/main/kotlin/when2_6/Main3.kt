fun main() {
    val time = 8
    val weatherIsGood = false
    val result = when{
        time in 6..22 && weatherIsGood -> "Гулять"
        time in 6..22 && !weatherIsGood -> "Читать"
        else -> "Спать"
    }
    println(result)
}