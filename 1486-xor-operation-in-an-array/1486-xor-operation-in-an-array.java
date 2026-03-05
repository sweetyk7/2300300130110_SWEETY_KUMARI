class Solution {
    public int xorOperation(int n, int start) {
        int sum = start+2*0;
        for(int i=1;i<n;i++){
            int val = start + 2 * i;
            sum = sum ^ val;
        }
        return sum;
    }
}