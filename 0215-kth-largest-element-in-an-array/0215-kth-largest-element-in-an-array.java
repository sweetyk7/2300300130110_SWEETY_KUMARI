class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // Min heap
        for(int num:nums){
            pq.offer(num);  // Add all ele of the arr
            if(pq.size() > k){
                pq.poll();  // remove ele
            }
        }
        return pq.peek(); // tell ele on top
    }
}