package book.chapter04.데이터타입

import java.lang.Exception

// 특수한 상황을 표현하기 위한 Unit과 Nothing

fun myFun1() {} // 기본적으로 반환타입이 Unit

// Unit : 함수의 반환 구문이 없음
fun myFun2() : Unit {}

// Nothing : 의미 있는 데이터가 없음
fun myFun3(arg : Nothing?) : Nothing {
    throw Exception()
}