package book.part3

// 프로퍼티 오버라이드 == 함수의 오버라이드
// override는 open이 내장된 개념, 즉 override 쓰면 open 추가 안해도 재정의 가능

// 프로퍼티 오버라이드 할 때 규칙
    // 1. 상위 클래스의 프로퍼티와 이름, 타입 일치
    // 2. 상위 클래스에 val로 선언된 프로퍼티는 하위에서 val, var로 재정의 가능
    // 3. 상위에서 var로 선언된 프로퍼티는 하위에서 var로 재정의 가능
    // 4. 상위에서 null 허용으로 선언된 경우 하위에서 null 불허로 재정의 가능
    // 5. 상위에서 null 불허로 선언된 경우 하우이에서 null 허용으로 재정의 불가

fun main(args : Array<String>) {


}
open class Super {
    open val name : String = "yeonuel"
}

open class Sub : Super() {
    final override var name : String = "Yeonuel"
}

open class Super2 {
    open val name : String = "yeonuel"
    open var age : Int = 10
    open val email : String? = null
    open val address : String = "seoul"
}

class Sub2 : Super2() {
    override var name : String = "yeonuel"
//    override val age : Int = 20 에러
    override val email : String = "aaa@com"
//    override val address : String? = null 에러
}