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
    public boolean hasCycle(ListNode head) {
        ListNode list1 = head;
        ListNode list2 = head;

        while (true) {
            if (list2.next == null || list2.next.next == null) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next.next;

            if (list1 == list2) {
                return true;
            }

        }


    }
}
