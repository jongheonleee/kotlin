package book.part2.흐름제어구문과연산자

fun main(args : Array<String>) {
    // 기본적인 while 문
    var x = 0
    var sum = 0

    while (x < 10) {
        sum += ++x
    }

    println("x : $x, sum : $sum")

    // break, continue, 그리고 라벨
    var x2 = 0
    var sum2 = 0

    while (true) {
        sum2 += ++x2
        if (x2 == 10) break
    }

    println(sum2)


    // 중첩 반복문
    for (i in 1 .. 3) {
        for (j in 1 .. 3) {
            println("[ $i , $j ]")
        }
    }

    for (i in 1 .. 3) {
        for (j in 1 .. 3) {
            if (i == j) continue
            println("[ $i , $j ]")
        }
    }

    for (i in 1 .. 3) {
        for (j in 1 .. 3) {
            if (i > j+2) break
            println("[ $i , $j ]")
        }
    }

    // 라벨 이용, 자바의 루프(loop와 유사)
    aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break@aaa
            println("[ $i , $j ]")
        }
    }
}