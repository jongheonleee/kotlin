package book.part2.데이터타입

// val a : Int = null 에러
val b : Int? = null


// 에러
//fun parseInt(str : String) : Int {
//    return str.toIntOrNull()
//}

fun parseInt(str : String) : Int? {
    return str.toIntOrNull()
}