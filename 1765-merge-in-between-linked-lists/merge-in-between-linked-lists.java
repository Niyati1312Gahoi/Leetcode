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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp=list1;
      
        int i=0;
        while(i<a-1){
            temp=temp.next;
            i++;
        }
        ListNode curr=temp;
        while(i<b+1){
            temp=temp.next;
            i++;
        }
        ListNode curr2=temp;
        ListNode tail=list2;
        ListNode head=list2;
        while(tail.next!=null){
            tail=tail.next;
        }
        curr.next=head;
        tail.next=curr2;

        return list1;

        
    }
}