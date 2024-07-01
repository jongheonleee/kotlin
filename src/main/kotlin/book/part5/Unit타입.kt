package book.part5

// Unit은 자바의 void와 유사함, Unit은 의미있는 반환값이 없다는 의미
    // 함수에 반환타입이 없으면 컴팡일러가 자동으로 Unit 추가
// 하지만, Unit은 타입(특수한 타입)

// 제네릭에서의 이용할 때 유용함
    // 인터페이스에 Unit을 선언하면 이 인터페이스의 함수를 재정의할 때 반환 타입을 명시하지 않아도됨

interface MyInterface<T> {
    fun myFun() : T
}

class MyClass13 : MyInterface<Unit> {
    override fun myFun() {

    }
}