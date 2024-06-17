package practice.클래스생성

import org.testng.annotations.Test

class MyPointTest {
    @Test
    fun create() {
        // MyPoint
        val m = MyPoint(1, 1)
        assert(m != null)
    }

    @Test
    fun create2() {
        // MyPoint2
        val m = MyPoint2(1, 1)
        assert(m != null)
        m.x = 10
        assert(m.x == 10)
        m.y = 10
        assert(m.y == 10)
    }

    @Test
    fun create3() {
        // MyPoint3
        val m = MyPoint3(1, 1)
        assert(m != null)

        m.x = -100
        assert(m.x != -100 && m.x == 1)

        m.y = 100
        assert(m.y == 100)

    }
}