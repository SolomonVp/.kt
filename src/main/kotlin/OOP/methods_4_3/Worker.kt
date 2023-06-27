package OOP.methods_4_3

import java.util.Calendar

class Worker(val name: String, val position: String, val startYear:Int = 0) {

    val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work() {
        println("Работаю!")
    }



}