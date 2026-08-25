class Solution {
    public boolean isPalindrome(int x) {
        int val = x;
        if(val<0){
            return false;
        }
        int rev = 0;
        while(val > 0){
            int digit = val%10;
            // here,/10 use because we also check 2nd last ele ->  2nd last ele's max value is 7 and if the val is >7 then return 0
            //Integer.MAX_VALUE = .........7
            if(rev > (Integer.MAX_VALUE/10) || (rev == (Integer.MAX_VALUE/10) && digit>7)){  
                return false;
            }
            rev = (rev*10)+digit;
            val=val/10;
        }
        if(rev==x){
            return true;
        }
        else{
            return false;
        }
    }
}