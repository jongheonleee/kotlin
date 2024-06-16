package book.part3

// 코틀린의 클래스 구성
    // 1. 생성자
        // 주생성자, 부생성자
    // 2. 프로퍼티(클래스의 변수)
        // 일반 변수와 다른점, 접근자 함수가 내장되어 있음
        // 접근자 -> getter, setter
        // 캡슐화를 위해, 접근자 함수 이용
    // 3. 함수

// 자바에서는 "필드", 코틀린에서는 "프로퍼티"
    // 필드 : 클래스의 멤버 데이터, 별도 지정하지 않으면 정적이지 않음
    // 프로퍼티 : 사용자가 설정할 수 있는 객체 특성
    // 필드는 하나의 클래스에서만 사용하고자 하는 변수, 프로퍼티는 외부에서 이용을 위해 getter/setter 함수를 포함한 변수
    // 코틀린에서는 기본적으로 getter/setter가 포함됨. 그래서 프로퍼티라고 지칭

fun main(args : Array<String>) {
    val user = User()

    user.name = "yeonuel"
    println(user)
    println(user.name)

    val user2 = NewUser()
    user2.name = "Yeonuel"

    // 변수값을 직접 이용해 데이터를 변경하거나 조회
    // 내부적으로는 접근자 호출
    println("${user2.name}")
    println("${user2.age}")

    val user3 = NewUser2()
    user3.greeting = "Yeonuel"
    println(user3.greeting)

    user3.age = -1
    println(user3.age)
}
class User {
    // 프로퍼티
    var name : String = "Yeonuel"
    val age : Int = 27
}


class NewUser {

    // var -> get(), set()
    // val -> get()
    var name : String = "yeonuel"
        // field는 지정된 값을 지칭함
        get() = field
        set(value) { field = value }

    val age : Int = 20
        get() = field
}

// 특정 작업에 프로퍼티 값을 이용하고자 하면, 접근자 함수를 직접 정의해야함
// 사용자 정의 프로퍼티 만들 때 규칙
    // 1. field 로 접근
    // 2. var -> get(), set()/ val -> get()
    // 3. val 초기값 생략 가능
    // 4. var 초기값 생략 불가능
class NewUser2 {
    var greeting : String = "Hello"
        set(value) {
            field = "Hello" + value
        }
        get() = field.toUpperCase()

    var age : Int = 0
        set(value) {
            if (value > 0) {
                field = value
            } else {
                field = 0
            }
        }
        get() = field
}


// 프로퍼티를 적용할 수 있는 변수
    // 1. 최상위 레벨 변수
    // 2. 클래스 내부 변수

// 최상위 변수
var myVal : String = "Hello"
    get() = field.toUpperCase()
    set(value) {
        myVal = "Hello, " + value + "!!"
    }

// 생성자 매개변수에 var, val 를 선언해도 접근자 함수 정의 못하는 게 원칙
    // 위의 경우, 클래스 변수로 사용 가능
    // 하지만, 실행 영역에 명시할 수 없어서 접근저 정의 할 수 없음
        //  주 생성자의 매개변수를 프로퍼티에 적용해 그 프로퍼티를 이용하면 접근자 정의 가능
class NewUser3(val name : String) {
    // 클래스 변수
    var age : Int = 0
        set(value) {
            if (value > 0) field = value
            else field = 0
        }

    var myName : String = name
        get() = field.toUpperCase()
        set(value) {
            field = "Hello, " + value
        }

    fun myFun() {
        var no = 0
//            get() = field + 10 에러 발생
    }
}