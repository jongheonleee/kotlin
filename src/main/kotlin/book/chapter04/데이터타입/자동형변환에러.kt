package book.chapter04.데이터타입

var a1 : Int = 10
// 에러 var a2 : Double = a1

var a2 : Double = a1.toDouble()

// 코틀린에서 형 변환이 자동으로 이뤄지는 때는 값의 형변환
val l = 1L + 3