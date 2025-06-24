class Solution {
    public int arrangeCoins(int n) {
        if(n==1||n==0) return n;
        int s=0;
                for(int i=1;i<=n;i++){
         
            n=n-i;
            if(n>=0){
                s++;
            }
         
         
        }
        return s;
    }
}