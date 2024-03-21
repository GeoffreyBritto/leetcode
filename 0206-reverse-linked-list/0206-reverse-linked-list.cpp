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
        ListNode* prev = nullptr;
        ListNode* curr = head;
        ListNode* nextNode = nullptr;
        
        while (curr != nullptr) {
            nextNode = curr->next; // Store the next node
            curr->next = prev;     // Reverse the pointer
            prev = curr;           // Move pointers one position ahead
            curr = nextNode;
        }
        
        return prev;
    }
};