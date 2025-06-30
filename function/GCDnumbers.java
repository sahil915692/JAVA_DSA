// //  package function;
// // import java.util.*;

// // public class GCDnumbers{
// // public static int main(String[] args) {      
// //         Scanner sc = new Scanner(System.in);
// //         int num1 = sc.nextInt();
// //         int num2 = sc.nextInt();
// // while(num2 > 0){
// //     int temp =num2;
// //     num2=num1%num2;
// //     num1=temp;
// // }
// //  return num1 ;
// // }
// // public static void main(String[] args) {
// //     System.out.println(num1);
    
// // }
// // }
//   package function;
// import java.util.*;
// public class GCDnumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         int gcd = findGCD(num1, num2);
//         System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//     }
//     public static int findGCD(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }
