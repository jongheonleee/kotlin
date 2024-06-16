package book.part3

// 생성자 - 코틀린과 자바의 차이
    // constructor 예약어
    // 주 생성자와 보조 생성자
    // init{} (생성자의 초기화 로직을 위함)
    // 주 생성자에 val, var 활용 -> 프로퍼티로 사용

// 코틀린에서는 생성자를 둘로 구분
    // 1. 주생성자 : 클래스 헤더 constructor 선언
    // 2. 보조생성자 :  클래스 몸체 constructor 선언

// 주 생성자와 보조 생성자를 구분한 이유 그리고 활용법
    // 생성자를 하나만 선언해서 이용해도 된다면, 주 생성자만 정의
    // 생성자를 n개 선언, 공통 부분 주생성자 & 나머지 보조 생성자 정의
        // 이때, 보조 생성자에 주 생성자 매개변수 다 있어야함
    // 꼭 전달받아야 하는 매개변수는 주 생성자에서 정의, 선택적으로 전달받아도 되는 매개변수는 보조 생성자에서 정의

fun main(args : Array<String>) {
    val t1 = Test("test")

    println("---주 생성자 생성---")
    val t2 = Test4("yeonuel")
    println("---보조 생성자 생성---")
    // 밑에 실행 흐름
        // 보조 생성자 호출 -> 주 생성자 호출 -> 초기화 블럭 실행 -> 생성자의 실행 영역 실행
    val t3 = Test4("yeonuel", 27)

}
class Test {
    // 보조 생성자만 선언
    constructor(name : String) {}

}

class Test2(name : String) {

    constructor(name : String, count : Int) : this(name) {

    }
}

// this()에 의한 생성자 연결
    // 주 생성자를 선언했다면, 보조 생성자는 주 생성자를 호출해야함
class Test3(name : String) {
    constructor(name : String, age : Int) : this(name) {

    }
}

class Test4(name : String) {
    init {
        println("im init ... ")
    }

    constructor(name : String, age : Int) : this(name) {
        println("constructor ... $name ... $age")
    }
}
