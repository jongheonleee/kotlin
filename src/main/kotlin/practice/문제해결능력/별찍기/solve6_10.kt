package practice.문제해결능력.별찍기


fun main(args : Array<String>) {
    quiz6()
    quiz7()
    quiz8()
    quiz9()
    quiz10()
}

fun quiz6() {
    println("===Quiz(6)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if (i == j) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println("============")
}

fun quiz7() {
    println("===Quiz(7)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if (i == j || i+j == 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println("============")
}


fun quiz8() {
    println("===Quiz(8)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if (i + j >= 4) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println("============")
}

fun quiz9() {
    println("===Quiz(9)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 9) {
            if ((j <= 4 && i + j >= 4) || (j >= 4 && i >= j - 4)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }
    println("============")
}

fun quiz10() {
    println("===Quiz(10)===")
    for (i in 0 .. 4) {
        for (j in 0 .. 4) {
            if ((i > j || i > 4 - j) && !(i >= j && i >= 4 - j)) {
                print(" ")
            } else {
                print("*")
            }
        }
        println()
    }
    println("============")
}



