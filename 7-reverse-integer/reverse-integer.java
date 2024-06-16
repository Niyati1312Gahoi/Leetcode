class Solution {
    public int reverse(int x) {
        long num=0;
        int n=Math.abs(x);
        while(n>0){
            num=num*10+(n%10);
            n=n/10;
        }if(num>Integer.MAX_VALUE){
            return 0;
        }
        if(x<0) return -1*(int)num;
        else{
            return (int)num;
        }

    }
}