fun main() {
    val result = modifyString("Hello, world!") {it.toUpperCase()}
    println(result)

    val list = (0 .. 100).toList()
    listModify(list) {
        println(it.sum())
    }


}

fun modifyString(string: String, modify: (String) -> String) : String {
    return modify(string)
}

inline fun listModify(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}