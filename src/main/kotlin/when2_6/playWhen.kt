fun main() {
    val temp = 90

    val result = when{
        temp < 0 -> "Твердое"
        temp < 100 -> "Жидкое"
        else -> "Газообразное"
    }
    println(result)
}