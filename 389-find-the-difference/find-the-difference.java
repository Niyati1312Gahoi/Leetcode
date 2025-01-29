class Solution {
    public char findTheDifference(String s, String t) {
     int st=0;
     for(int i=0;i<s.length();i++) st=st^s.charAt(i);
     for(int j=0;j<t.length();j++) st=st^t.charAt(j);

     return (char) st;

        
    }
}