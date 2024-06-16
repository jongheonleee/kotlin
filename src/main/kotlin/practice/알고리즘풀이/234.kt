package practice.알고리즘풀이

// https://leetcode.com/problems/palindrome-linked-list/description/
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
class Solve_234 {
    fun isPalindrome(head: ListNode?): Boolean {
        // 유효성 검사
        if (head == null) return false
        // LL -> Arr
        val arr = convert(head)
        // 양방향 탐색
        val result = check(arr)
        return result
    }

    fun convert(head : ListNode?) : List<Int> {
        // LL -> Arr
        val arr = mutableListOf<Int>()
        var curr = head
        while (curr != null) {
            arr.add(curr.`val`)
            curr = curr.next
        }

        return arr
    }

    fun check(arr : List<Int>) : Boolean {
        // 양방향 탐색
        var left = 0
        var right = arr.size-1
        while (left < right) {
            if (arr[left++] != arr[right--]) {
                return false
            }
        }

        return true
    }
}