//without recursion
// class Solution {
//     public void reverseString(char[] s) {
//         int i = 0;
//         int j = s.length-1;
//         if(s.length<=0) return ;
//         while(i<j){
//             char temp = s[i];
//             s[i]=s[j];
//             s[j]=temp;
//             i++;
//             j--;
//         }
//     }
// }


//without recursion
class Solution {
    public void reverseString(char[] s) {
        Solve(s,0,s.length-1);
    }    
    public void Solve(char[] s, int i, int j) {
        if(i>=j) return ;
        char temp = s[i];
        s[i]=s[j];
        s[j]=temp;
        Solve(s,i+1,j-1);
    }
}