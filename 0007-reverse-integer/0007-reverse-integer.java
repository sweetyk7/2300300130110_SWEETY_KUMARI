class Solution {
    public int reverse(int x) {
        int val=x;
        int rev=0;
        while(val != 0){
            int digit=val%10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && digit>7)){
                return 0;
            }
            else if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && digit<-8)){
                return 0;
            }
            rev=rev*10+digit;
            val=val/10;
        }
        return rev;
    }
}