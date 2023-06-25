fun main() {
    val list = listOf<Int>()
    val string = "dlfkjsfkl"
    val obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }

    with(list) {
        sum()
        average()
    }
    myWith(list) {
        sum()
        average()
    }
    myWith(string) {
        println(toUpperCase())
    }
}

inline fun<T, R> myWith(obj: T, operation: T.() -> R): R {
    return obj.operation()
}

