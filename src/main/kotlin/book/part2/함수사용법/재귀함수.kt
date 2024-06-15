package book.part2.함수사용법

fun loopPrint(no : Int = 1) {
    var cnt = 1

    while (true) {
        println("go!")

        if (no == cnt) return

        cnt++
    }
}

fun recPrint(no : Int = 1, cnt : Int = 1) {
    println("recursive go!")
    return if (no == cnt) return else recPrint(no-1, cnt)
}

// tailrec : 재귀함수를 더 효율적으로 사용할 수 있음
// 재귀함수 구현시, StackOverflowError 부담 x
// 자바로 변환될 때, 반복문으로 변형됨
// 자신 호출하는 구문은 맨 마지막에 작성
tailrec fun tailrecPrint(no : Int = 1, cnt : Int = 1) {
    println("tailrecursive go!")
    return if (no == cnt) return else tailrecPrint(no-1, cnt)
}

tailrec fun tailrecPrint2(no : Int = 1, cnt : Int = 1) {
    if (no != cnt) return tailrecPrint(no-1, cnt)
    else return

    println("tailrecursive go!")
}

fun main(args : Array<String>) {
    tailrecPrint2(5)
}