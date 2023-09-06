class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = 0;
        ListNode curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        ListNode[] ans = new ListNode[k];
        int x = n / k;

        curr = head;
        for (int i = 0; i < k; i++) {
            int realSize = x;
            if (i < n % k) {
                realSize++;
            }
            if (realSize == 0) {
                ans[i] = null;
                continue;
            }

            ans[i] = curr;

            for (int j = 0; j < realSize - 1; j++) {
                curr = curr.next;
            }

            ListNode temp = curr;
            curr = curr.next;
            temp.next = null;
        }

        return ans;
    }
};
