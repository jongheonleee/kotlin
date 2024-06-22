package practice.알고리즘풀이

import java.util.Collections

//class ListNode(var `val`: Int) {
//    var next: ListNode? = null
//}
class Solve_21 {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val arr1 = push(list1)
        val arr2 = push(list2)
        val join = join(arr1, arr2)
        return make(join)
    }

    private fun push(head : ListNode?) : List<Int> {
        var curr = head
        var arr = mutableListOf<Int>()

        while (curr != null) {
            arr.add(curr.`val`)
            curr = curr.next
        }

        return arr
    }

    private fun join(arr1 : List<Int>, arr2 : List<Int>) : List<Int> {
        val res = mutableListOf<Int>()

        for (i in arr1) {
            res.add(i)
        }

        for (i in arr2) {
            res.add(i)
        }

        Collections.sort(res)
        return res
    }

    private fun make(arr : List<Int>) : ListNode? {
        val head : ListNode? = null
        var curr = head

        for (i in arr) {
            curr = ListNode(i)
            curr = curr.next
        }

        return head
    }


}