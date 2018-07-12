package leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode reverseHead = null;
        while (cur != null) {
            ListNode next = cur.next;
            if (next == null) {
                reverseHead = cur;
            }
            cur.next = prev; // reverse
            prev = cur; // this and next line equal to i++
            cur = next;
        }

        return reverseHead;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        return pre;
    }
}
