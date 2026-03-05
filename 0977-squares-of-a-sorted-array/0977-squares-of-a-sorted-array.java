class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i] = nums[i]*nums[i]; //We can't write(nums[i]^2) beacause ^ is bitwise operater not power
        }
        Arrays.sort(nums); //default in increasing order
        return nums;
    }
}