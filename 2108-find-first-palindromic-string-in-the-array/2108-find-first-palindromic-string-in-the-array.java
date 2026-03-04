class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++){

            int left = 0;
            int right = words[i].length() - 1;

            while(left < right){
                if(words[i].charAt(left) != words[i].charAt(right)){
                    break;
                } 
                else{
                    left++;
                    right--;
                }   
            }
            if(left >= right){ // after checking palindrome,now we have to return palindrom word so i use this condition (because in last: 1.for odd length(aba),after checking a & a -> left=b(i=2) & right=b(i=2),so left==right and also in last:2.for even length(abba),after checking ab & ba -> left=b(i=2) &  right=b(i=1) so left>right (rememeber for even len after checking left(i=0 & i=1) and right(i=4 & i=3),after that left=b(i=2) &  right=b(i=1))    
                return words[i];  // after confirm palindrom then return the palindrom words       
            }
        }
        return "";
    }
}