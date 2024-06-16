package book.part3

import kotlin.properties.Delegates
// 프로퍼티 값이 변경되는 순간 감지하는 방법
    // by Delegates.observable(람다) 사용
    // 변경될 때 마다, 명시된 명령어 수행
fun main(args : Array<String>) {
    val u = User()
    println(u.name)
    u.name = "Yeonuel"
    u.name = "Hanuel"
    println(u.name)
}

class Display {

    var name : String by Delegates.observable("nonValue", {props, old, new ->
        println("old : $old ... new  : $new")
    })
}