class Solution {
    public boolean judgeCircle(String moves) {
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'R'){
                count1++;
            }
            else if(ch == 'L'){
                count1--;
            }
            else if(ch == 'U'){
                count2++;
            }
            else if(ch == 'D'){
                count2--;
            }
        }
        if((count1 == 0) && (count2 == 0)){
            return true;
        }
        else{ 
            return false;
        }
    }
}