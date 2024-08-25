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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode ans = new ListNode();
        ListNode result = ans;
        int carry=0;
        while(l1!=null && l2!=null)
        {
            int sum=carry+l1.val+l2.val;
            int num=sum%10;
            carry=sum/10;

            l1=l1.next;
            l2=l2.next;

            ans.next = new ListNode(num);
            ans=ans.next;
        }

        while(l1!=null)
        {
            int sum1=carry+l1.val;
            int num1=sum1%10;
            carry=sum1/10;

            l1=l1.next;
            ans.next = new ListNode(num1);
            ans=ans.next;
        }

        while(l2!=null){
            int sum2=carry+l2.val;
            int num2=sum2%10;
            carry=sum2/10;

            l2=l2.next;
            ans.next = new ListNode(num2);
            ans=ans.next;
        }

        if(carry != 0){
            ans.next = new ListNode(carry);
        }
        return result.next;
    }
}
