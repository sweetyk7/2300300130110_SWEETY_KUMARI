class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int final_wealth = 0;
        for(int i=0;i<n;i++){
            int curr_wealth = 0;
            for(int j=0;j<accounts[i].length;j++){
                curr_wealth = curr_wealth + accounts[i][j];  //Ex -> [[1,2],[3,8]] here [0][0]=1(i=0 ka 1st element(j=0) is 1)
            }
            final_wealth = Math.max(final_wealth,curr_wealth);
        }
        return final_wealth;
    }
}