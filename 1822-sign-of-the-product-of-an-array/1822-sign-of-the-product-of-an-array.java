class Solution {
    public int arraySign(int[] nums) {
        int n = nums.length;
        int sign = 1;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                    return 0;
            }
            else if(nums[i]<0){
                sign=-sign;  // if nums[2] = -5 then sign = -sign means -1 and then check for next if next nums[3] = 2 then sign means same -1(because -val * +val = -val) and if nums[3]=-2 then sign =-sign means -(-1)=1
            }
        }
        return sign;       
    }
}