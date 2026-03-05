class Solution {
    public int xorOperation(int n, int start) {
        int sum = start+2*0; // because we do bitwise opertion at starting index(i=0)
        for(int i=1;i<n;i++){  //now we take xor operation with next element,i=1 to i<n
            int val = start + 2 * i; 
            sum = sum ^ val;
        }
        return sum;
    }
}