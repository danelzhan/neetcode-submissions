/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        return reverse(new ListNode(head.val), head.next);
    }

    public ListNode reverse(ListNode list, ListNode head) {
        if (head.next == null) {
            return new ListNode(head.val, list);
        }

        return reverse(new ListNode(head.val, list), head.next);

    }

}
