package book.part4.고차함수와인라인함수

// 라벨 : 데이터를 출력하는 람다만 벗어나게함
// @forEach -> 라벨을 별도로 선언하지 않아도 코틀린에서는 자동으로 함수명으로 된 라벨이 추가

val arr = arrayOf(1, -1, 2)
fun arrLoop() {
    println("loop top ... ")

    arr.forEach aaa@ {
        if (it < 0) return aaa@
        println(it)
    }

    println("loop bottom ...")
}


// 자동추가 label 이용
fun arrLoop2() {
    println("loop top ... ")

    arr.forEach {
        if (it < 0) return@forEach
        println(it)
    }

    println("loop bottom ...")
}