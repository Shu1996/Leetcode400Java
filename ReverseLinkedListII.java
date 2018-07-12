package leetcode;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        for (int i = 1; i < m; i++) {
            cur = cur.next;
            pre = pre.next;
        }
        for (int i = 0; i < n - m; i++) {
            ListNode temp = cur.next; // temp is different every time, but cur is always the first node and pre is always the same
            cur.next = temp.next; // the first node always points to the changing node
            temp.next = pre.next; // the changing node always points to the last changing node
            pre.next = temp; // pre points to the new changing point
        }

        return dummy.next;
    }
}
