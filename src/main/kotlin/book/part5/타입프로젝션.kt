package book.part5

// 타입 프로젝션
    // Variance는 크게 2가지로 분류
        // (1) 선언 측(Declaration-Side) Variance
        // (2) 이용 측(Use-Side) Variance
        // in/out을 사용하는 위치에 따라 나뉘어짐

// invariance(무공변) : 제네릭 타입의 형 변환이 불가능함
    // 클래스 선언 측에서 variance를 명시하지 않으면 invariance로 이용하겠다는 의도

fun main(args : Array<String>) {
    some(MyClass10<Number>(10))
    // some(MyClass10<Int>(10))

    some1(MyClass11<Int>(10))
    some1(MyClass11<Number>(10))

    some2(MyClass12<Number>(10))
    some2(MyClass12<Int>(10))
}


class MyClass10<T>(val data : T) {
    fun myFun() : T {
        return data
    }

    fun myFun2(arg : T) {

    }

    fun myFun3(arg : T) : T {
        return data
    }
}

fun some(arg : MyClass10<Number>) {
    arg.myFun()
    arg.myFun2(10)
    arg.myFun3(10)
}


// invariance로 선언한 클래스를 이용하는 곳에서 in/out을 추가해서 variance가 가능하게 할 수 있음
class MyClass11<T>(val data : T) {
    fun myFun() : T {
        return data
    }

    fun myFun2(arg : T) {

    }

    fun myFun3(arg : T) : T{
        return data
    }
}

fun some1(arg : MyClass11<in Int>) {
    arg.myFun()
    arg.myFun2(10)
    arg.myFun3(10)
}


// variance에 어노테이션을 추가하는 상황

fun some2(arg : MyClass12<out Number>) {
    arg.myFun()
//    arg.myFun2(10)
//    arg.myFun3(10)
}
class MyClass12<T>(val data : T) {
    fun myFun() : T {
        return data
    }

    fun myFun2(arg : T) {

    }

    fun myFun3(arg : T) : T {
        return data
    }
}