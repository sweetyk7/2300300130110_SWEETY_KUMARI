class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        if(s.length<=0) return ;
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}