class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            int count = 0;
            for(int j=0;j<sentences[i].length();j++){
                char ch = sentences[i].charAt(j);
                if(ch == ' '){
                    count++;
                }
            }
            int words_num = count + 1;
            max = Math.max(max,words_num);
        }
        return max;
    }
}