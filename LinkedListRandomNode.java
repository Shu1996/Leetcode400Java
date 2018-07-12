package leetcode;

import java.util.Random;

public class LinkedListRandomNode {

    private ListNode head;
    private Random random;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public LinkedListRandomNode(ListNode head) {
        this.head = head;
        random = new Random();
    }

    /** Returns a random node's value. */
    public int getRandom() {
        ListNode temp = head;
        int res = temp.val;
        int i = 1;
        while (temp.next != null) {
            temp = temp.next;
            if (random.nextInt(++i) == 0) {
                res = temp.val;
            }
        }

        return res;
    }
}
