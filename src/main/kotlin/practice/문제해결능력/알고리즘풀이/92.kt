package practice.문제해결능력.알고리즘풀이

class Solve_92 {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        if (left == right || head == null) return head

        // find area
        var cnt : Int = 0
        var curr = head
        while (true) {
            if (cnt == left) break

            curr = curr?.next
            cnt++
        }

        

        return head
    }

}