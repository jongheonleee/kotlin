package book.part3.다양한코틀린클래스

// sealed 키워드 사용, 내부적으로 abstract 포함되어 있어서 객체 생성 x, 또한 생성자에 private 이 강제되어 있음
    // 외부에서 Sealed 클래스에 서브 클래스 추가 x
// n개의 서브 클래스를 나열, 이 중에서 특정 서브 클래스 사용하는 것이 목적
// sealed : 몇몇 타입을 묶기(밀봉) 위한 용도
// sealed와 enum 모두 "이 클래스 타입의 데이터로 클래스 내에서 준비한 것 중 하나를 나열할 목적으로 사용"
    // enum : 같은 형태의 데이터만 추가할 수 있음, 데이터를 추가할 수는 있는데 열거 객체별로 데이터 구성을 다르게 할 수 없음
    // sealed : 서브 클래스를 일반 클래스처럼 똑같이 정의해서 사용, 데이터를 서브 클래스별로 다양하게 구성

fun main(args : Array<String>) {
    val s1 : Shape = Shape.Circle(10.0)
    val s2 : Shape = Triangle(10, 10)
}

// Template Method와 매우 유사
sealed class Shape {
    class Circle(val radius : Double) : Shape()
    class Rect(val width : Int, val height : Int) : Shape()
}

class Triangle(val bottom : Int, val height : Int) : Shape()