class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
       // map.put("IV",4);
        map.put('V',5);
       // map.put("IX",9);
        map.put('X',10);
      //  map.put("XL",40);
        map.put('L',50);
       // map.put("XC",90);
       
        map.put('C',100);
       // map.put("CD",400);
        map.put('D',500);
      //  map.put("CM",900); 
        map.put('M',1000);

        int ans=0;
       
       for(int i=0;i<s.length();i++){
        if(i<s.length()-1&& map.get(s.charAt(i))< map.get(s.charAt(i+1))){
            ans-=map.get(s.charAt(i));
        }else{
            ans+=map.get(s.charAt(i));

        }

       }
       
       
       return ans;
      
    }
}