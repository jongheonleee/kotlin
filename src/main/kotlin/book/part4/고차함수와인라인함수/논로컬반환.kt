package book.part4.고차함수와인라인함수

// 논로컬반환 : 람다 내에서 람다를 포함하는 함수를 벗어나게 하는 기법
inline fun inlineTest2(argFun : (x : Int, y : Int) -> Int) : Int {
    return argFun(10, 0)
}

// 람다에서 return 사용 가능한 경우
    // inline 으로 선언하면 고차함수에 전달되는 람다에서 return 사용 가능
fun callFun() {
    println("callFun ... top")
    val res = inlineTest2 { x, y ->
        if ( y <= 0 ) return
        x / y
    }
    println("$res")
    println("callFun ... bottom")
}


// inline 고차 함수라도 전달받은 람다를 고차함수 내에서 다른 객체에 대입하면 return 사용에 제약이 있음
    // 고차함수에 inline 추가하면 문제 발생
        // return 을 명시할 수 있는 람다를 inline 내부에서만 사용하지 않고 또 다른 객체 대입시 그 객체의 코드가 inline되지 않아서 에러 발생
        // 이때, crossinline 예약어를 추가하면 해결

// crossinline : 함수를 inline으로 선언해도 람다에 return을 사용하지 못하게 함

open class TestClass {
    open fun some() {

    }
}


fun inlineTest3(argFun : () -> Unit) {
    val o = object : TestClass() {
        override fun some() = argFun()
    }
}

inline fun inlineTest4(crossinline argFun : () -> Unit) {
    val o = object : TestClass() {
        override fun some() = argFun()
    }
}

fun crossInlineTest() {
    inlineTest4 {
        // return 에러 발생
    }
}