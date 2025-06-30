//A stack is a linear data structure that follows the LIFO (Last In, First Out)
// principle, meaning the last element added is the first one to be removed.
// public class StackExample {
//     public static void main(String[] args) {
//         Stack<Integer> stack = new Stack<>();
//         stack.push(10);
//         stack.push(20);
//         stack.push(30);
//         stack.push(40);
//         stack.push(50);
//         System.out.println("Pushed elements: " + stack);
//         stack.pop();
//         System.out.println("After pop: " + stack);
//     }
// }
//Reverse a string using stack
// import java.util.Stack;
// public class  StackExample {
//     public static void main(String[] args) {
//         String str = "hello";
//         Stack<Character> stack = new Stack<>();
//         for (char c : str.toCharArray()) {
//             stack.push(c);
//         }
//         StringBuilder reversed = new StringBuilder();
//         while (!stack.isEmpty()) {
//             reversed.append(stack.pop());
//         }
//         System.out.println("Original String: " + str);
//         System.out.println("Reversed String: " + reversed.toString());
// }
// }



// search of element operation
// public class StackExample {

//     public static void main(String[] args) {
//         Stack<String>stack= new Stack ();
//         stack.push("sahil");
//         stack.push("gopal");
//         System.out.println("position of sahil:"+stack.search(o:"sahil"));
//    System.out.println(Stack)
//     }
// }

// check is Stack is empty
// public class StackExample {
//     static int top = -1;
//     static Stack<Integer> stack = new Stack<>();
// }

// public static void main(String[] args) {
//     push(10);
//     push(20);
//     String stack;
//     System.out.println("Stack: " + stack);
//     System.out.println("Is stack empty? " + isEmpty());
// }

// static void push(int value) {
//     Stack stack = new Stack();
//     stack.push(value);
//     top++;
// }

// static boolean isEmpty() {
//     if (top == -1) {
//         return true;
//     } else {
//         return false;
//     }
// }

// import java.util.Stack;

// public class StackExample {
//     public static String bul;
//     public static boolean isBalanced(String bul) {
//         Stack<Character> stack = new Stack<>();
//         for (char ch : bul.toCharArray()) {
//             if (ch == '{' || ch == '[' || ch == '(') {
//                 stack.push(ch);
//             } else if (ch == '}' || ch == ']' || ch == ')') {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if (!matches(top, ch)) {
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
//     private static boolean matches(char open, char close) {
//         return (open == '{' && close == '}') ||
//                (open == '[' && close == ']') ||
//                (open == '(' && close == ')');
//     }
//     public static void main(String[] args) {
//         System.out.println(isBalanced("{({[])}"));
//     }
// }
 //...........................x.............x.........................