/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int len1=0;
        int len2=0;
        while(temp1.next!=null)
        {
            len1++;
            temp1=temp1.next;
        }
        while(temp2.next!=null)
        {
            len2++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(len1>len2)
        {
            int a =len1-len2;
            while(a>0)
            {
                temp1=temp1.next;
                a--;
            }
        }
        else
        {
            int a =len2-len1;
            while(a>0)
            {
                temp2=temp2.next;
                a--;
            }
        }
        while(temp1!=null &&temp2!=null)
        {
            if(temp1==temp2)
            {
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        return null;
    }
}