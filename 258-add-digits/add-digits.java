class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int temp=num;
        int sum=0;
        while(num>0){
            int r=num%10;
            sum+=r;
            num= num/10;
            if(sum>9 && num==0){
                num=sum;
                sum=0;
            }

        }
        return sum;

        
    }
}