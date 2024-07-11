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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        ListNode head1=dummy;
        ArrayList<ListNode> ll=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ll.add(temp);
            temp=temp.next;
        }
        int j=ll.size()-k;
        ListNode swap=ll.get(k-1);
        ll.set(k-1,ll.get(j));
        ll.set(j,swap);
        
     for(ListNode Node:ll){
        dummy.next=Node;
        dummy=dummy.next;
     };
     dummy.next=null;
     return head1.next;
                
    }
}