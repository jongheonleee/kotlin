package book.part3.다양한코틀린클래스

// Object는 익명 클래스와 관련있음
// object 키워드, 익명 클래스 생성 object {}
    // 형식 : val o = object {}
// object 클래스에는 생성자 x
// 외부 클래스에서 object 멤버 사용 -> object 클래스 선언 때 private 키워드 추가
// 외부에서 object 멤버 사용 -> object 클래스 정의(타입) 명시
// object 를 통해서 이름 있는 클래스 선언도 가능
    // 형식 : object 클래스명 {}
// object 클래스의 객체는 자동으로 생성되는 하나의 객체만 이용 -> Singleton


fun main(args : Array<String>) {
    val o = Outer4()
    // 에러
//    o.myInner.name
//    o.myInner.innerFun()

    val o2 = Outer5()
    o2.myInner.someClassFun()

    val o3 : NormalClass = NormalClass()
    val o4 : NormalClass = NormalClass()
    o3.myFun()

//    val o5 : ObjectClass = ObjectClass() 에러
    ObjectClass.myFun()
}

val o = object {
    var no : Int = 10
    fun myFun() {

    }
}

class Outer3 {
    val o = object {
        var no2 : Int = 0
        fun myFun() {

        }
    }
}

class Outer4 {
    private var no : Int = 0
    private val myInner = object {
        val name : String = "Yeonuel"
        fun innerFun() {
            println("innerFun() ... ")
            no++
        }
    }

    fun outerFun() {
        myInner.name
        myInner.innerFun()
    }
}

interface SomeInterface {
    fun interfaceFun()
}

open class SomeClass {
    fun someClassFun() {
        println("someClassFun()!!")
    }
}

class Outer5 {
    // 타입 명시, 외부에서 참조 가능
    val myInner : SomeClass = object : SomeClass(), SomeInterface {
        override fun interfaceFun() {
            println("implemented!!")
        }
    }
}

class NormalClass {
    fun myFun() {}
}

object ObjectClass {
    fun myFun() {}
}

