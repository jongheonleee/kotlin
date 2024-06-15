package book.part2.흐름제어구문과연산자

data class MyClass(val no : Int) {
    operator fun plus(arg : Int) : Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg : Int) : Int {
    return no + arg
}

class Test(val no : Int) {
    operator fun plus(arg : Int) : Int {
        return no - arg
    }
}


fun main(args : Array<String>) {
    val obj : MyClass = MyClass(0)

    val res1 = obj + 3
    val res2 = obj - 3

    println("res1 : $res1 , res2 : $res2")
    println("${Test(30) + 30}")
}