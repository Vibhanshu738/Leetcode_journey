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
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode middle=head;
        int count=0,n=0;
        Stack<Integer> s=new Stack<>();
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        if(count==1)
        {
            return true;
        }
        count=count/2;
        while(middle!=null)
        {
            if(n<count)
            {
               s.push(middle.val);
            }
            else if (middle.val==s.peek())
            {
                s.pop();
            }
            else{
            }
            middle=middle.next;
            n++;
        }
        if(s.isEmpty())
        {
            return true;
        }
    return false;
    }
}