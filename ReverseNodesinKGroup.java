package leetcode;

public class ReverseNodesinKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null && count < k) {
            cur = cur.next;
            count++;
        }
        if (count == k) {
            cur = reverseKGroup(cur, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = cur; // cur is the node you are going to append to
                cur = head;
                head = temp;
            }
            head = cur;
        }

        return head;
    }
}
