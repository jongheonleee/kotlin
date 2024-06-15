package book.part2.흐름제어구문과연산자

// if 문 공부
// - 표현식 : 값을 만드는 문장, 값으로 표현 가능한 문장(변수, 상수, 연산자, 함수)
// - 구문 : 명령을 지시하는 문장
// 둘의 차이 : 값으로 판단될 수 있냐 없냐
    // 있으면, 표현식
    // 없으면, 구문


fun main(args : Array<String>) {
    // 기본적인 사용
    val a = 5
    if (a < 10) println("$a < 10")

    if (a > 0 && a <= 10) {
        println("0 < $a <= 10")
    } else if (a > 10 && a <= 20) {
        println("10 < $a <= 20")
    } else {
        println("$a > 20")
    }

    // 표현식으로서의 if 문, else 문 반드시 있어야함
    val res = if (a>10) "Hello" else "World"
    println(res)

    // if를 표현식으로 사용, {} 명시하여 여러 줄로 작성, 이때 데이터는 맨 마지막에 작성
    val res2 = if (a < 10) {
        print("Hello...")
        10+20
    } else {
        print("Wow!!..")
        20+20
    }
    println(res2)

    val res3 = if (a > 10) 20
    else if (a > 20) 30
    else 10

    println(res3)
}