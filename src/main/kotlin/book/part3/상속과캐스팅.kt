package book.part3

// 캐스팅 = 형변환
// 기초 데이터 타입의 캐스팅은 함수 이용해야함(자동 형변환 안됨)

val d : Int = 10
val d2 : Double = d.toDouble()


// 스마트 캐스팅 = 자동형변환

fun main(args : Array<String>) {
    println("res : ${smartCast(10)}")
    println("res2 : ${smartCast(10.0)}")

    println("res : ${smartCast2(MyClass10())}")
    println("res : ${smartCast2(MyClass11())}")

    // 하위 타입 -> 상위 타입 -> 하위 타입
    val o1 : Super11 = Sub11()
    val o2 : Sub11 = o1 as Sub11

    o1.superFun()
    o2.subFun1()

    // 상위 타입 -> 하위 타입
    val o3 : Sub11 = Super11() as Sub11 //  런타임 에러(ClassCastException), 상위 타입 -> 하의 타입 에러 발생
    o3.subFun1()

    // 하위 타입 -> 하위 타입
    val o4 : Sub12 = Sub11() as Sub12


    // null 허용 객체의 캐스팅
        // null 이 대입될 수 있어서 as 캐스팅할 때 주의
    val o5 : Super11? = Sub11()
    val o6 : Sub11 = o5 as Sub11

    val o7 : Super? = null
    val o8 : Sub11 = o7 as Sub11    // 런타임 에러

    // 위의 경우, as? 사용
    // as?
        // null 허용 객체에 정상적인 객체가 대입되면 캐스팅, 그렇지 않으면 null 반환
    val o9 : Super11? = null
    val o10 : Sub11? = o9 as? Sub11
}

// is = 타입 확인, instanceof
// is로 확인한 데이터는 자동으로 형변환, 모든 데이터 타입에 적용됨
fun smartCast(data : Any) : Int {
    if (data is Int) {
        // data is Int 에 의해 매개변수 data가 Int 타입으로 자동 형변환 -> 스마트 캐스팅
        return data * data
    } else return 0
}

fun smartCast2(o : Any) {
    if (o is MyClass10) o.fun1()
    else if (o is MyClass11) o.fun2()
}

class MyClass10 {
    fun fun1() {
        println("fun1() ... ")
    }
}

class MyClass11 {
    fun fun2() {
        println("fun2() ... ")
    }
}


// 상위 타입의 객체를 하위 타입에 대입하는 경우, 스마트 캐스팅 x, 컴파일 에러
// 조건에 맞아야 하고 조건에 맞아도 개발자가 명시적으로 변환해야함


// as : 상속 관계에 있는 객체를 명시적으로 캐스팅
// 상위 타입의 객체를 하위 타입에 대입할 때는 스마트 캐스팅이 안되므로 as를 이용해 명시적으로 캐스팅해 주어야함
// '하위 타입 -> 상위 타입 -> 하위 타입'인 경우에만 정상적으로 캐스팅
    // 형식 : 객체 as 타입
open class Super11 {
    fun superFun() {
        println("superFun() ... ")
    }
}

class Sub11 : Super11() {
    fun subFun1() {
        println("subFun1() ... ")
    }
}


class Sub12 : Super11() {
    fun subFun2() {
        println("subFun2() ... ")
    }
}


