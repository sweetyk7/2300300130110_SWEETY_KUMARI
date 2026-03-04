//[2,21,12] -> Element_Sum = 2+21+12, Digit_Sum = 2+2+1+1+2
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int Element_Sum=0;
        int Digit_Sum=0;
        for(int i=0;i<n;i++){
            Element_Sum += nums[i];
        }
        for(int i=0;i<n;i++){
            while(nums[i]>0){
                int digit = nums[i]%10;
                Digit_Sum += digit;
                nums[i]=nums[i]/10;
            }
        }
        int final_difference = Math.abs(Element_Sum - Digit_Sum); // Math.abs is used for |x-y| means always give +ve val
        return final_difference;
    }
}