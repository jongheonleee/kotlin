package book.part3

// Any 클래스는 equals(), toString() 이외의 다른 멤버들은 제공안함
// 이 점이 자바의 Object와 다름

class Shape {
    var x : Int = 0
    var y : Int = 0
    var name : String = "Rect"

    fun draw() {
        println("draw $name : location : $x, $y")
    }
}

fun main(args : Array<String>) {
    val o1 : Any = Shape()
    val o2 : Any = Shape()
    val o3 = o1

    println("o1.equals(o2) is ${o1.equals(o2)}")
    println("o1.equals(o2) is ${o1.equals(o3)}")
}