class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int current_sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);   
        for(int i=0;i<n;i++){
            current_sum += nums[i];
            if(map.containsKey(current_sum - k)){
                count += map.get(current_sum - k);
            }
            map.put(current_sum,map.getOrDefault(current_sum,0)+1);
        }
        return count;
    }
}