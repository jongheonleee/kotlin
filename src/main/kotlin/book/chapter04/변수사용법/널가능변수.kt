package book.chapter04.변수사용법

/**
 * 코틀린은 기본적으로 타입 선언과 값 대입이 동시에 처리
 * 하지만, 프로그래밍 과정에서 값을 산출해서 대입해야하는 경우가 있음
 * 이는 null을 대입해야함
 *
 * '?' 키워드를 사용해서 nullable 하게 처리해야함
 */
// 밑에 에러 발생(컴파일이 잡음)
// val nonNullData : String = null
val nullableData1 : String? = null
var nullableData2 : String? = null

fun main(args:Array<String>) {
    // 밑에 두 줄은 컴파일 에러
    // nonNullData = "hello"
    // nullableData1 = "hello" // 재할당 x
    nullableData2 = "hello"
}