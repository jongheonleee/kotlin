package book.part2.함수사용법

fun main(args: Array<String>) {
    val res = sum4(1,10)
    println(res)
}


// 함수에서의 매개변수는 무조건 val
// 함수형 언어의 특징 중 하나, 불변을 선호함
fun sum(a: Int, b: Int) : Int {
    return a+b
}

fun sum2(a: Int, b: Int) : Unit {

}

fun sum3(a: Int, b: Int) {

}

fun sum4(a: Int, b: Int) : Int {
    // 함수내 함수 선언
    var sum = 0

    fun calSum() {
        for (i in a..b) {
            sum += i
        }
    }

    calSum()
    return sum
}

fun some(a: Int, b: Int) : Int {
    return a+b
}

// 단일 함수
fun some2(a: Int, b: Int) : Int = a+b

// 단일 함수는 반환 타입 생략 가능
fun some3(a: Int, b: Int) = a+b
