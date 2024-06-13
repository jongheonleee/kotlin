package book.chapter04.함수사용법

fun varargsFun(data1 : Int) {

}

fun varargsFun(data1 : Int, data2 : Int) {

}

// 가변 인수 -> vararg 키워드 활용
fun <T> varargsFun(a1 : Int, vararg array : T) {
    for ( a in array ){
        println(a)
    }
}

fun main(args: Array<String>) {
    varargsFun(10, "Hello", "world", 1.523, 'r')
    varargsFun(10, 20, false, 1.232, 'd')
}