/*
 SEARCHING
 searching is the process to find the postion of a target element 
 in a collection (like array or list)


 linear search
 linear search check each element one by one until the target is found 
 or end of the array is reached
 */

// import java.util.Scanner;
// public class searching {
//     public static void main(String[] args) {
//         int[] arr = {10, 25, 30, 45, 50};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter element:");
//         int target = sc.nextInt();
//         boolean found = false;

//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] == target) {
//                 System.out.println("Element found at index " + i);
//                 found = true;
//                 break;
//             }
//         }

//         if(!found) {
//             System.out.println("Element not found");
//  }
// }
// }
  


/*/
 * Binary Search
 * Binary search is an divide-and-conqure algoritham that works only
 * on sorted array.It repeadedly devide the search space in half 
 * 
 * 
 * Steps:
 * find the middel element.
 * if its the target -> return index
 * if  target < middle -> search left half
 * if target > middle -> search right half 
 * use 
 * Array must be sorted
 * Efficient of large dataset(o(log(n)))
 */

// import java.util.Scanner;

// public class searching {
//     public static void main(String[] args) {
//         int[] arr = {10, 25, 30, 45, 50};
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter element:");
//         int target = sc.nextInt();
//         int low = 0;
//         int high = arr.length - 1;
//         boolean found = false;
//         while (low <= high) {
//             int mid = (low + high) / 2;
//             if (arr[mid] == target) {
//                 System.out.println("Element found at index: " + mid);
//                 found = true;
//                 break;
//             } else if (arr[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         if (!found) {
//             System.out.println("Element not found");
// }
// }
// }




