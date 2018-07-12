package leetcode;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode breakPoint = null;
        // find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            breakPoint = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        breakPoint.next = null; // cut off the list into 2
        ListNode l1 = head;
        ListNode l2 = reverse(slow);
        merge(l1, l2);
    }

    private ListNode reverse(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }

        return pre;
    }

    private void merge(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) { // can also write "while (l1 != l2) {}"
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;
            l1.next = l2;
            if (n1 == null) {
                break;
            }
            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }
    }
}
