class Solution {
    public int calPoints(String[] operations) {
        int  n = operations.length;
        int sum=0;
        List<Integer> list = new ArrayList<>(); 
        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){ // for to compare with string
                list.remove(list.size()-1); //for to remove last element from the list
            }
            else if(operations[i].equals("D")){
                int lastElement = list.get((list.size()-1));
                list.add(2*lastElement);    
            }
            else if(operations[i].equals("+")){
                int lastElement = list.get((list.size()-1)); 
                int SecLastElement = list.get((list.size()-2));
                list.add(lastElement+SecLastElement);
            }
            else{
                list.add(Integer.parseInt(operations[i]));  // used for to convert integer-string("3") into integer(3)
            }
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }
}