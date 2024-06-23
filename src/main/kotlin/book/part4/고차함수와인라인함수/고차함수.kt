package book.part4.고차함수와인라인함수

// 고차함수 : 매개변수, 반환값 -> 함수


fun main(args : Array<String>) {
    hoFun(1, {x -> x*x})
    // 1. 고차함수의 매개변수가 함수타입 한개 -> 함수타입은 () 생략 가능
    hoFun2 {x -> x*x}
    // 2. 고차함수의 매개변수 n개 -> 함수타입 () 생략가능, 규칙이 있음
    hoFun(1) {x->x*x}

    hoFun3(1, {x -> x}, {x : Int -> x > 20})
    hoFun3(1, {x -> x*x}) {x -> x > 30}
    hoFun3(1, {x -> x*x})


}

// 일반적인 고차함수 형식
fun hoFun(x : Int, argFun : (Int) -> Int) {
    val res = argFun(10)
    println("x : $x , someFun : $res")
}

// 고차함수 이용을 위한 기법
    // 1. 고차함수의 매개변수가 함수타입 한개 -> 함수타입은 () 생략 가능
    // 2. 고차함수의 매개변수 n개 -> 함수타입 () 생략가능, 규칙이 있음
        // () 밖에 작성할 수 있는 함수타입은 맨 마지막 인수만 가능
    // 3. 함수타입의 고차함수에서 기본값 이용 가능
fun hoFun2(argFun : (Int) -> Int) {
    val res = argFun(10)
    println("someFun : $res")
}

fun hoFun3(
    x : Int,
    argFun1 : (Int) -> Int,
    argFun2 : (Int) -> Boolean = {x : Int -> x > 10}
) {
    val res = argFun1(x)
    println("x : $x , someFun : $res")
}