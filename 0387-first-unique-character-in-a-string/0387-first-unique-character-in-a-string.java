class Solution {
    public int firstUniqChar(String s) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int count=0;
            for(int j=0;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;
                }
                if(count>1){
                    break;
                }
            }
            if(count==1){
                return i;
            }
        }
        return -1;
    }
}