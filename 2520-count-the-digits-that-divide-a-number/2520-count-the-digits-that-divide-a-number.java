class Solution {
    public int countDigits(int num) {
        int original = num; //because we will take all every digit and compare with given number(num) but under while-loop,num will be decrease so we can't take original num val (Ex-> num=121 in this,1%121,2%121,1%121 mtlb in all (num=121)) so,we already took the original value for to comparing with all digits seperatly
        int count = 0;
        while(num>0){
            int digit = num%10;
            if(original % digit == 0){ //now we can original val
                count ++;
            } 
            num = num/10;
        }
        return count;
    }    
}