class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(int i=0;i<sentences.length;i++){ // the reason to do not take sentences.length() -> because all sentences are seperated["....","...","...."] and we easily find this sentences with their index
            int count = 0;  // beacause we count spaces under sentences and also we count all spaces of different sentence so we have to initialize count = 0 (taki her sentenses ke liye count 0 se le paye nhi to dusre sentence ka count bhi usme add ho jayega)
            for(int j=0;j<sentences[i].length();j++){ // now we check characters in each sentence
                char ch = sentences[i].charAt(j);
                if(ch == ' '){
                    count++;
                }
            }
            ans = Math.max(ans,count); // now we compare all words of their each sentence
        }
        return ans+1;  // words = spaces(count) + 1
    }
}