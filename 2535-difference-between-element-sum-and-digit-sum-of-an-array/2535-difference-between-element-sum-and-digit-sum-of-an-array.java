class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digitSum = 0;
        for(int i=0;i<nums.length;i++){
            eleSum = eleSum + nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];  //No changes in actual val of nums[i]
            while(temp>0){
                int digit = temp%10;
                digitSum = digitSum + digit;
                temp = temp/10;
            }
        }
        int ans = Math.abs(eleSum-digitSum);
        return ans;
    }
}