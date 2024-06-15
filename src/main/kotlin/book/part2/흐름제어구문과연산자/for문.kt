package book.part2.흐름제어구문과연산자

fun main(args : Array<String>) {
    // 기본적인 반복문
    var sum : Int = 0

    for (i in 1 .. 10) {
        sum += i
    }
    println("sum : $sum")

    // 컬렉션 타입 이용
    // 컬렉션 타입 데이터에 의한 반복
    val list = listOf("Hello", "World", "!")
    val sb = StringBuffer()

    for (s in list) {
        sb.append(s)
    }
    println(sb)

    // 켈렉션 타입의 인덱스 값 이용
    val list2 = listOf("Hello", "Yeonuel", "!")
    for (i in list2.indices) {
        println(list2[i])
    }

    // 컬렉션 타입의 인덱스와 값 모두 이용
    val list3 = listOf("Hello", "Hanuel", "!!")
    for ((idx, value) in list3.withIndex()) {
        println("the element at $idx is $value")
    }


    // for의 다양한 조건
    for (i in 1 until 11 step 2) {
        print("$i -> ")
    }

}