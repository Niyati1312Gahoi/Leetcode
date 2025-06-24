class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2){
            return true;
        }
        int l=2;
        int h=num/2;
        while(l<=h){
            int mid=(l+h)/2;
            if((long)mid*mid==num){
                return true;
            }else if((long)mid*mid<num){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }        
        return false;
    }
}