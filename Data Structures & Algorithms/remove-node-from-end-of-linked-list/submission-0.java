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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode list = head;
        int sz = 0;
        while (list.next != null) {
            list = list.next;
            sz++;
        }
        if (sz == n - 1) {
            return head.next;
        }
        list = head;
        while (sz > n) {
            list = list.next;
            sz--;
        }

        list.next = list.next.next;

        return head;
    }
}
