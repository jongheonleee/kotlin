package book.part2.데이터타입

// Any? <- Any 가능
// Any <- Any? 불가능
val myVal1 : Any = 10
val myVal2 : Any? = myVal1

val myVal3 : Any? = 10
// val myVal4 : Any = myVal3 에러
val myVal5 : Any = myVal3 as Any // as 연산자, 형변환
