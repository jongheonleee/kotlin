package book.part2.변수사용법2 // 해당 패키지 변경 안하면 최상위 레벨 변수, 클래스 충돌발생

val topData1 : Int = 10
var topData2 : Int = 20

class User {
    val objData1 : String = "hello"
    val objData2 : String = "world"

    fun some() {
        val localData1 : Int
        var localData2 : String

        localData1 = 40
        println(localData1)

        localData2 = "hello"
        println(localData2)
    }
}