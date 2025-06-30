/*/
//Backtracking//
*Backtracking is a recursive algorith used for solving 
*decision problem ,combinational problem and optimization problem 
*


* key pointes
1.build soluction increamentally
if current path fail ,go back (undo ) and try another path 

common apllications 
*N-Queens problem
*Sudoku Solver
*maze solving 
*subset and permutations
*combination sum
* pailndrome partitoning  




***structure
void backtracking (current _state ){
if(soluction found)
save soluction;
for (choics){
make a choics ;
backtracking(updated _state);
undo the choice;
}
}

 */


 // print all subset of a string 
//  public class Backtracking {
//     static void subString(String str,int idx,String curr){
//     if( idx==str.length()){
//       System.out.println(curr);
//       return;
//     }
//     //current char
//     subString(str,idx +1,curr +str.charAt(idx));    
//     //exclude char
//     subString(str,idx + 1 , curr);
//    }
//     public static void main(String[] args) {
//         subString("abcd", 1,"");
// }
// }
 // Generate all binary string of length k
// public class Backtracking{
//     static void Backtracking(int k, String curr) {
//         int num;
//         if (num== 0) {
//             System.out.println(curr);
//             return;
//         }
//         // each time add 0
//         Backtracking(num - 1, curr + "0");
//         Backtracking(num- 1, curr + "1");
//     }
//     public static void main(String[] args) {
//         int k = 3;
//         Backtracking(num:3 s:"");
//     }
// }

//