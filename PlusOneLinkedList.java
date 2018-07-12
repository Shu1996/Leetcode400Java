package leetcode;

public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode i = dummy;
        ListNode j = dummy;
        while (i.next != null) {
            i = i.next;
            if (i.val != 9) {
                j = i;
            }
        }
        j.val++;
        j = j.next;
        while (j != null) {
            j.val = 0;
            j = j.next;
        }
        return dummy.val == 0 ? dummy.next : dummy;
    }

    public ListNode plusOne2(ListNode head) {
        head = reverseHead(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int carry = 1;
        ListNode cur = dummy;
        while (carry > 0 || cur.next != null) {
            if (cur.next != null) {
                cur = cur.next;
                carry += cur.val;
                cur.val = carry % 10;
                carry /= 10;
            } else {
                cur.next = new ListNode(1);
                cur = cur.next;
                carry = 0;
            }
        }
        return reverseHead(dummy.next);
    }

    private ListNode reverseHead(ListNode head) {
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
