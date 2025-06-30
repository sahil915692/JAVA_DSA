// binary search 
/*
binary search is an "efficient searching alogorithm"
for sorted arrys
work
find mid of array 
if target == arr[mid]-->found
if target <<arr[mid]--> search left half
if target >> arr[mid]--> search right full

 // binary search in a sorted array

*/

// public class binarysearch {
//     public static void main(String[] args) {
//         int arr[] = {2, 4, 5, 9, 13};
//         int num_target = 15;
//         int low = 0;
//         int high = arr.length - 1;
//         boolean found = false;

//         while (low <= high) {  
//             int mid = (low + high) / 2;

//             if (arr[mid] == num_target) { 
//                 System.out.println("Element found at index: " + mid);
//                 found = true;
//                 break;
//             } else if (arr[mid] < num_target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         if (!found) {
//             System.out.println("Element not found.....!");
//         }
//     }
// }
//     public class binarysearch {
//     public static void main(String[] args) {

//         int num = 625;   
//         int low = 0;
//         int high = num;
//         int ans = -1;

//         while (low <= high) {
//             int mid = (low + high) / 2;
//             int midSq = mid * mid;

//             if (midSq == num) {
//                 ans = mid;
//                 break;
//             } else if (midSq < num) {
//                 ans = mid;      
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         System.out.println("Square root (integer part) of " +num +"="+ans);
//     }
// }
//  // recursion 
//  recursion is when a function call iyself to solve
//  smaller instance of 

//  // factorial 
//  public class binarysearch {
 
//     static
//  }