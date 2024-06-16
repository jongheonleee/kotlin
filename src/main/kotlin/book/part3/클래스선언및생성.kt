package book.part3

// 클래스 구성 요소
    // 프러퍼티(변수), 메서드, 생성자, 클래스
class MyClass {
    val myVal = 10
    constructor()
    fun myFun() {}

    class Inner {

    }
}

// 객체 생성
class MyClass2 {
    var name : String = "World"

    fun say() {
        println("hello $name")
    }
}

fun main(args : Array<String>) {
    // 내부적으로 생성자 호출
    val o1 = MyClass2()
    val o2 = MyClass2()

    o1.say()

    o1.name = "Yeonuel"
    o2.name = "Hanuel"
    o1.say()
    o2.say()
}