package book.part3

// 생성자가 하는 역할을 수행 흐름 관점에서 분석
    // 1. this()/super()에 의한 다른 생성자 호출
    // 2. init 블럭 호출
    // 3. 생성자의 {} 영역 실행


// 상속 관계에 있는 클래스의 생성자 호출 흐름
    // 1. 생성자 호출 시 클래스에 init 블록이 정의됐다면, init 블록이 먼저 실행되고 생성자의 {} 영역이 실행
        // init -> constructor
    // 2. 객체 생성 시 생성자의 연결에 의해 같은 클래스의 생성자가 여러 개 실행되더라도 init 블록은 최초에 한번만 호출
        // init은 한번만 실행
    // 3. 상위 클래스가 있다면, 상위 클래스의 init 블록 및 생성자가 먼저 실행되고 하위 클래스의 init 블록 및 생성자가 실행됨.
        // 상위 init 블록 -> 상위 생성자 -> 하위 init 블록 -> 하위 생성자
        // super - init -> super - constructor -> init -> constructor
fun main(args : Array<String>) {
    Sub10("Yeonuel")
    println("....")
    Sub10("Hanuel", 27)
}

open class Super10 {
    constructor(name : String, no : Int) {
        println("Super ... constructor($name, $no)")
    }

    init {
        println("Super ... init call ...")
    }
}

class Sub10(name : String) : Super10(name, 10) {
    constructor(name : String, no : Int) : this(name) {
        println("Sub ... constructor($name, $no) call")
    }

    init {
        println("Sub ... init call")
    }
}