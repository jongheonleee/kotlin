package book.part3

// 추상 함수 : 미완성 혹은 실행 영역이 없는 함수
// 추상 프로퍼티 : 선언부만 있는 프로퍼티
// 추상 클래스 이용 x, 하위 클래스로 추상 부분 완성시켜서 사용
// 추상 클래스는 open 생략 가능
fun main(args : Array<String>) {
    val o = ConcreteTest()

}
abstract class AbstractTest {

    val data1 : String = "Yeonuel"
    abstract val data2 : String
    fun myFun1() {

    }

    abstract fun myFun2()
}

class ConcreteTest : AbstractTest() {
    override val data2: String = "concrete test!!"
    override fun myFun2() {
        println("concrete test!!")
    }
}