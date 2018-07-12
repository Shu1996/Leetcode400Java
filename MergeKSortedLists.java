package leetcode;

public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return sort(lists, 0, lists.length - 1);
    }

    private ListNode sort(ListNode[] lists, int low, int high) {
        if (low >= high) {
            return lists[low];
        }
        int mid = (high - low) / 2 + low;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid + 1, high);
        return merge(l1, l2);
    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }

        return dummy.next;
    }
}
