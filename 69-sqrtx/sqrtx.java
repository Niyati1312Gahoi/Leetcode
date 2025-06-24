class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x;
      
      int l=1,h=x/2;
      int ans=0;
      while(l<=h){
        int mid=l+(h-l)/2;
        long s=(long)mid*mid;
        if(s==x){
         return mid;
        }else if(s<x){
            ans=mid;
            l=mid+1;
        }else{
            h=mid-1;
        }
      }
        return ans;
    }
}