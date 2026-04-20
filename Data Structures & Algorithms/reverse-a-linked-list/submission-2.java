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
        if (head == null) return null;

        ListNode newHead = head;
        ListNode last;

        if (head.next != null) {
            newHead = reverseList(head.next);
            last = newHead;
            while (last.next != null) {
                last = last.next;
            }
            head.next = null;
            last.next = head;
            return newHead;
        }

        return head;
    }
}
