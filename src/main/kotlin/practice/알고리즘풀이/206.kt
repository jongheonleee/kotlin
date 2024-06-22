package practice.알고리즘풀이

import java.util.Collections

class Solve_206 {
    fun reverseList(head: ListNode?): ListNode? {
        // 배열 저장
        val arr = mutableListOf<Int>()

        var curr = head
        while (curr != null) {
            arr.add(curr.`val`)
            curr = curr.next

        }

        // 배열 역정렬
        Collections.reverse(arr)

        // LL 생성 & 반환
        return if (arr.size > 0) {
            val head2 : ListNode
            var curr2 : ListNode

            head2 = ListNode(arr[0])
            curr2 = head2

            for (i in 1 .. arr.size-1) {
                curr2.next = ListNode(arr[i])
                curr2 = curr2.next!!
            }

            return head2
        } else null
    }
}