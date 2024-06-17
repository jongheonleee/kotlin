package book.part3

open class Super3 {
    open var x : Int = 10
    open fun someFun() {
        println("Super ... someFun()")
    }
}

class Sun3 : Super3() {
    override var x : Int = 20
    override fun someFun() {
        super.someFun()
        println("Sub .. ${super.x} .. $x")
    }
}