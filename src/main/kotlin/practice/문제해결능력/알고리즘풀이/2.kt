package practice.문제해결능력.알고리즘풀이
// 0. 검증
    // 널 확인

// 1. 초기화 작업
    // 포인터 생성 -> p1, p2
    // head, curr 생성

// 2. 탐색 및 계산
    // sum 계산
        // num = sum % 10
        // next = sum / 10

// 3. 반환
    // head
class Solve_2 {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        if (checkNull(l1, l2)) return null
        return travelNCreate(l1, l2)
    }

    fun checkNull(l1: ListNode?, l2: ListNode?) : Boolean {
        return l1 == null && l2 == null
    }

    fun travelNCreate(l1: ListNode?, l2: ListNode?) : ListNode? {
        var p1 : ListNode? = l1
        var p2 : ListNode? = l2

        var head : ListNode? = null
        var curr : ListNode? = null


        var next = 0
        while (p1 != null || p2 != null) {
            var sum = 0
            var num = 0
            when {
                p1 != null && p2 != null -> {
                    sum = p1.`val` + p2.`val` + next
                    p1 = p1.next
                    p2 = p2.next
                }
                p1 == null && p2 != null -> {
                    sum = p2.`val` + next
                    p2 = p2.next
                }
                p1 != null && p2 == null -> {
                    sum = p1.`val` + next
                    p1 = p1.next
                }
            }

            num = sum % 10
            next = sum / 10

            if (head == null) {
                head = ListNode(num)
                curr = head
            } else {
                curr?.next = ListNode(num)
                curr = curr?.next
            }
        }

        return if (next != 0) {
            curr?.next = ListNode(next)
            head
        } else head
    }


}