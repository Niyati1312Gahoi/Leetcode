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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummpy= new ListNode(0);
        ListNode temp=dummpy;
        int sum = 0;
        
        head = head.next;
        while(head!=null){
            if(head.val!=0){
                sum+=head.val;
               
            }else{
                 temp.next = new ListNode(sum);
                    temp = temp.next;
                    sum = 0;

            }

                head=head.next;
           
            
        }
        return dummpy.next;
    }
}