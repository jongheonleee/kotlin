package book.chapter04

/**
 * 스코프는 크게 세 가지로 구분
 * - 최상위(클래스 외부)
 * - 클래스 내부
 * - 함수 내부
 *
 * 코틀린은 자동 초기화 x, 기본적으로 선언과 값 대입(초기화)를 동시에 해야함
 * 함수 내부의 경우, 추후에 값 대입을 해도 되지만 사용하는 시점이전에 값 대입해야함
 * 위의 에러 모두 컴파일이 잡아줌
 *
 * 자바의 경우 자동 초기화됨. 예를 들어서, 클래스 선언하고 기본 생성자를 호출
 * iv에는 해당 타입의 기본 값이 자동 초기화됨
 *
 */

// 선언과 값 대입하지 않으면 에러 발생
// [최상위(클래스외부)]밑에 부분 에러 발생
// val topData1 : Int
// var topData2 : Int


class User {
    // val objData1 : String
    // var objData2 : String

    fun some() {
        val localData1 : Int
        var localData2 : String

        // println(localData1)

        localData2 = "happy"
        println(localData2)
    }
}
