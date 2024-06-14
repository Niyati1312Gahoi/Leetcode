class Solution {
    public boolean isPalindrome(int x) {
          int revNum = 0;
  int tempx = x;

  while (tempx > 0) {

    int lastDigit = tempx % 10;
    revNum = revNum * 10 + lastDigit;
    tempx= tempx / 10;
  }

  if (x == revNum) {
    return true;
  } else {
    return false;
  }


        
        
    }
}