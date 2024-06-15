package book.part2.컬렉션타입

fun main(args:Array<String>) {
    // list -> iterator
    val list = listOf<String>("Hello", "World")
    val it1 = list.iterator()
    while (it1.hasNext()) {
        println(it1.next())
    }

    // set -> iterator
    val set = setOf<String>("Hello", "Yeonuel")
    val it2 = set.iterator()
    while (it2.hasNext()) {
        println(it2.next())
    }

    // map -> iterator
    val map = mapOf<String, String>("Hello" to "World", "Yeonuel" to "Hanuel")
    val it3 = map.iterator()
    while (it3.hasNext()) {
        println(it3.next())
    }
}