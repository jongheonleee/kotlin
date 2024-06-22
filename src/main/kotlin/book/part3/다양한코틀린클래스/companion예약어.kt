package book.part3.다양한코틀린클래스

// object 와 함께 사용되는 키워드 companion
// object 클래스의 멤버를 object 클래스명을 사용하지 않고 이용하게 해줌
// companion object = 자바의 static
// 코틀린에서 static은 필요없음,
// 단일 메모리(자바의 static 선언) -> 최상위에 선언
// 객체 생성 없이 클래스명으로 직접 이용 -> companion object 클래스

fun main(rgs : Array<String>) {
    Outer6.NestedClass.no
    Outer6.NestedClass.myFun()

    Outer6.no
    Outer6.myFun()
}
class Outer6 {
    companion object NestedClass {
        val no : Int = 0
        fun myFun() {

        }
    }

    fun myFun() {
        no
        myFun()
    }
}