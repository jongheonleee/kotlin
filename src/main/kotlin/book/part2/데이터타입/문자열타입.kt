package book.part2.데이터타입

val str : String = "Hello"
val str2 = "Hello \n World"
// raw string
val str3 = """Hello
World"""

fun main(args : Array<String>) {
//    println("str[1] : ${str[1]}")
//    println("str2 : ${str2}")
//    println("str3 : ${str3}")

    val name : String = "yeonuel"
    println("result :$name .. ${sum(10)}")
}

fun sum(no : Int) : Int {
    var sum = 0

    for (i in 1 .. no) {
        sum += i
    }

    return sum
}