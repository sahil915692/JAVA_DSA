/*
 * queue is linar data structur that follow FIFO principal
 * 
 * key qperations 
 *  offer()=add element 
 * poll ()=remove and return front
 * peak()=return front element 
 * isEmpty()=check if queue is empty
 * 
 * queue syntax(using linked list)
 * queue<integer>queue=new  Queue<>();
 * linked list <>();
 * queu
 *
 * 
 * 
 *  */
  


 //Enqueue and Deque Example
//  import java.util.*;

// public class queue {
//     public static void main(String[] args) {
//         Queue<Integer> queue = new LinkedList<>(); 
//         queue.offer(10); 
//         queue.offer(12);
//         queue.offer(13);
//         System.out.println("Front of queue: " + queue.peek()); 
//         System.out.println("Removed from queue: " + queue.poll());  
//         System.out.println("Remaining queue: " + queue);  
//     }
// }

  // reverse a queue using stack
    // import java.util.*;
    // public class ReverseQueue {
    //     public static void main(String[] args) {
    //         Queue<Integer> queue = new LinkedList<>();
    //         queue.offer(11);
    //         queue.offer(12);
    //         queue.offer(13);
    //         queue.offer(44);
    //         queue.offer(45);
    //         System.out.println("Original Queue: " + queue);
    //         reverseQueue(queue);  
    //         System.out.println("Reversed Queue: " + queue);
    //     }
    //     static void reverseQueue(Queue<Integer> queue) {
    //         Stack<Integer> stack = new Stack<>();
    //         while (!queue.isEmpty()) {
    //             stack.push(queue.poll());
    //         }
    //         while (!stack.isEmpty()) {
    //             queue.offer(stack.pop());
    // }
    // }
    // }
    


    // generate binaray numder using queue
//      import java.util.*;
// public class QueueExample {
//     public static void main(String[] args) {
//         int n = 10;  
//         generateBinary(n);
//     }
//     static void generateBinary(int n) {
//         Queue<String> queue = new LinkedList<>();
//         queue.offer("1");
//         for (int i = 0; i < n; i++) {
//             String binary = queue.poll();
//             System.out.println(binary);
//             queue.offer(binary + "0");
//             queue.offer(binary + "1");

// }

// }

// }




// add to end (enqueue)
// import java.util.*;
// public class queue {
//     public static void main(String[] args) {
//         LinkedList<Integer> queue = new LinkedList<>();
//         // Enqueue
//         queue.addLast(10);
//         queue.addLast(20);
//         queue.addLast(30);
//         System.out.println("Queue after enqueuing: " + queue);
//     }
// }

// remove from front (dequeue)
// // // import java.util.*;
// // // public class queue {
// // //     public static void main(String[] args) {
// // //         LinkedList<Integer> queue = new LinkedList<>();
// // //         // Dequeue
// //             //  queue.addLast(10);
// // //         queue.addLast(20);
// // //         queue.addLast(30);
// //            queue.addLast(40);
// //            queue.addLast(50);
//               queue.addLast(60);
 //              queue.addLast(70);
//          int removed = queue.removeFirst();
//         System.out.println("Dequeued element: " + removed);
//         System.out.println("Queue after dequeue: " + queue);
//     }
// }

// // peak frome element 
// import java.util.*;
// public class queue{
//     public static void main(String[] args) {
//         LinkedList<Integer> queue = new LinkedList<>();
//         queue.addLast(10);
//          queue.addLast(20);
//          queue.addLast(30);
//             queue.addLast(40);
//             queue.addLast(50);
//             queue.addLast(60);
//             queue.addLast(70);
//         System.out.println("Front element (peek): " + queue.peekFirst());
        
//     }
// }

// // // insert at begining /middle/end (custom queu using linklist)
// import java.util.*;
// public class queue {
//     public static void main(String[] args) {
//         LinkedList<Integer> queue = new LinkedList<>();
//          queue.addLast(10);
//          queue.addLast(20);
//          queue.addLast(30);
//            queue.addLast(40);
//           queue.addLast(50);
//          queue.addLast(60);
//           queue.addLast(70);
//         System.out.println("After inserting at beginning: " + queue);
//         queue.add(3, 40);
//         System.out.println("After inserting in middle (index 3): " + queue);
//         queue.addLast(30);
//         System.out.println("After inserting at end: " + queue);

//     }
// }

//delete first/last/midle
// import java.util.*;
// public class queue {
//     public static void main(String[] args) {
//         LinkedList<Integer> queue = new LinkedList<>();
//         queue.addLast(10);
//         queue.addLast(20);
//         queue.addLast(30);
//         queue.addLast(40);
//         queue.addLast(50);
//         queue.addLast(60);
//         queue.addLast(70);
//         queue.removeFirst();
//         System.out.println("After deleting first element: " + queue);
//         queue.removeLast();
//         System.out.println("After deleting last element: " + queue);
//         queue.remove(1);
//         System.out.println("After deleting middle element (index 1): " + queue);
//     }
// }


