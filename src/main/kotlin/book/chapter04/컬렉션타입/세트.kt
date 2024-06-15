package book.chapter04.컬렉션타입

// set -> Set, MutableSet

fun main(args : Array<String>) {
    val immutableSet = setOf<String>("Hello", "World")
    for (s in immutableSet) {
        print(s)
    }

    val mutableSet = mutableSetOf<String>()
    mutableSet.add("Yeonuel")
    mutableSet.add("Hanuel")

    for (s in mutableSet) {
        print(s)
    }

}