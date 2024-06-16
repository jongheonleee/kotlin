package book.part3

fun main(args : Array<String>) {
    val a1 = TestClass("yeonuel")
    val a2 = TestClass("yeonuel", 10)
    val a3 = TestClass("yeonuel", 78.5)
    val a4 = TestClass("yeonuel", 50.0f)

    val t = TestClass2()
}

// 밑에처럼 생성자 오버로딩 가능
class TestClass(name : String) {
    constructor(name : String, weight : Float) : this(name) {}
    constructor(name : String, height : Double) : this(name) {}
    constructor(name : String, age : Int) : this(name) {}
}

// 보조 생성자와 초기화 블럭
// 초기화 블럭은 생성자 이전에 실행, 객체 생성 때 가장 먼저 실행됨
class TestClass2 {
    init {
        println("im init ....")
    }

    constructor() {
        println("im constructor ....")
    }
}

// 보조 생성자 var, val 이용 에러
class TestClass3 {

//    constructor(val name : String) { 에러
//        println("im constructor ... $name")
//    }
}

