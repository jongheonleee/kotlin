package book.chapter04.함수사용법

// 오버로딩 -> 같은 이름 메서드 여러개 정의, 매개변수 부분 다름, 반환 타입 영향 x

fun some(a: String) {
    println("some(a : String) - call!")
}

fun some(a: Int) {
    println("some(a : Int) - call!")
}

fun some(a: Int, b: String) {
    println("some(a: Int, b: String) - call!")
}

fun main(args: Array<String>) {
    some("Hello")
    some(10)
    some(10, "Hello")
}