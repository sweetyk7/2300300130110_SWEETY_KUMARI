// with recursion
// class Solution {
//     public int search(int[] nums, int target) {
//         int n = nums.length; 
//         int left=0;
//         int right=n-1;
//         while(left<=right){
//             int mid = left + (right-left)/2;
//             if(nums[mid]==target) return mid;
//             if(nums[mid]<target){
//                 left=mid+1;
//             }
//             else{
//                 right=mid-1;
//             }
//         }
//         return -1;
//     }
// }

// with recursion
class Solution {
    public int search(int[] nums, int target){
        return Solve( 0,nums.length-1,target,nums);
    }
    public int Solve(int left,int right,int target,int[] nums) {
        if(left > right) return -1;
        int mid = left + (right-left)/2;
        if(nums[mid]==target) return mid;
        else if(nums[mid]>target){
            return Solve(left,mid-1,target,nums);
        }
        else{
            return Solve(mid+1,right,target,nums);
        }
    }
}