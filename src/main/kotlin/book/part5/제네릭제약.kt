package book.part5

import book.part3.MyInterface1
import book.part3.MyInterface2

// 제네릭 제한(제약) : 상항제한, 하한제한
    // 제네릭으로 선언된 클래스는 실제 이용하는 곳에서 아무 타입이나 지정가능
    // 제네릭을 이용할 때 특정 타입만 지정할 수 있도록 제한
    // 예를들어, 수치 계산과 관련된 클래스의 경우 지정할 수 있는 타입을 Number의 하이 타입으로 제한

// 제네릭 타입의 제약 조건을 두개 이상 줄 수 있음
    // 이때는, 인터페이스로 제약함
    // where 예약어를 이용

// Null 불허 제약
    // class MyClass<T> == class MyClass<T : Any?>
    // null도 허용함을 의미함

fun main(args : Array<String>) {
    val o = MathUtil<Int>()
    o.plus(1, 10)
}


class MathUtil<T : Number> {
    fun plus(arg1 : T, arg2 : T) : Double {
        return arg1.toDouble() + arg2.toDouble()
    }
}
