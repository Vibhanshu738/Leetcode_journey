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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        ListNode prev = null;
        temp = head;

        while (count > 0) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
            count--;
        }

        head.next = reverseKGroup(temp, k);

        return prev;
    }
}
    
