package practice.문제해결능력.알고리즘풀이

import java.util.Collections

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}
class Solve_21 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        return if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        }
    }

}