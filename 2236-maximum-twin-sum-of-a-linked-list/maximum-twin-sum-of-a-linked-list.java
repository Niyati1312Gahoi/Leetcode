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
    public int pairSum(ListNode head) {
       ListNode temp=head;
       int max=Integer.MIN_VALUE;
        ListNode mid=mid(head);
        ListNode head2=reverse(mid);
        while(head!=null && head2!=null){
            int sum=(head.val+head2.val);
            max=Math.max(max,sum);
            head=head.next;
            head2=head2.next;
        }
        return max;
        
    }
    public ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;

        }
        return prev;
    }
}