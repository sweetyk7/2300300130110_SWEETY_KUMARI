class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(); // for to make new list
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(ch==x){
                    list.add(i);
                    break;  // after find x then exit from current loop(loop of j) and will go to x-loop (means now check with next i value),qki agr us index ke words m kisi character m target(x) mil gya to hm phir usi index ke other ch ko q check krege sidha next index pe move krege
                }    
            }
        }
        return list;
    }
}