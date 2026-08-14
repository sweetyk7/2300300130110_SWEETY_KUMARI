class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            int left = 0;
            int right = words[i].length() - 1; //Here taking string so , .length() uses
            while(left<right){
                if(words[i].charAt(left) == words[i].charAt(right)){
                    left++;
                    right--;
                }
                else{
                    break; //for to stop given index words[i] while-loop
                }   
            }
            if(left >= right){  //Now after to do all comparison
                return words[i];
            }  
        }
        return "";
    }
}