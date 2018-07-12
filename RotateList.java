package leetcode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        // connect the list to a cycle, find the breakPoint, cut and return new head
        ListNode index = head;
        int len = 1;
        while (index.next != null) {
            index = index.next;
            len++;
        }
        index.next = head;
        for (int i = 0; i < len - k % len - 1; i++) {
            head = head.next;
        }
        ListNode res = head.next;
        head.next = null;
        return res;
    }
}
