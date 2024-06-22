package book.part3

// 개발자가 생성자를 추가하지 않으면 컴파일러가 매개변수 없는 주 생성자를 자동으로 추가

// 생성자 간의 관계
    // 1. 클래스의 주 생성자가 선언되면, 해당 클래스의 보조 생성자에는 주 생성자와 연결하기 위한 this() 구문이 추가되야함
    // 2. 객체 생성 시 어떤 식으로든 상위 클래스의 생성자는 호출
open class Super5 {

}

class Sub5 : Super5() {

}

val sub = Sub5()


open class Super6(name : String) {

}

class Sub6(name : String) : Super6(name) {

}

open class Super7(name : String) {

}

class Sub7(name : String) : Super7(name) {
    constructor(name : String, no : Int) : this(name) {}
}

val sub7 = Sub7("yeonuel", 9)


open class Super8(name : String) {
    constructor(name : String, no : Int) : this(name) {}
}

class Sub8 : Super8 {
    constructor(name : String) : super(name) {}
    constructor(name : String, no : Int) : super(name, no) {}

}

fun main(args : Array<String>) {
    val s = Sub8("yeonuel", 9)

}