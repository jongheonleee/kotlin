package book.chapter04.변수사용법

// 변수 선언
/**
 * 변수를 크게 두 가지로 구분 -> read/ read&write
 * - val : read(read-only)
 * - var : read & write
 *
 * 선언과 값 대입을 분리함, 자바의 경우 동시에 처리해야 하지만 코틀린은 구분해서 처리함
 * 또한, 코틀린은 타입 추론도 가능함(타입 선언 생략 가능)
 *
 * val는 상수와 유사하지만 상수는 아님
 * val는 read-only로 생각하는게 좋음(프로퍼티와 연관)
 */


val data1 : Int = 10
val data2 = 20
var data3 = 30

fun main(args:Array<String>) {
    // data2 = 30 -> 컴파일 에러
    // data2 = data2 + 30 -> 컴파일 에러
    data3 += 50;
    println(data3)
}