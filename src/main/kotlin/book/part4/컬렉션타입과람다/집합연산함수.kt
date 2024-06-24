package book.part4.컬렉션타입과람다

fun main(args : Array<String>) {
    val data = listOf<Int>(1, 2, 3, 4, 5)

    // 1. forEach() : 반복문
    data.forEach({i -> print(i)})

    // 2. forEachIndexed() : 반복문 + 인덱스
    data.forEachIndexed( { i, v -> print("i : $i, v : $v ") })

    // 3. all() : 모두 만족?
    val res = data.all({ it > 0 })
    println("res = $res")

    // 4. any() : 하나라도 만족?
    val res2 = data.any({ it > 4 })
    println("res2 = $res2")

    // 5. count() : 개수
    val res3 = data.count()
    println("res3 = $res3")

    // 6. find() : 조건 만족하는 첫번째 데이터
    val res4 = data.find({ it > 4 })
    println("res4 = $res4")

    // 7. reduce() : 람다에 차례로 전달, 결과값 반환
    val res5 = data.reduce( { total, next ->
        println("$total ... $next")
        total + next
    })
    println("res5 = $res5")

    // 8. fold() : reduce() + 초기값 설정
    val res6 = data.fold( 10, {total, next ->
        println("$total ... $next")
        total + next
    })
    println("res6 = $res6")

    val res7 = data.fold(10) {total, next ->
        println("$total ... $next")
        total + next
    }
    println("res7 = $res7")

    // 9. foldRight(), reduceRight() : 마지막부터 거꾸로 전달, 람다의 매개변수도 첫 번째가 전달
    val res8 = data.foldRight(10) {total, next ->
        println("$total ... $next")
        total + next
    }
    println("res8 = $res8")


    // drop(n), dropWhile(lambda), dropLastWhile() -> 일부분을 제외하고 나머지를 추출할 때 사용
        // drop(n) : 아에서부터 n까지 제외
        // dropWhile(lambda) : 처음부터 조건에 걸리는 마지막까지 제외, 나머지는 추출(그 이후에 조건 걸려도 추출함), 처음부터 조건에 안걸리면 다 추출
        // dropLastWhile(lambda) : dropWhile()과 반대, 마지막 -> 첫번째

    // slice(), take(), takeLast(), takeWhile() -> 특정 위치에 있는 데이터 추출
        // slice(a .. b) : 범위 추출
        // take(n) : 앞에서부터 n개 추출
        // takeLast(n) : 뒤에서부터 n개 추출
        // takeWhile(lambda) : 조건에 맞지 않는 데이터가 나오기 전까지 추출

}