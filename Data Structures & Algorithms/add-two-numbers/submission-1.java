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
        int extra=0;
        ListNode head=l1;
        ListNode curr=null;
        while(l1!=null && l2!=null){
            if(curr==null){
                curr=l1;
            }
            else{
                curr=curr.next;
            }
            int val=l1.val+l2.val+extra;
            curr.val=val%10;
            extra=val/10;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            curr.next=l1;
            curr=curr.next;
            int val=l1.val+extra;
            curr.val=val%10;
            extra=val/10;
            l1=l1.next;
        }

        while(l2!=null){
            curr.next=l2;
             curr=curr.next;
            int val=l2.val+extra;
            curr.val=val%10;
            extra=val/10;
            l2=l2.next;
        }

        if(extra>0){
            ListNode newNode=new ListNode(extra);
            curr.next=newNode;
        }
        return head;
    }
}
