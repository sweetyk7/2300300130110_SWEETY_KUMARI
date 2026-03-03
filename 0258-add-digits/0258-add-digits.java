class Solution {
    public int addDigits(int num) {
        while(num >= 10){   // if number is 10 or >10 then all case will go on,if not then automatic num print because it will be <10 means single digit 
            int sum = 0;  // example 38 -> 11(3+8),now take 11 and add their elements (1+1) so again we will take sum = 0 for to find their sum(0+1=1 and then 1+1=2);
            while(num > 0){ 
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}