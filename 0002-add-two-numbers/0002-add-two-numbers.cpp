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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy = new ListNode(0);
        ListNode* tail = dummy;
        int carry = 0;
        while(l1 || l2 || carry){
            int sum = carry;
          if(l1!=0){
            sum = sum + l1->val;
            l1 = l1->next;// update the value of l1;
          }
          if(l2!=0){
            sum = sum + l2->val;
            l2 = l2->next;
          }
          tail->next = new ListNode(sum%10);// digit
          carry = sum/10;
          tail = tail->next;
        }
        return dummy->next;
        
    }
};