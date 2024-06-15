package book.part1.one

import java.util.*

var sum = 0

fun calSum() {
    for (i in 1..10) {
        sum += i
    }
}

class Test_User {
    val name = "yeonuel"

    fun sayHi(other : String) {
        val date = Date()
        println("date : " + date)
        println("hi "  + other + "!!, i'm " + name)
    }
}

fun main(args: Array<String>) {
    calSum()
    println(sum)

    val other = "hanuel"
    val user = Test_User()
    user.sayHi(other)
}