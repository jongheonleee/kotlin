package book.chapter04.컬렉션타입

// List -> List(listOf()), MutableList(mutableListOf())
// 불변과 가변으로 나뉨(기본적으로 불변)

fun main(args : Array<String>) {
    // 불변
    val immutableList : List<String> = listOf("Hello", "Yeonuel")
    for (s in immutableList) {
        println("name : ${s}")
    }

    // 가변
    val mutableList : MutableList<String> = mutableListOf("Hello", "Yeonuel")
    mutableList.add("Hanuel")
    mutableList.set(1, "yeonuel")

    for (s in mutableList) {
        println("name : ${s}")
    }

    // ArrayList
    val arrList : ArrayList<String> = ArrayList()
    arrList.add("Hello")
    arrList.add(" ")
    arrList.add("World")

    for (s in arrList) {
        print(s)
    }
}