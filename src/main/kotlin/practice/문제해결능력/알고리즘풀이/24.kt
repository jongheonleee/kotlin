package practice.문제해결능력.알고리즘풀이

class Solve_24 {
    fun swapPairs(head: ListNode?): ListNode? {
        // 검증
        if (checkNull(head)) return null

        // 초기 포인터
        var p1 : ListNode? = head
        var p2 : ListNode? = head?.next
        var prev : ListNode? = null
        var head2 : ListNode? = p2

        // 길이가 1일 때 탐색 x
        if (p2 == null) {
            return p1
        }

        while (p1 != null || p2 != null) {
            // 홀수인경우
            if (p2 == null) {
                return head2
            }

            // 짝수인 경우에 대해서만 참조 변경
            prev?.next = p2
            p1?.next = p2?.next
            p2?.next = p1

            // 포인트 이동
            prev = p1
            p1 = p1?.next
            p2 = p1?.next
        }

        return head2
    }

    fun checkNull(head : ListNode?) : Boolean {
        return head == null
    }



}