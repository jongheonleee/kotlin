package book.part3.다양한코틀린클래스

// Nested 클래스 : 클래스 내부에 정의한 클래스(inner class)
// 주로 Nested 클래스가 Outer 클래스를 사용하기 위함, 기본적으로 Nested 클래스에서 외부 클래스의 멤버에 접근 x
// 만약 Outer 클래스 멤버 이용하려면, inner 예약어 활용
// inner 가 추가된 클래스는 외부에서 생성 x, Outer 클래스에서만 객체 생성

fun main(args : Array<String>) {
    val o : Outer.Nested = Outer.Nested()
    println("${o.name}")
    o.myFun()
}
class Outer {
    class Nested {
        val name : String = "Yeonuel"
        fun myFun() {
            println("Nested .. myFun ..")
        }
    }
}

class Outer2 {

    private var no : Int = 10
    fun outerFun() {
        println("im outer fun()")
    }

    inner class Nested2 {
        val name : String = "Yeonuel"
        fun myFun() {
            println("Nested .. myFun ..")
            no = 30
            outerFun()
        }
    }

    fun createNested() : Nested2 {
        return Nested2()
    }
}