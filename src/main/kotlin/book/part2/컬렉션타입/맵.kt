package book.part2.컬렉션타입

// Map -> mapOf(), mutableMapOf()

fun main(args:Array<String>) {
    // 불변
    val immutableMap = mapOf<String, String>(Pair("Yeonuel", "Y"), Pair("Hanuel", "H"))
    for (entry in immutableMap) {
        val key = entry.key
        val value = entry.value
        println("${key} : ${value}")
    }

    val immutableMap2 = mapOf<String, String>("Yeonuel" to "Y", "Hanuel" to "H")
    for (entry in immutableMap2) {
        val key = entry.key
        val value = entry.value
        println("${key} : ${value}")
    }

    // 가변
    val mutableMap = mutableMapOf<String, String>()
    mutableMap.put("Hello", "World")
    mutableMap.put("Happy", "Coding")
    for (entry in mutableMap) {
        val key = entry.key
        val value = entry.value
        println("${key} - ${value}")
    }

}