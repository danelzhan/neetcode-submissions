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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode give = null;
        ListNode result = null;
        boolean carry = false;
        int sum;

        while (l1 != null || l2 != null) {
            if (l1.next == null && l2.next != null) {
                l1.next = new ListNode(0);
            } else if (l2.next == null && l1.next != null) {
                l2.next = new ListNode(0);
            }
            if (carry) {
                sum = l1.val + l2.val + 1;
            } else {
                sum = l1.val + l2.val;
            }

            if (sum >= 10) {
                carry = true;
                sum = sum % 10;
            } else {
                carry = false;
            }
            if (result == null) {
                result = new ListNode(sum);
                give = result;
            } else {
                result.next = new ListNode(sum);
                result = result.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        if (carry) {
            result.next = new ListNode(1);
        }

        return give;
    }
}
