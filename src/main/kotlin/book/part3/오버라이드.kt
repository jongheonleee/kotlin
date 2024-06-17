package book.part3

// 오버라이드 : 상위 클래스에 정의된 프로퍼티나 함수를 하위 클래스에서 재정의하는 것
// 오버라이드도 마찬가지로, 기본값 final
// 오버라이드 하고 싶으면 open 으로 열어줘야함

fun main(args : Array<String>) {
    val rect = Rect()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 100
    rect.height = 150
    rect.print()

    val circle = Circle()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
}

open class Shape3 {
    var x : Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var y : Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    lateinit var name : String

    open fun print() {
        println("$name : location : $x, $y")
    }
}

class Rect3 : Shape3() {
    var width : Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    var height : Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    override fun print() {
        println("$name : location : $x, $y, width : $width, height : $height")
    }
}

class Circle3 : Shape3() {
    var r : Int = 0
        set(value) {
            if (value < 0) field = 0
            else field = value
        }

    override fun print() {
        println("$name : location : $x, $y, $r")
    }
}