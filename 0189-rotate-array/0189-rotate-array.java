class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k==0 || n==0){
            return;
        }
        k=k%n;  // if k>n then k%n=k,ex -> k=7,l=5(till 5th rotate same arr and then remaining two rotates are only useful so we will take 7%5=2)
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public static void reverse(int[] nums,int i, int j){
        while(i<j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}