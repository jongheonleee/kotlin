package book.part3

fun main(args : Array<String>) {
    val o = PropertyClass()
    println("${o.getData()}")
//    o.data2 = 20 에러

}


// 접근 제한자 : 하나의 클래스에 선언된 멤버를 클래스 외부에서 접근할 수 있는지 결정하는 예약어
// 클래스, 인터페이스, 생성자, 함수, 프로퍼티 선언부에 추가
// public, internal, protected, private
public class User10 {
    public constructor()

    public val name : String = "Yeonuel"

    public fun myFun() {
        println("myFun() ... ")
    }
}


// 코틀린은 클래스/최상위 레벨에서 함수나 프로퍼티 사용 가능
// 각 구성요소를 어디에 배치하느냐(클래스/최상위)에 따라 접근 제한자의 차이가 있음

// 최상위 레벨 접근 범위
    // public : 기본값, 어디서나 접근 가능
    // protected : 최상위 레벨에서는 접근 불가능
    // internal : 같은 모듈에서만 접근 가능
        // 모듈
            // 1. an IntelliJ IDEA module : 인텔리제이 모듈
            // 2. a Maven project : 메이븐 프로젝트
            // 3. a Gradle source set : 그레이들 프로젝트
    // private : 같은 파일에서만 접근 가능
public val a : Int = 10
public fun fun1() {}
public class MyClass12() {

}


// 클래스 멤버의 접근 범위
    // public : 기본값, 어디서나 접근 가능
    // protected : private + 서브 클래스
    // internal : 같은 모듈
    // private : 같은 클래스
open class Super13 {
    val publicData : Int = 10
    protected val protectedData : Int = 10
    private val privateData : Int = 10
}

class Sub13 : Super13() {
    fun test() {
        println("$publicData")
        println("$protectedData")
//        println("$privateData") 에러
    }
}

class SomClass13 {
    fun test() {
        val o = Super13()

        println("${o.publicData}")
//        println("${o.protectedData}") 에러
//        println("${o.privateData}") 에러
    }
}


// 프로퍼티와 접근 제한자
// 프로퍼티? 변수 + getter/setter

// 프로퍼티를 외부에서 접근 못하게 막기
    // 1. 해당 프로퍼티를 private 선언
    // 2. 해당 프로퍼티를 반환하는 함수를 public으로 선언

class PropertyClass {
    private var data : Int = 10

    fun getData() : Int {
        return data
    }

    // get()/set() 을 직접 작성해 접근 제한자를 다르게 설정할 때의 규칙
        // 1. get() 접근 제한자 = 프로퍼티의 접근 제한자
        // 2. set() 접근 제한자는 프로퍼티의 접근 제한자와 다르게 설정 가능, 하지만 접근 범위 넓혀서 설정 x

    // public > protected/internal > private
        // public : set() : public, protected, internal, private
        // protected : set() : protected, private
        // internal : set() : internal, private
        // private : set() : private
    var data2 : Int = 10
        private set(value) {
            field = value
        }
}


// 생성자와 접근 제한자
    // 주 생성자와 보조 생성자 접근 제한자를 지정가능
    // 기본값은 public, protected 지정 불가능, 접근 제한자 명시하려면 constructor도 같이 써야함

// 상속 관계와 접근 제한자
    // 1. open과 private 같이 사용 x
    // 2. 하위 클래스에서 상위 멤버를 옵라이드할 때 접근 범위를 줄일 수 없음


class ConstructorClass private constructor(name : String) {
    public constructor(name : String, no : Int) : this(name) {}
}


// 자바 vs 코틀린
    // 상속
        // 1. 최상위 오브젝트 Object -> Any
        // 2. 관계 설정 extends -> :
        // 3. 기본값 : final, 상속 & 오버라이드 : open
        // 4. 명시적 캐스팅 : as

    // 접근 제한자 기본값 public