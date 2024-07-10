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
    public ListNode doubleIt(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode left=dummy;
        ListNode right=head;
        while(right!=null){
            if(right.val*2>=10){
                left.val+=(right.val*2)/10;
            }
            right.val=(right.val*2)%10;
            left=left.next;
            right=right.next;
        }
        return dummy.val>0 ?dummy:head;
        
    }
}