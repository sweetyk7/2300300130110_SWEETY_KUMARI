class Solution {
    public int subtractProductAndSum(int n) {
        int sumOfDigits = 0;
        int prodOfDigits = 1;
        while(n>0){
            int digit = n%10;
            sumOfDigits = sumOfDigits + digit;
            prodOfDigits = prodOfDigits * digit;
            n=n/10;
        }
        int diff = (prodOfDigits-sumOfDigits);
        return diff;
    }
}