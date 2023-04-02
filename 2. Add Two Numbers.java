
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 != null && l2 == null)
            return l1;
        if (l2 == null && l2 != null)
            return l2;

        ListNode ans = new ListNode();
        ListNode p = ans;

        int up = 0;

        int sum;

        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + up;
            up = sum / 10;
            p.next = new ListNode(sum % 10);

            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            sum = l1.val + up;
            up = sum / 10;
            p.next = new ListNode(sum % 10);

            p = p.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            sum = l2.val + up;
            up = sum / 10;
            p.next = new ListNode(sum % 10);

            p = p.next;
            l2 = l2.next;
        }

        if (up != 0)
            p.next = new ListNode(up % 10);

        return ans.next;
    }
}