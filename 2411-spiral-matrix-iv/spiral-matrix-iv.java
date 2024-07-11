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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr=new int[m][n];
       
        int minrow=0;
        int mincol=0;
        int maxrow=m-1;
        int maxcol=n-1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = -1;
            }
        }
        while(minrow<=maxrow && mincol<=maxcol){
            for(int i=mincol;i<=maxcol;i++){
               if(head!=null){
                arr[minrow][i]=head.val;
                 head=head.next;
               }
              
            }
            minrow++;
            for(int i=minrow;i<=maxrow;i++){
               if(head!=null){
                arr[i][maxcol]=head.val;
                 head=head.next;
               }
            }
            maxcol--;
            for(int i=maxcol;i>=mincol;i--){
                 if(head!=null){
                arr[maxrow][i]=head.val;
                 head=head.next;
               }
            }
            maxrow--;
            for(int i=maxrow;i>=minrow;i--){
                 if(head!=null){
                arr[i][mincol]=head.val;
                 head=head.next;
               }
            }
            mincol++;
        }
        return arr;
        
    }
}