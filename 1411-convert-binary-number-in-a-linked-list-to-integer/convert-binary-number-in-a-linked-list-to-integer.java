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
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int n=0;
        int s=0;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=head.val;
        head=head.next;
       }
        int d=0;
       for(int i=arr.length-1;i>=0;i--){

       int x=(int)Math.pow(2,d);
        s=s+arr[i]*x;
        d++;
        
       }
       return s;
        
    }
}