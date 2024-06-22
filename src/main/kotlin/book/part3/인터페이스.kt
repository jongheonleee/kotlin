package book.part3

// 인터페이스
    // 추상 함수와 프로퍼티 집합
    // 인터페이스는 생성자가 없음
    // 인터페이스 구현을 명시할 때 () 사용 x, : 뒤에 구현하고자 하는 인터페이스명 작성

interface MyInterface {
    var data1 : String
    fun myFun()
    // 인터페이스 내에 구현된 함수도 가능
    fun myFun2() {
        println("why?!")
    }
}

interface MyInterface1 {
    fun myFun1()
}

interface MyInterface2 {
    fun myFu2()
}

// 인터페이스 끼리 상속 가능
interface MyInterface3 : MyInterface1, MyInterface2 {
    fun myFun3()
}

class MyClass16 : MyInterface3 {
    override fun myFun1() {

    }

    override fun myFu2() {

    }

    override fun myFun3() {

    }
}


interface MyInterface4 {
    fun myFun4()
}

interface MyInterface5 {
    fun myFun5()
}

// 클래스에서 여러 인터에피스 구현, 또한 클래스에서 상속과 인터페이스 구현 혼용 가능
class MyClass15 : MyInterface4, MyInterface5 {
    override fun myFun4() {

    }

    override fun myFun5() {

    }
}

// 객체 타입으로서의 인터페이스
interface MyInterface20 {
    fun myInterfaceFun()
}

open class Super20 {
    fun mySuperFun() {
        println("mySuperFun() ... ")
    }
}

class Sub20 : Super20(), MyInterface20 {
    override fun myInterfaceFun() {
    }
}

// 인터페이스에 함수 이외에 프로퍼티 추가 가능, 프로퍼티를 정의할 때 규칙은 아래와 같음
    // 1. 추상형으로 선언하거나 get()/set() 정의
    // 2. 추상 프로퍼티 x -> val은 get() 선언
    // 3. 추상 프로퍼티 x -> var는 get()/set() 선언
    // 4. 인터페이스의 프로퍼티를 위한 get()/set() 에는 field x

interface WrongInterface {
    var prop1 : Int

    // 밑에 프로퍼티 모두 컴파일 에러
//    val prop2 : String = "Yeonuel"
//
//    val prop3  : String
//        get() = field
//
//    var prop4 : String
//        get() = "Yeonuel"

    val prop5 : String
        get() = "Yeonuel"

    var prop6 : String
        get() = "Yeonuel"
        set(value) {

        }
}

// 인터페이스에 프로퍼티의 get(), set() field를 사용할 수 없지만, 로직을 추가할 수 있음
// 즉, get(), set() 에서 field를 이용할 순 없지만 다른 함수 호출 등의 로직은 얼마든지 구현 가능함

interface GoodInterface {
    var data1 : Int

    var data2 : Int
        get() = 0
        set(value) {
            if (value > 0) {
                calData(value)
            }
        }

    val data3 : Boolean
        get() {
            if (data1 > 0) return true
            else return false
        }

    private fun calData(arg : Int) {
        data1 = arg * arg
    }
}

class MyGoodClass : GoodInterface {
    override var data1: Int = 0
}

fun main(args : Array<String>) {
    val o1 : Sub20 = Sub20()
    val o2 : Super20 = Sub20()
    val o3 : MyInterface20 = Sub20()

    // Sub1 타입 객체 이용
    o1.mySuperFun()
    o1.myInterfaceFun()

    // Super1 타입 객체 이용
    o2.mySuperFun()
//    o2.myInterfaceFun() 에러

    // MyInterface10 타입 객체 이용
//    o3.mySuperFun() 에러
    o3.myInterfaceFun()

    val o4 : MyGoodClass = MyGoodClass()
    println("data1 : ${o4.data1}, data2 : ${o4.data2}, data3 : ${o4.data3}")
    o4.data2 = 5
    println("data1 : ${o4.data1}, data2 : ${o4.data2}, data3 : ${o4.data3}")

}

// 인터페이스의 목적은 행위를 표현하는 것
// 클래스와 점점 닮아가지만, 그렇다고 클래스와 동일시 취급할 순 없음
