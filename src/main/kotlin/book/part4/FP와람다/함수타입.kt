package book.part4.FP와람다

// 함수타입 : 매개변수와 반환값의 형식
    // 형식
        // val 함수이름 : 함수타입 = 함수대입(람다)
    // 컴파일러가 매개변수의 타입을 추론 가능 -> 타입 선언 생략

// typealias : 함수 타입을 정의, 반복해서 사용되는 함수 타입을 쉽게 정의
typealias MyType = (Int) -> Int
// it : 매개변수 지칭, 함수 타입 정의된 곳에서만 사용
val lambdaFun2 : MyType = {it + 10}
// 멤버참조 : :: 연산자 활용
class User(val name : String, val age : Int)
val lambdaFun3 : (User) -> Int = User::age



// 람다 함수타입 선언
val lambdaFun : (Int) -> Int = {x -> x * 10}