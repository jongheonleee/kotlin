package book.part2.변수사용법

/**
 * val != 상수(const)
 *
 * val의 경우, 대입 값을 다르게 반환할 수 있음
 *
 */

var check = false

// val는 get()을 가지는 변수, 해당 변수의 get()을 어떻게 처리하느냐에 따라 다른 값 반환
val myVal : String = "hello"
    get() {
        if (check) {
            return field
        } else {
            return field.toUpperCase()
        }
    }

fun main(args:Array<String>) {
    println(myVal)
    check = true
    println(myVal)
}