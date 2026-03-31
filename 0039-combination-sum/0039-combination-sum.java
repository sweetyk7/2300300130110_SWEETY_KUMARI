class Solution {
    public static void Solve(int i,int[] candidates,int target,List<List<Integer>> ans,List<Integer> curr) {
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(i == candidates.length){
            return;
        }
        if(target >= candidates[i]){
            curr.add(candidates[i]);
            //unbounded(means 1 ele can take many times)  
            Solve(i,candidates,target-candidates[i],ans,curr);
            curr.remove(curr.size()-1);
        }
        Solve(i+1,candidates,target,ans,curr);
    }    
    public List<List<Integer>> combinationSum(int[] candidates, int target) { 
        List<List<Integer>> ans = new ArrayList();
        Solve(0,candidates,target,ans,new ArrayList<Integer>());
        return ans;
    }
}