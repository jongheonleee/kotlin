package book.part4.고차함수와인라인함수

fun main(args : Array<String>) {
    val resFun = hoFun5("-")
    println(resFun(1, 2))

    // 메서드 참조
    hoFun6 {it * 5}
    hoFun6(::nameFun)

    // 익명함수 이용
    hoFun7(fun(x : Int) : Int = x * 10)
}

// 고차함수 - 함수 반환
fun hoFun5(str : String) : (x : Int, y : Int) -> Int {
    when (str) {
        "-" -> return {x, y -> x - y}
        "*" -> return {x, y -> x * y}
        "+" -> return {x, y -> x + y}
        else -> return {x, y -> x / y}
    }
}

// 함수 참조와 익명 함수 이용
    // 1. 함수 참조를 이용한 함수 전달
    // 2. 익명 함수를 이용한 함수 전달

// 1. 함수 참조를 이용한 함수 전달 - 람다를 이용하여 고차함수 호출
fun hoFun6(argFun : (x : Int) -> Int) {
    println("${argFun(10)}")
}

fun nameFun(x : Int) : Int {
    return x * 5
}

// 2. 익명 함수를 이용한 함수 전달 - 익명 함수
    // 람다 -> return 사용 못함, 반환 타입 명시적 선언 x
    // 위의 경우, 익명 함수를 이용

// 익명함수
val anonyFun1 = fun(x : Int) : Int = x * 10
val anonyFun2 = fun(x : Int) : Int {
    println("im anonymous function...")
    return x * 10
}

// 익명함수 이용
fun hoFun7(argFun : (Int) -> Int) {
    println("${argFun(10)}")
}
