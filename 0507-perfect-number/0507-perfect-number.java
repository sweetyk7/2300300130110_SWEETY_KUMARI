class Solution {
    public boolean checkPerfectNumber(int num) {
        int val = num;
        int sum = 1;
        // 1 isn't perfect num because in this excluding the number itself
        if(val == 1){
            return false;
        }

        //Ex:27 -> 1st i = 1,3 and then val/i = 27,9
        for(int i = 2;i*i<=val;i++){  //Ex:27 -> we cant take i=1 because val/i = 27 which will not add so we start from i = 2 and  sum = 1(because we will take 1 in summation)
            if(val%i == 0){
                sum = sum + i;
                if(i != val/i){  //Ex:36 -> if i=6 then we will not take val/6 because i==val/i;
                    sum = sum + val/i;
                }
            }
        }
        if(sum == num){
            return true;
        }
        else{
            return false;
        }
    }
}