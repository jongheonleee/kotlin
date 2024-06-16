package book.part3


// lateinit, lazy 등으로 초기화 시점을 미루는 이유
    // 1. null 허용하지 않는 프로퍼티, 처음에 값을 초기화 할 수 없음
        // 의존성 주입
fun main(args : Array<String>) {
    val toy = Toy()
    println(toy.name)
    println(toy.price)

    val toy3 = Toy3()
    toy3.name = "hello"
    println(toy3.name)

    val toy4 = Toy4()
    println(toy4.name)
    println(toy4.age)
}

// 초기화 블록에서 초기화
class Toy {
    // 프로퍼티는 선언과 동시에 초기화 해야함(컴파일에러)
    var name : String
    val price : Int
    // init으로 초기값 명시하면, 컴파일 에러 x
    init {
        name = "toy"
        price = 10_000
    }
}

// Null 허용으로 선언
class Toy2 {
    val name1 : String = "toy"
    var name2 : String? = null
    val name3 : String? = null
    var price : Int? = null

    constructor(name2 : String, name3 : String, price : Int) {
        this.name2 = name2
//        this.name3 = name3 에러, val는 재할당 불가능
        this.price = price
    }
}


// 늦은 초기화
    // 1. lateinit는 var만 가능
    // 2. lateinit는 클래스 몸체의 프로퍼티에만 사용, 주 생성자는 사용 x
    // 3. lateinit는 접근자 함수 사용하지 않는 프로퍼티에만 가능
    // 4. null 허용 프로퍼티 x
    // 5. 기초 타입 프로퍼티에는 사용 x(Int ... )
class Toy3 {
    // lateinit 키워드 사용, val 불가능
    lateinit var name : String


}

// 초기화 미루기, by lazy {...} 구문 활용
// by lazy {...}로 선언해 프로퍼티의 초기화를 lazy 영역에서 진행
// 프로퍼티가 이용되는 시점에 실행, 초기화를 미루고 실제 사용 시점에 초기화
    // 1. 호출하는 시점에 초기화
    // 2. val에만 사용
    // 3. 클래스 몸체, 최상위 레벨 에서 사용 가능
    // 4. 기초 타입 가능

val someData : String by lazy {
    println("im lazy ... ")
    "hello"
}

class Toy4 {
    val name : String by lazy {
        println("im lazy2 ... ")
        "some toy"
    }

    val age : Int by lazy {
        println("im lazy3 ... ")
        10
    }

    init {
        println("im init ... ")
    }

    constructor() {
        println("im constructor ... ")
    }
}