/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        ListNode* temp = head;

        ListNode* curr = head->next;
        ListNode* hold = head->next->next;

        while (curr != nullptr) {
            curr->next = head;
            head = curr;
            curr = hold;
            if (hold != nullptr) {
                hold = hold->next;
            }
        }

        temp->next = nullptr;
        return head;

    }
};
