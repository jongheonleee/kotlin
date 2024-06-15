package book.part2.컬렉션타입


fun main(args : Array<String>) {
    // 기본적인 배열 활용
    // 다양한 타입의 데이터를 추가할 수 있음
    var arr = arrayOf(1, "yeonuel", true)

    arr[0] = 10
    arr[1] = "YEONUEL"

    println("${arr[0]} .. ${arr[1]} .. ${arr[2]}")
    println("size : ${arr.size} .. ${arr.get(0)} .. ${arr.get(1)} .. ${arr.get(2)}")

    // 배열의 타입 한정
    // 제네릭으로 타입 한정
    var arrInt = arrayOf<Int>(10, 20, 30)
    var arrInt2 = IntArray(3, {i -> i*10})
    println("${arrInt.get(0)} .. ${arrInt.get(1)} .. ${arrInt.get(2)}")
    println("${arrInt2.get(0)} .. ${arrInt2.get(1)} .. ${arrInt2.get(2)}")

    // xxxArrayOf() 함수 이용
    var arrInt3 = intArrayOf(10, 20, 30)
    var arrDouble2 = doubleArrayOf(10.0, 20.0, 30.0)

    // Array 클래스를 이용한 배열
    var arr3 = Array(3, {i -> i*10})
    for (i in arr3) {
        print("${i}..")
    }

    // 빈 배열 만들기
    var arr2 = arrayOfNulls<Any>(3)
    arr2[0] = 10
    arr2[1] = "Hello"
    arr2[2] = true

    println("${arr2[0]} .. ${arr2[1]} .. ${arr2[2]}")


    var emptyArr = Array<String>(3, {""})
    emptyArr[0] = "hello"
    emptyArr[1] = "world"
    emptyArr[2] = "yeonuel"

    println("${emptyArr[0]} .. ${emptyArr[1]} .. ${emptyArr[2]}")
}