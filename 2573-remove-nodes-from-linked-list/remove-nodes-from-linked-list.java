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
    public ListNode removeNodes(ListNode head) {
        ListNode temp=reverse(head);
        ListNode dummy=new ListNode(0);
        ListNode start=dummy;
        Stack<Integer> st=new Stack<>();
        st.push(temp.val);
        
        
        while(temp!=null){
            if(!st.isEmpty() && temp.val >= st.peek()){
                st.push(temp.val);
                dummy.next=new ListNode(temp.val);
                dummy=dummy.next;
                
            }
            temp=temp.next;
        }
       return reverse(start.next);
        
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