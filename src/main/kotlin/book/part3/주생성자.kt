package book.part3

fun main(args : Array<String>) {
    // 클래스로 부터 인스턴스 생성
    val o1 = Class1()
    val o2 = Class2()
    val o3 = Class3()

    // 매개변수가 있는 주 생성자, 인스턴스 생성
    val u1 = User1("yeonuel", 27)
    val u2 = User2("Hanuel", 25)
    val u3 = User3() // 기본값이 명시되어 있어서 에러 안남
    val u4 = User4("yeonuel", 28)



}

// 생성자 없으면, 컴파일러가 자동으로 매개변수 없는 주 생성자 추가
class Class1 {}

// 밑에 두 클래스 모두 매개변수 없는 주 생성자를 정의함
// 첫번째, 별도의 수식 구문(애너테이션, 접근 제한자..)이 없으면 constructor 생략 가능
// 두번째, constructor 사용해서 주 생성자 작성
class Class2() {}

class Class3 constructor() {}

// 매개변수가 있는 주 생성자
class User1 constructor(name : String, age : Int) {}
class User2(name : String, age : Int) {}

// 기본값 명시
class User3(name: String = "someone", age : Int = 0)

// 생성자 초기화 블럭, init
class User4(name : String, age : Int) {
    init {
        println("im init...")
    }
}

// 생성자 매개변수 이용
class User5(name : String, age : Int) {
    init {
        println("im init ... constructor arg => $name .. $age")
    }

    val upperName = name.toUpperCase()

    fun say() {
        // 에러, 생성자의 매개변수는 함수로 사용 x
            // 1. 생성자 매개변수 -> 프로퍼티 대입
            // 2. 생성자 내에서 val, var로 매개변수 선언
        // println("Hello $name")
    }
}

// 1. 생성자 매개변수 -> 프로퍼티 대입
class User6(name : String, age : Int) {
    val name = name

    init {
        println("im init ... constructor arg => $name .. $age")
    }

    fun say() {
         println("Hello $name")
    }
}

// 2. 생성자 내에서 val, var로 매개변수 선언
class User7(val name : String, val age : Int) {
    init {
        println("im init ... constructor arg => $name .. $age")
    }

    fun say() {
        println("Hello $name")
    }
}

// 매개변수와 프로퍼티 동일 이름
// 초기화 블럭 : 주 생성자의 실행 영역, 생성자의 매개변수 이용
// 함수 : 클래스의 프로퍼티를 제어하는 목적, 프로퍼티 이용
class User8(name : String, age : Int) {
    val name : String = "Hanuel"

    init {
        println("im init ... constructor arg => $name .. $age")
    }

    fun say() {
        println("Hello $name")
    }
}