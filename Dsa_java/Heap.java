/*
 * what is heap?]
 * heap is a special tree- based data structur that satisfied 
 * the heap priority
 * max_heap=parent node is always greaterthan or equal to child nodes
 * min_heap= parent node is always smallerthan or equal to child nodes
 * 
 * it is complete binary tree usually implementation arrya
 * 
 * 
 * application (real world )
 * preority queue
 * dijikstras s algorithm
 * top k element 
 * scheduling task
 * modian in  a Stream
 * 
 * 
 * 
 * implementation of priority queue
 * priorityQueue<>()// min heap
 * priorityQueue<integer>maxheap=new perirityQueue<Integer>
 * (collection ,reversorder()),//max heap
 */

//  //min heap example code 
//  import java.util.PriorityQueue;
// public class Heap {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//         minHeap.offer(10);
//         minHeap.offer(5);
//         minHeap.offer(20);
//             while (!minHeap.isEmpty()) {
//             System.out.println(minHeap.poll());
//         }
//     }
// }

// import java.util.PriorityQueue;
// public class Heap {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
//         maxHeap.offer(10);
//         maxHeap.offer(5);
//         maxHeap.offer(20);
//         while (!maxHeap.isEmpty()) {
//             System.out.println(maxHeap.poll());
//         }
//     }
//}

// public class Heap {
//     public static void main(String[] args) {
//         int arr[] = {7, 6, 4, 8, 2, 10, 5};
//         int k = 4;

//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int n : arr)
//             pq.offer(n);

//         for (int i = 1; i < k; i++)
//             pq.poll(); 

//         System.out.println("4th smallest element is: " + pq.peek());
//     }
// }


// import java.util.PriorityQueue;
// import java.util.*;
// public class Heap {
//     public static void main(String[] args) {
//         int arr[] = {7, 6, 4, 8, 2, 10, 5};
//         int k = 1;
//  PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//     //    PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for (int n : arr)
//             pq.offer(n);
//         for (int i = 1; i > k; i++)
//             pq.poll(); 
//         System.out.println("1th largest element is: " + pq.peek());
//     }
// }

//Merge array
// import java.util.*;
// public class Heap {

//       class node {
//         int data, i, j;

//         node(int data, int i, int j) {
//             this.data = data;
//             this.i = i;
//             this.j = j; 
//         }
//     }

//     public static void main(String[] args) {
//         final int[][] arr = {
//             {1, 4, 6},
//             {1, 3, 4},
//               {3, 6},
//         };
//         PriorityQueue<node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.data));
//         for (int i = 0; i < arr.length; i++) {
//             pq.offer(new node(arr[i][0], i, 0));
//         }
//         List<Integer> list = new ArrayList<>();
//         while (!pq.isEmpty()) {
//             node curr = pq.poll();
//             list.add(curr.data);

//             if (curr.j + 1 < arr[curr.i].length) {
//                 pq.offer(new node(arr[curr.i][curr.j + 1], curr.i, curr.j + 1));
//             }
//         }
//         System.out.println(list);
// }
// }
