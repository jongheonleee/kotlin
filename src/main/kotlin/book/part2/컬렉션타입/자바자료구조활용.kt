package book.part2.컬렉션타입

import java.util.ArrayList
import java.util.HashSet

fun main(args:Array<String>) {
    val jList : ArrayList<String> = ArrayList()
    jList.add("Hello")
    jList.add("World")
    println("${jList.get(0)} .. ${jList.get(1)}")

    val jSet : HashSet<String> = HashSet()
    jSet.add("Happy")
    jSet.add("Coding")
    println("${jSet.elementAt(0)} .. ${jSet.elementAt(1)}")

    val jMap : HashMap<String, String> = HashMap()
    jMap.put("Yeonuel", "Hanuel")
    jMap.put("Happy", "World")
    println("${jMap.get("Yeonuel")} .. ${jMap.get("Happy")}")

}