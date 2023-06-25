var name: String? = "NullPointerException"

val list2: MutableList<Int>? = mutableListOf()

fun main() {
    //------------------------------------------------------------------------------------------------------------------
    name?.let {
        if (it.length > 5) {
            println(it)
        } else {
            println("Adios")
        }
    }

    //------------------------------------------------------------------------------------------------------------------

    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(first())
        println(last())
    }

    //------------------------------------------------------------------------------------------------------------------

    list2?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0 }.take(100)
            for (i in result) {
                println(i)
            }
        }
    }




}