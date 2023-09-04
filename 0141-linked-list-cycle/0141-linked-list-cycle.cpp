/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        unordered_map<ListNode*,int>m;
        bool x = 0;
        while(head)
        {
            m[head]++;
            if(m[head]>1)
            {
                x=1;
                break;
            }
            head = head->next;
        }
        return x;
    }
};