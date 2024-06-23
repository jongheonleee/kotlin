package book.part4.고차함수와인라인함수

// 클로저 : 스코프에 사용된 변수를 바인딩하기 위한 기법
// 함수가 호출될 때 발생하는 데이터를 함수 호출 후에도 그대로 유지해 이용하는 기법
// 내부적으로 이 변수까지 포함(캡처링)해 람다 반환

// FP에서는 함수 호출 후에도 lv가 유지되야하는 경우가 있음
    // 일급객체 함수(함수를 변수처럼) 내부에 함수를 정의할 수 있음

// 외부 변수 이용

fun main(args : Array<String>) {
    val someFun1 = closureTest(1)
    val someFun2 = closureTest(2)

    println("${someFun1(10)}")
    println("${someFun2(10)}")
}

fun closureTest(x : Int) : (Int) -> Int {
    println("argment $x")
    return { it * x}
}
