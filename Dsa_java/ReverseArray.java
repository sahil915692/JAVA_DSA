
// two pointer techniqe 
/*/
two pointer techique use to two index (pointers)
that move across the array to solve problem efficiency 


uses
1.soreted array or string 
2.finding pairs / triplets
3. reversing arrays 
4. removing Duplicates
5. sliding window varients 


basic concept 
basic pointer usually start at 
1.start and end of the array (for pair problems)
2.same direction (for comparing /merging )

 */
// find if array has a pair with given sum
// public class pointertechnique {
//     public static void main(String[] args) {
//         int arr[] = {2, 4, 7, 11, 15};
//         int num = 15;
//         int left = 0;
//         int right = arr.length - 1;
//         boolean found = false;
//         while (left < right) {
//             int sum = arr[left] + arr[right];
//             if (sum == num) {
//                 System.out.println("Pair found: " + arr[left] + " " + arr[right]);
//                 found = true;
//                 break;
//             } else if (sum < num) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         if (!found) {
//             System.out.println("Pair not found..");
//         }
//     }
// }

// reverese an array using two pointer 
// public class ReverseArray {
//     public static void main(String[] args) {
//         int arr[] = {10, 20, 30, 40, 5, 9, 4, 14, 65, 5};
//         int left = 0;
//         int right = arr.length - 1;
//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//         System.out.print("Reversed Array: ");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }



