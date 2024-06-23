package practice.문제해결능력.별찍기

fun main(args:Array<String>) {
    quiz1()
    quiz2()
    quiz3()
    quiz4()
    quiz5()
}

fun quiz1() {
    println("===quiz(1)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            print('*');
        }
        println()
    }
    println("============")
}

fun quiz2() {
    println("===quiz(2)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if (i + j < 4) {
                print(" ")
            } else if (i + j == 4) {
                print('*')
            }
        }
        println()
    }
    println("============")
}

fun quiz3() {
    println("===quiz(3)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if (i >= j) {
                print('*')
            }
        }
        println()
    }
    println("============")
}


fun quiz4() {
    val prefix : String = "*****"

    println("===quiz(4)===")
    for (i in 0 .. 4) {
        print(prefix)
        for (j in 0 .. 4) {
            if (i >= j) {
                print('*')
            }
        }
        println()
    }
    println("============")
}

fun quiz5() {

    println("===quiz(5)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if ((i >= j || i >= 4 - j) && !(i > j && i > 4 - j)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println("============")
}