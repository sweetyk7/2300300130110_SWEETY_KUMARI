class Solution {
    public double myPow(double x, int n) {
        if(n<0){
            n=Math.abs(n);
            x=1/x;
        }
        return power(x,n);
    }
    public double power(double x,int n){
        if(n==0) return 1;  // x^0 = 1
        double half = power(x,n/2);
        if(n%2==0){
            return half*half;  // 2^10 = 2^5 * 2^5
        }
        else{
            return half*half*x;  //2^10 = 2^5 * 2^5 * 2
        }
    }
}