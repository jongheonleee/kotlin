package book.part2.흐름제어구문과연산자

// when 표현식
fun main(args : Array<String>) {
    // 정수로 분기
    val a = 1

    when(a) {
        1 -> println("a == 1")
        2 -> println("a == 2")
        3 -> println("a == 3")
        else -> println("what")
    }

    // 정수 이외의 값으로 분기
    val a2 = "hello"

    when (a2) {
        "hello" -> println("hello there")
        "goodbye" -> println("see ya!!")
        else -> println("what u want")
    }

    // 여러 조건을 한꺼번에 명시
    val a3 = 20;

    when (a3) {
        10, 20 -> println("a3 is 10 or 20")
        30, 40 -> println("a3 is 30 or 40")
        30 + 30 -> println("a3 is 60")
    }

    // 범위 값으로 분기
    val a4 = 30

    when (a4) {
        !in 1..100 -> println("invalid data")
        in 1 .. 10 -> println("1 <= data <= 10")
        in 11 .. 20 -> println("11 <= data <= 20")
        else -> println("what you want")
    }

    // 집합 데이터로 조건
    val list = listOf<String>("hello", "world", "yeonuel")
    val arr = arrayOf<String>("one", "two", "three")
    val a5 = "yeonuel"

    when (a5) {
        in list -> println("a5 is in list")
        in arr -> println("a5 is in arr")
        else -> println("there is not a5")
    }

    // 여러 타입으로 분기

    // Any에 의한 조건
    fun testWhen(data : Any) {
        when (data) {
            1 -> println("1")
            "hello" -> println("how are you")
            is Boolean -> println("data type is Boolean")
        }
    }

    // if-else 대체용
    val a6 = 15

    when {
        a6 <= 10 -> println("a6 < 10")
        10 < a6 && a6 <= 20 -> println("10 < a6 <= 20")
        else -> println("a6 > 20")
     }

    // 표현식으로 사용
    val a7 = 50
    val res = when(a7) {
        1 -> "1..."
        2 -> "2..."
        else -> {
            println("else...")
            "hello"
        }
    }

    println(res)
}