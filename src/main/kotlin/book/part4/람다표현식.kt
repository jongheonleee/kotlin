package book.part4

// 람다
    // 함수의 축양형, 익명 함수, 주 목적은 간결함
    // 또한, 고차 함수의 매개변수나 반환값으로 사용됨

// 람다 형식
    // { 매개변수 -> 함수내용 }

// 람다 함수의 원칙
    // 1. {}로 감싸야함
    // 2. -> 사용해야함
    // 3. 매개변수 타입을 선언, 추로할 수 있으면 생략
    // 4. 반환값은 마지막 표현식

fun main(args : Array<String>) {
    val res = sum1(1, 5)
}

// 기본적인 람다
val sum1 = {x : Int, y : Int -> x + y}

// 매개변수 x 람다
val sum2 = {-> 10 + 20}
val sum3 = {10 + 20}

// 함수 내용이 n 문장
val sum4 = {x : Int, y : Int ->
    println("wow")
    x + y
}