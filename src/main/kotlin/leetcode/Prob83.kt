package leetcode

object Prob83 {
    class ListNode(var `val`: Int = 0) {
        var next: ListNode? = null
    }

    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return head
        var current: ListNode = head

        while (true) {
            val next = current.next ?: break
            if (next.`val` == current.`val`) {
                current.next = next.next
            } else {
                current = next
            }
        }
        return head
    }
}