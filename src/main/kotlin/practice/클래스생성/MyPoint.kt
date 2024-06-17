package practice.클래스생성

// 1, 2 해결 ✅
    // 1. 두개의 정수 x, y를 저장하기 위한 인스턴스 변수가 선언 된 Point클래스를 정의하시오.
    // 2, 앞서 정의한 Point클래스를 테스트하기 위한 PointTest클래스를 작성하고, Point객체를 생성하는 코드를 작성하시오.

fun main(args : Array<String>) {
    val m = MyPoint(1, 1)
    println(m.x)
    println(m.y)

    val m2 = MyPoint2(1, 1)
    m2.x = 10
    m2.y = 10
    println(m2.x)
    println(m2.y)

    val m3 = MyPoint3(1, 1)
    m3.x = -100
    m3.y = 100
    println(m3.x)
    println(m3.y)
}

// x, y가 불변인 포인트
class MyPoint(val x : Int, val y : Int) {
}

// x, y가 가변인 포인트
class MyPoint2(var x : Int, var y : Int) {
}

// x, y가 가변이고 접근 함수가 정의됨
class MyPoint3(x : Int, y : Int) {
    var x = x
        get() = field
        set(value) {
            if (value > 0) {
                println("before x : $x")
                field = value
                println("after x : $x")
            } else {
                println("wrong value, try it again")
            }
        }

    var y = y
        get() = field
        set(value) {
            if (value > 0) {
                println("before y : $y")
                field = value
                println("after y : $y")
            } else {
                println("wrong value, try it again")
            }
        }
}

