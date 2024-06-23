package book.part4.고차함수와인라인함수

// API 함수
    // 1. run()
    // 2. apply()
    // 3. let()
    // 4. with()

// 1. run() ?
    // inline fun <R> run(block : () -> R) : R
    // 매개변수에 함수 타입이 선언 -> 함수를 전달해 사용
    // 전달받은 람다의 반환값을 그대로 반환


    // run() 함수 이용 목적
        // 1. 람다 함수를 실행하고 그 결과값을 얻음
        // 2. 객체의 멤버에 접근하기 위해 사용

    // run() 의 유용성
        // 1. 객체의 여러 멤버(함수, 변수)에 접근할 때 유용함


// 2. apply() ?
    // inline fun <T> T.apply(block : T.() -> Unit) : T
    // run()과 사용 목적은 같음, 하지만 반환값 차이가 있음
    // 객체가 반환됨


// 3. let() ?
    // inline fun<T, R> T.let(block : (T) -> R) : R
    // 자신을 호출한 객체를 매개변수로 전달받은 람다에 매개변수로 전달

// 4. with() ?
    // inline fun <T, R> with(receiver : T, block : T.() -> R) : R
    // run() 과 사용 목적이 유사함, 하지만 다른점은 with()는 ㅎ매개변수로 지정한 객체를 이용
    // run() : user.run {} 으로 이용하여 run을 적용한 객체를 {} 내에서 이용, with() : with(user) {} 로 이용하여 with()의 매개변수를 {}에서 이용

fun main(args : Array<String>) {
    // run() 이용
    val res = run {
        println("lambda function call ... ")
        10 + 20
    }

    println("res : $res")

    // 객체의 멤버 접근
    // 일반적인 oop 형식
    class User {
        var name : String? = null
        var age : Int? = null

        fun sayHello() {
            println("hi there!!")
        }

        fun sayInfo() {
            println("im yeonuel!!")
        }
    }

    val o = User()

    o.name = "Yeonuel"
    o.age = 27

    o.sayHello()
    o.sayInfo()

    // 객체에서 run() 함수 이용 - 위에서는 객체명 일일이 명시했지만 여기서는 그렇게 안함
    val res2 = o.run {
        println("goes to run()")
        name = "Yeonuel"
        age = 27

        sayHello()
        sayInfo()

        10 + 20
    }

    println("res2 : $res2")

    // apply() 함수 이용
    val o2 = o.apply {
        println("goes to apply()")
        name = "Yeonuel"
        sayHello()
        sayInfo()
    }

    println("o2 : $o2")

    // let() 함수 이용
    class User2() {

        var name : String? = null
        var age : Int? = null

        constructor(name : String, age : Int) : this() {
            this.name = name
            this.age = age
        }
    }

    fun letTestFun(o : User2) {
        println("letTestFun() : ${o.name} ... ${o.age}")
    }

    // 객체명으로 선언해서 이용하는 예시
    val o3 = User2("Yeonuel", 27)
    letTestFun(o3)

    // let 이용 - 짧게 이용하기 위해 변수 선언을 줄이고자 할 때 이용
    User2("Yeonuel", 27).let {o ->
        letTestFun(o)
    }

    // let 과 it을 활용
    User2("Yeonuel", 27).let {
        letTestFun(it)
    }


    // with() 이용
    with(o) {
        name = "Yeonuel"
        sayHello()
    }
}

