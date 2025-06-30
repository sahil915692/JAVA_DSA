/*/ SORTING
Sorting is a process of arranging in a spexfic order
(Ascending or decending order)
sorting helps in searching efficient and organized data

---------------x--------------x---------------x---------------------x-------
BUBBLE SORT 
how it works 

go through the array ,one value at a time .
for each value ,compare the value with the next value.
If the value is higher than the next one,swap the 
value so that the highest value comes last.
go through the the highest value comes last
values in the array
 */

// public class sorting {
//     public static void bubblesort(int arr[]) {
//         int num = arr.length;
//         // Outer loop
//         for (int i = 0; i < num - 1; i++) {
//             // Inner loop
//             for (int j = 0; j < num - 1 - i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[] = { 2, 8, 5, 1, 4, 6, 15, 10 };
//         bubblesort(arr);
//         System.out.println("Sorted arrya");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

/*
 * 
selection sort 
how it works
go through the array to fimd the lowest value .
move the lowest value to the front of the unsorted
part of the array,go through the array again as 
many times as there  are valus in array
 */

// public class sorting {
// public static void selectionSort(int[] arr) {
//     int num = arr.length;
//     for (int i = 0; i < num - 1; i++) {
//         int min = i; 

//  for (int j = i + 1; j < num; j++) {
//             if (arr[j] < arr[min]) {
//                 min = j; 
//             }
//         }
//         int temp = arr[i];
//         arr[i] = arr[min];
//         arr[min] = temp;
//     }
// }
// public static void main(String[] args) {
//     int[] arr = {1,16,84,62,65, 11}; // arr[0] 10
//     selectionSort(arr);
//     System.out.println("Sorted array:");
//     for (int value : arr) {
//         System.out.print(value + " ");
//     }
// }

/* Insertion sort 
how it works:
take the first value from the unsorted part
of the array.move the value into the correct place
in the sorted part of the array
go through the unsorted part od the 
array again as many times as there are  values
*/

// public class sorting {
//     public static void insertionSort(int[] arr) {
//         int n = arr.length;
//         for (int i = 1; i < n; i++) {
//             int num = arr[i];
//             int j = i - 1;
//             while (j >= 0 && arr[j] > num) {
//                 arr[j + 1] = arr[j];
//                 j--;
//             }
//             arr[j + 1] = num;
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr = { 9, 5, 1, 4, 3 };
//         insertionSort(arr);
//         System.out.println(" Sorted:");
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }

// ------------*----------*-------------------*----------------------*----------*------------*------------
// /*QuickSort is a fast, recursive, divide-and-conquer sorting algorithm.
//  choose a value in the array to be the pivot element
//  order the rest of the array so that lower values than the pivot element are on the left
//  swap the pivot element with the first element of the higher values .Do the same operations 
//  (recursively)for the sub_arrays on the left and right 
//  side of the pivot element ..
// */

// public class sorting {
//     // Method to perform quick sort
//     public static void quickSort(int[] arr, int l, int h) {
//         if (l < h) {
//             int p = partition(arr, l, h);
//             quickSort(arr, l, p - 1);
//             quickSort(arr, p + 1, h);
//         }
//     }

//     public static int partition(int[] arr, int l, int h) {
//         int pivot = arr[h];
//         int i = l - 1;
//         for (int j = l; j < h; j++) {
//             if (arr[j] < pivot) {
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         int temp = arr[i + 1];
//         arr[i + 1] = arr[h];
//         arr[h] = temp;

//         return i + 1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { 10, 7, 8, 9, 2, 45, 1, 5 };
//         quickSort(arr, 0, arr.length - 1);
//         System.out.println("Sorted Array:");
//         for (int value : arr) {
//             System.out.print(value + " ");
//         }
//     }
// }

//--------------------------------------------x-------------x----------------------------x---------------------------------x-

