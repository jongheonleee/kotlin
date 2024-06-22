package book.part3.다양한코틀린클래스

// enum은 익명 클래스의 객체, 따라서 enum을 익명 클래스 객체로 사용 가능
enum class Direction3 {

    NORTH {
        override val data1: Int
            get() = TODO("Not yet implemented")

        override fun myFun() {
            TODO("Not yet implemented")
        }
    },
    SOUTH {
        override val data1: Int
            get() = TODO("Not yet implemented")

        override fun myFun() {
            TODO("Not yet implemented")
        }
    };

    abstract val data1 : Int
    abstract fun myFun()
}

fun main(args : Array<String>) {
    Direction3.NORTH
}