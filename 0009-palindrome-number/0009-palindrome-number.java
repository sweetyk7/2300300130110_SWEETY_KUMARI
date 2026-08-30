class Solution {
    public boolean isPalindrome(int x) {
        int val=x;
        int rev = 0;
        if(val<0){
            return false;
        }
        while(val>0){
            int digit = val%10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && digit>7)){
                return false;
            }
            rev=rev*10+digit;
            val=val/10;
        }
        if(rev == x){
            return true;
        }
        else{
            return false;
        }
    }
}