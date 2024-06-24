package practice.문제해결능력.알고리즘풀이

class Solve_328 {
    fun oddEvenList(head: ListNode?): ListNode? {
        val f1 : ListNode? = head
        val f2 : ListNode? = head?.next

        var c1 : ListNode? = f1
        var c2 : ListNode? = f2

        while (c1 != null || c2 != null) {
            c1?.next = c1?.next?.next
            c2?.next = c2?.next?.next

            c1 = c1?.next
            c2 = c2?.next
        }

        c1 = f1
        while (c1 != null && c1.next != null) {
            c1 = c1.next
        }
        c1?.next = f2

        return f1
    }
}