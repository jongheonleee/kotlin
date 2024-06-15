package book.part2.함수사용법

// 일반적인 함수 선언
fun sayHello1(name : String) {
    println("Hello!!, " + name)
}

fun sayHello2(name: String?) {
    if (name == null) {
        println("Hello!!")
    } else {
        println("Hello!!, " + name)
    }
}

fun sayHello3(name : String = "someone") {
    println("Hello!!, " + name)
}

fun sayHello4(name : String = "someone", no : Int) {
    println("Hello!!, " + name)
}

fun main(args : Array<String>) {
    sayHello4(name = "Yeonuel", no = 7)
}