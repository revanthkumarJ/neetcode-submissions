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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode last=head;
        while(n>0){
            last=last.next;
            n--;
        }
        if(last==null)
        return head.next;

        ListNode curr=head;
        while(last!=null){
            
            last=last.next;
            if(last!=null){
                curr=curr.next;
            }
            else{
                curr.next=curr.next.next;
                break;
            }
            
        }
        return head;
    }
}
