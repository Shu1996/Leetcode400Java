package leetcode;

public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = null;
        ListNode temp = null;
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val <= cur.next.val) {
                cur = cur.next;
            } else {
                temp = cur.next;
                cur.next = temp.next;
                pre = dummy;
                while (pre.next.val <= temp.val) {
                    pre = pre.next;
                }
                temp.next = pre.next;
                pre.next = temp;
            }
        }

        return dummy.next;
    }
}
