// // /* java collections framewroke
// // provides ready -to - use class and interfaces to store, acces and 
// // manipulate gropus of objects
// // (like array but more powerfull)

// // common interfaces
// // 1.list-> order collections with duplications 
// // ex. Arraylist, Linkedlist

// // 2.set-> no Duplicate Allowed 
// // ex. Hashset , HashMap , treeset

// // 3.queue-> FIFO Structure
// // ex. LInkedlist,preorityQueue

// // 4.map-> key-value-pair
// // ex. HashAMap,TreeMap,LinkedHashMap
// // */
// // import java.util.*;

// // public class CollectionExample {
// //     public static void main(String[] args) {
// //         List<String> list = new ArrayList<>();
// //         list.add("sahil");
// //         list.add("sai");
// //         list.add("varun");
// //         list.add("pawan");

// //         System.out.println("List: " + list);
// //     }
// // }

// //   Exception handling
// //   An Exception is an error that occour during runtime and 
// //   Disrupts the normal flow of the program 

// //   common types 
// //   ArithmeticException-> ex devided by zero
// //   NullpointerEXception 
// //   ArrayIndexOUtofBondExceptions
// //   Ioexception

// //   why exceptionto 
// //   to prevent program crash during runtime 
// //   to hanle error gracefull and continue exe
// //   to 
// //   to provde user frendly error message 
// //    Throwable 
// //    |--Exception
// //       |--IOException
// //       |--SqlException
// //       |--RunTimeException
// //          |--ArithmeticException
// //          |--NullPointerException
// //          |--IndexOutofBondException
// //       |--Error
// //          |--OutofMemoryError
// //          |--StackOverFlowError
// //   try block
// //   try blocks contains code that might throw an exception
// //   try{
// //   int a=10/0;
// //   }
// //   catch block
// //   handle the exception thrown from the try block
// //   (exception e){
// //   //  handle expection
// //   }
// //   finally block 
// //   the finally block alway true ,whether expception occour or not
// //   used to cleanup aaction (closing file,DB connection and more)
// //   throw keyword
// //   used to explicit throw an exception(custom or predefined)

// //  syntax:
// // void method_name() throws eceptiontype{
// // write your code
// //  }
// //}

// public class CollectionExample {
//     public static void main(String[] args) {
//         int age = 21;
//         try {
//             if(age < 18){
//                 throw new ArithmeticException("Not Eligible");
//             } else {
//                 System.out.println("Eligible");
//             }
//         } catch (ArithmeticException e) {
//             System.out.println("Caught an error: " + e.getMessage());
//         } finally {
//             System.out.println("Always Execute");
//  }

// }
// }

// public class Collection {
//     static void checAge(int Age) throws Exception {
//         if (Age < 18) {
//             throw new Exception("Not Allow");
//         } else {
//             System.out.println("You are Eligible");
//         }
//     }

//     public static void main(String[] args) {
//         try {
//             checAge(25);
//         } catch (Exception e) {
//             System.out.println("Error: " + e.getMessage());
//         }
//     }
// }

// impout validationsing expception



