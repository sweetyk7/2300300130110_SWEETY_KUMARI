class Solution {
    public boolean canAliceWin(int[] nums) {
        int n = nums.length;
        int singleDigitSum = 0;
        int doubleDigitSum = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0 && nums[i]<=9){
                singleDigitSum = singleDigitSum + nums[i];
            }
            else if(nums[i]>=10 && nums[i]<=99){
                doubleDigitSum = doubleDigitSum + nums[i];
            }
        }
        if(singleDigitSum > doubleDigitSum || singleDigitSum < doubleDigitSum){
            return true;
        }
        return false;
    }
}