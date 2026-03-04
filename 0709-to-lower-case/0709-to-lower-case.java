// I don't use this easy method beacause company ask without using  built-in-function(like s.toLowerCase())
    // class Solution {
    //     public String toLowerCase(String s) {
    //         return s.toLowerCase();
    //     }
    // } 
    


class Solution {
    public String toLowerCase(String s) {
        String ans = ""; //In Java,String is immutable so we will take a new string and add characters in this to find final ans
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){  // because we will use ASCII Value differences between same alphabet where one is in uppercase and another is in lowercase and always differences between them is 32 (Ex -> ASCII Value(A)=65 and ASCII Value(a)=97,and can see difference is 32(97-65) and 32 differences will be only for A to Z which are converted into a to z )
                ch = (char)(ch + 32); // for to convert in lowercase (ASCII Value(a)=ASCII Value(A)+32) and also we can't write ch = char(ch + 32) because 32 is int and for to convert int to char,we use type casting so we write (char).......;
            }
            ans = ans + ch; // if already in lowercase then add and if in uppercase then if-condition will use and then converted lowercase will be add
        }
        return ans;
    }
}


