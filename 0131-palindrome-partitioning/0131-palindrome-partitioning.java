class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList();
        List<String> curr = new ArrayList();
        Solve(0,s,ans,curr);
        return ans;
    }
    //check palindrome
    public static boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }    
    public static void Solve(int i,String s,List<List<String>> ans,List<String> curr){
        if(i==s.length()){
            ans.add(new ArrayList<String>(curr)) ;
            return ;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s.substring(i,j+1))){
            curr.add(s.substring(i,j+1));
            Solve(j+1,s,ans,curr);
            curr.remove(curr.size()-1);
            }
        }
    }
}