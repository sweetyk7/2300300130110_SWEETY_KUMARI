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
            if(left == right){ // after checking palindrome,now we return palindrom word so i use this condition (because in last,Ex-> aba,left=b & right =b )      
                return words[i];  // after confirm palindrom then return the palindrom words       
            }
        }
        return "";
    }
}