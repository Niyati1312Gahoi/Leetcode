class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb=new StringBuilder();
        int ca=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 ||j>=0 || ca==1){
            if(i>=0){
                ca+=a.charAt(i--)-'0';
            }if(j>=0){
                ca+=b.charAt(j--)-'0';
            }
            sb.append(ca%2);
            ca=ca/2;
        }  
        return sb.reverse().toString();      
    }
}