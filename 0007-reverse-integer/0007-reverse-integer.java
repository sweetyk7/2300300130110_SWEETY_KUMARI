class Solution {
    public int reverse(int x) {
        int val = x;
        int rev = 0;
        while(val != 0){
            int digit = val%10;
            // here,/10 use because we also check 2nd last ele -> assume 2nd last ele's max value is 6 and if the val is 7 or >6 then return 0
            if(rev > (Integer.MAX_VALUE/10) || (rev == (Integer.MAX_VALUE/10) && digit>7)){  
                return 0;
            }
            //Integer.MAX_VALUE = .........7  and  Integer.MIN_VALUE = .........8
            if(rev < (Integer.MIN_VALUE/10) || (rev == (Integer.MIN_VALUE/10) && digit<-8)){  
                return 0;
            }
            rev = (rev*10)+digit;
            val=val/10;
        }
        return rev;
    }
}