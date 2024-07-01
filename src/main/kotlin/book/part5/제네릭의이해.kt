package book.part5

// 제네릭 : 형식 타입 혹은 임의 타입이라고 생각 -> 타입 추상화
    // 선언된 것을 이용하는 곳에서 타입 명시하는 기법
    // 선언부에는 제네릭으로 형식 타입을 선언 / 사용부(구현부)에서는 특정 타입을 지정

fun main(args : Array<String>) {
    val o = MyClass<String>()
    o.info = "hello"

    val o2 = MyClass<Int>()
    o2.info = 10

    val o3 = MyClass2<String>("Hello")
    println(o3.info)
    val o4 = MyClass2<Int>(10)
    println(o4.info)

    val o5 = MyClass3<String, Int>();


}

class MyClass<T> {
    var info : T? = null
}

class MyClass2<T> (no : T) {
    var info : T? = null
}


// 여러개 형식 타입 선언
class MyClass3<T, A> () {
    var info : T? = null
    var data : A? = null

    fun myFun(arg : T) : A? {
        return data
    }
}


fun <T> someFun(arg : T) : T? {
    return null
}