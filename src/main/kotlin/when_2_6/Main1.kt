fun main() {
        val nameOfMonth = "Май"
        val season = when(nameOfMonth) {
                "Декабрь", "Январь", "Февраль" -> {"Зима"}
                "Март", "Апрель", "Май" -> {"Весна"}
                "Июнь", "Июль", "Август" -> {"Лето"}
                "Сентябрь", "Октябрь", "Ноябрь" -> {"Осень"}
                else -> {"Не найденно!"}
        }
        println(season)

        val indexOfMonth = 7
        val season2 = when(indexOfMonth) {
                12, 1, 2 -> {"Зима"}
                in 3..5 -> {"Весна"}
                in 6..8 -> {"Лето"}
                in 9..11 -> {"Осень"}
                else -> {"Не найденно!"}
        }
        println(season2)
}