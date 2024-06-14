package book.chapter04.데이터타입

// 코틀린의 최상위 클래스 Any
fun main(args : Array<String>) {
    println(cases("Hello"))
    println(cases(10))
    println(cases(1))
}

fun getLength(obj : Any) : Int {
    if (obj is String) {
        return obj.length
    }

    return 0
}

fun cases(obj : Any) : String {
    when(obj) {
        1 -> return "One"
        "Hello" -> return "Greeting"
        is Long -> return "Long"
        !is String -> return "Not a string"
        else -> return "unknow"
    }
}