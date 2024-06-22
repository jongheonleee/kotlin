package book.part3.다양한코틀린클래스

// enum 키워드 사용
// name, original 프로퍼티 제공
// 데이터를 대입할 수 있음
enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Direction2(var no : Int, val str : String) {
    NORTH(0, "north"), SOUTH(1, "south"), WEST(2, "west"), EAST(3, "east")
}

fun main(args : Array<String>) {
    val d : Direction = Direction.NORTH
    println("${d.name} ... ${d.ordinal}")

    val ds : Array<Direction> = Direction.values()
    ds.forEach { a -> println(a.name) }

    val d2 : Direction = Direction.valueOf("WEST")
    println("${d2.name} ... ${d2.ordinal}")

    val d3 : Direction2 = Direction2.NORTH
    println(d3.no)
}