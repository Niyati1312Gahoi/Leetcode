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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null ) return head;
        ListNode dummpy=new ListNode(0);
        ListNode temp=dummpy;
        dummpy.next=head;
        while(dummpy!=null && dummpy.next!=null){
            if(dummpy.next.val==val){
                dummpy.next=dummpy.next.next;

            }else{
            dummpy=dummpy.next;
            }
        }
        return temp.next;
        
    }
}