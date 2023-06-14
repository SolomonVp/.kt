fun main() {
    val revenueByWeek = listOf(
        listOf(8, 6, 5, 1, 2),
        listOf(4, 7, 5, 8, 1),
        listOf(1, 4, 5, 9, 3),
        listOf(6, 6, 7, 9, 4)
    )

//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    }

//    val total = revenueByWeek.flatMap { it }
    val total = revenueByWeek.flatten()

    val average = total.average()
    println(average)
    //-----------------------------------------------------------------------

    //-----------------------------------------------------------------------

    val data = mapOf(
        "file1" to listOf(15, 20, 45, 15, 12),
        "file2" to listOf(16, -21, 41, 45, 2222222),
        "file3" to listOf(25, 53, 12, 14, 67)
    )
    val average2 = data.flatMap { it.value }.average()
    println(average2)

    //-----------------------------------------------------------------------
    val average3 = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(average3)


}