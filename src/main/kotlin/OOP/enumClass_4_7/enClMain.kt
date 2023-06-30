import OOP.enumClass_4_7.Month.*
import OOP.enumClass_4_7.Season.*

fun main() {
    val month = SEPTEMBER
    val season = when (month) {
        DECEMBER, JANUARY, FEBRUARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, OCTOBER, NOVEMBER -> AUTUMN
    }
    println(month.tempAverage)
    println(season)
}

