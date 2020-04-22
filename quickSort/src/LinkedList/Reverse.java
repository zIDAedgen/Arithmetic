package LinkedList;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Reverse {
    private ListNode pre = null, curr = null;
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return pre;
        }

        curr = head.next;
        head.next = pre;

        pre = head;
        head = curr;
        return reverse(head);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
