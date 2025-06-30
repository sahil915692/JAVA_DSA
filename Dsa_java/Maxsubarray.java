//sliding window is technique used to reduce the time complexity of
// some problems that involve linear data structure like array and string 
//use sliding window :subarray , fixed or variable sixe , consecutive elements,
//optimizing sum/ max/,min, etc 
// types of sliding window : fixed sized sliding window 
//variable size sliding window 
// maximum sum of subarray of sixe k
// fixed size window 
// public class Maxsubarray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 5, 8, 10 };
//         int k = 3;
//         int msum = 0, wsum = 0;

//         for (int i = 0; i < k; i++) {
//             wsum += arr[i];
//         }
//         msum = wsum;

//         // Sliding window
//         for (int i = k; i < arr.length; i++) {
//             wsum += arr[i] - arr[i - k];
//             msum = Math.max(msum, wsum);
//         }
//         System.out.println("Maximum sum of subarray of size " + k + " is " + msum);
//     }
// }


// public class Maxsubarray {
//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 5, 8, 10 };
//         int k = 2;
//         int msum = 0, wsum = 0;

//         for (int i = 0; i < k; i++) {
//             wsum += arr[i];
//         }
//         msum = wsum;

//         // Sliding window
//         for (int i = k; i < arr.length; i++) {
//             wsum += arr[i] - arr[i - k];
//             msum = Math.min(msum, wsum);
//         }
//         System.out.println("Maximum sum of subarray of size " + k + " is " + msum);
//     }
// }

// maximum average subarry of size 

