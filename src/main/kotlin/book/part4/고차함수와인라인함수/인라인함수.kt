package book.part4.고차함수와인라인함수

// 인라인함수 ?
    // inline 추가한 함수로 컴파일 단계에서 정적으로 포함됨, 런타임 때 함수 호출 발생 x
    // inline은 람다를 매개변수로 이용하는 곳에 사용
    // 고차함수의 문제점
        // 고차함수에서 람다를 전달하고 이 람다를 이용하는 코드가 많아짐 -> 런타임 때 성능 저하
    // 코틀린 -> 자바
        // 단순한 고차 함수도 자바로 변환되면 길어짐

    // 위의 문제를 해결하기 위해 '인라인' 등장
    // inline 키워드, 코틀린 -> 자바 에서 다른점이 있음
        // inline -> 호출되는 곳에 정적으로 포함되므로 런타임 때 함수 호출이 그만큼 줄고 성능 향상


// 노인라인 ?
    // inline으로 선언한 함수에 함수 타입의 매개변수가 n개 -> 그 중 어떤 함수는 inline x -> noinline 사용

fun main(args : Array<String>) {
    hoFunTest {x, y ->  x+y}

    inlineTest({it * 10}, {it * 20})
}

inline fun hoFunTest(argFun : (x : Int, y : Int) -> Int) {
    argFun(10, 20)
}

inline fun inlineTest(argFun1 : (x : Int) -> Int, noinline argFun2 : (x : Int) -> Int) {
    argFun1(1)
    argFun2(2)
}