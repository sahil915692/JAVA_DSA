// public class AvgSubArray {
//     public static void main(String[] args) {
//         int arr[] = {2,15,-6,-8,30,3};
//         int k = 6;
//         int sum = 0;
//         for (int i = 0; i < k; i++) {
//             sum += arr[i];
//         }
//         int maxSum = sum;
//         for (int i = k; i < arr.length; i++) {
//             sum = sum + arr[i] - arr[i - k];
//             maxSum = Math.max(maxSum, sum);
//         }
//         double avg = (double) maxSum / k;
//         System.out.println("Maximum average of subarray of size " + k + " is: " + avg);
//     }
// }


