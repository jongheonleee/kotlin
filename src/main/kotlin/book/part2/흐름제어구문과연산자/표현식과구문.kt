package book.part2.흐름제어구문과연산자

fun doSomething() {}
fun some(o : Any) {}
// 표현식
fun 표현식() {
    10
    10 + 20
    doSomething()
}

// 표현식의 이용
fun 표현식_이용() {
    // 표현식
    10
    10 + 20
    doSomething()

    // 뵨수에 값 대입
    val d1 = 10
    val d2 = 10+20
    val d3 = doSomething()

    // 함수의 매개변수 대입
    some(10)
    some(10+20)
    some(doSomething())

}

// 구문
fun 구문() {
    for (i in 1 .. 10)  println("wow")
    val data = 10
}

// 구문의 이용
fun 구문_이용() {
    for (i in 1 .. 10) println("Hello")
    val d = 10

    // 변수에 값 대입 -> 에러
    // val d2 = for (i in 1 .. 10) println("Hello")
    // val d3 = val d4 = 10

    // 함수 호출 -> 에러
    // some(for(i in 1 .. 10) println("wow"))
    // some(val d = 10)
}


fun 활용() {
    // 코틀린에서 if 표현식
    val cnt = 10
    val a = if (cnt > 5) true else false
    some(if (cnt > 5) true else false)
}
