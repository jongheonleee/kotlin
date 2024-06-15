package book.part2.함수사용법

// 함수 확장
infix fun Int.myFun(x: Int) : Int {
    return x*x
}

class FunClass {
    // infix 예약어, 중위 표현 가능
        // 1. 클래스의 멤버 함수로 선언하거나 클랫의 확장 함수일 때
        // 2. 매개변수가 하나인 함수일 때

    infix fun infixFun(a: Int) {
        println("infixFun call!")
    }
}

fun main(args: Array<String>) {
    val obj = FunClass()
    obj.infixFun(10)

    // 중위 표현식
    obj infixFun 10

    // Int 객체 함수 확장 - myFun
    println(10 myFun 10)
    println(10.myFun(10))
}