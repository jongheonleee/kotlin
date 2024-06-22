package book.part3

interface Interface1 {
    fun funA()
}

interface Interface2 {
    fun funA()
}

open abstract class Super21 {
    abstract fun funA()
}

// 상속이나 구현 받은 추상 클래스, 인터페이스에서 함수 이름 충돌될 경우
// 클래스에서 한 번만 재정의하면됨

class Sub21 : Super21(), Interface1, Interface2 {


    override fun funA() {
        TODO("Not yet implemented")
    }
}


interface Interface3 {
    fun funA() {
        println("this is implemented!!")
    }
}

open abstract class Super30 {
    abstract fun funA()
}

// 같은 이름의 추상 함수와 구현된 함수가 존재
    // 추상 함수는 재정의
    // 구현된 함수는 super 키워드로 호출
class Sub30 : Super30(), Interface3 {
    override fun funA() {
        super.funA()
    }

    fun some() {
        println("what u want for?")
    }
}


// 같은 이름으로 구현된 함수 여러개 -> 에러
