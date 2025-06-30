/*
 * Trees and binary trees:
 * A tree is way of organizing data in a hierarchy, like a family tree.
 * each item in the tree is called a node ,and nodes are connection by
 * branches .A binary tree is special kind of tree where each node can have at
 * 
 * 
 * MOST TWO CHILDREN :
 * The left child
 * the right child
 * the top node is called the root node whith no children are called
 * leaves
 * 
 * why use binary tree?
 * easy to search ,insert ,and delete data.
 * useful for keeping data sorted.
 * Efficient for many algorithms.
 * 
 * Tree Traversal : visithing every node
 * Traversal means visting every node in the tree,
 * usually to read or update data.since tree branch out,
 * 
 * 
 * 
 * There are two main types of tree traversal:
 * Bredth -first search(BFS)
 * Depth -first search(DFS)
 * 
 * -> BfS (Bredth -first search) is an algorithm that explores all nodes
 * at the current level before moving to tht next levle ,using a queue
 * to keep track of nodes to vist next
 * -> Depth -first search(DFS) is an algorithm that explores as far as possible
 * down one branch before backtracking ,use
 */
// Tree structure
// class Node {
// int data;
// Node left ,right;
// // constructor for
// Node (int data){
// this.data=data;
// left=right=null;
// }
// }
// public class Tree {
// public static void main(String[] args) {
// // creathing tree node
// Node root = new Node(1);
// root.left=new Node(2);
// root.right=new Node(3);
// root.left.left=new Node(4);
// root.left.right=new Node(5);
// System.out.println("root node :"+root. data);
// System.out.println("left child of root "+root.left .data);
// System.out.println("right child of root "+root.right.data);
// System.out.println("left.left"+root .left.left.data);
// System.out.println("left.right "+root.left.right.data);
// }
// }

/*
 * Inorder Traversal of binary tree
 * inorder traversal is a depth - first traversal method
 * that follows this sequence :
 * 
 * left subtree is visited first .
 * root node is processed next .
 * right subtree is visited last .
 * 
 * -> preorder traversal binary tree
 * preorder traversal is a tree traversal method
 * that follows
 * the root - left - right order:
 * 
 * the root node of the subtree is visited first.
 * next , the left subtree is
 * 
 * 
 * 
 * 
 * -> postorder traversal
 * postorder traversal is a tree traversal method that
 * follows the left -right -root order:
 * the left subtree is visited first.
 * the right subtree is visited next .
 * the root node is processed last
 * 
 * 
 */

// inorder traversal method (left -> Root -> Right)
// class Node{
// int data;
// Node left,right;

// Node(int data){
// this.data = data;
// left = right =null;
// }
// }

// public class Tree{
// static void inOrderTraversal(Node node){
// if(node == null)
// return;
// inOrderTraversal(node.left);
// System.out.print(node.data+" ");
// inOrderTraversal(node.right);
// }

// public static void main(String[] args) {
// Node root = new Node(10);
// root.left = new Node(20);
// root.right = new Node(30);
// root.left.left = new Node(40);
// root.left.right = new Node(50);

// System.out.println("Inorder travesal method : ");
// inOrderTraversal(root);
// }
// }

// //preorder traversal method ( Root ->left -> Right)
// // class Node{
// // int data;
// // Node left,right;

// // Node(int data){
// // this.data = data;
// // left = right =null;
// // }
// // }

// // public class Tree{
// // Node root;
// // static void preorderTraversal(Node node){
// // if(node == null)
// // return;
// // System.out.print(node.data+" ");
// // preorderTraversal(node.left);
// // preorderTraversal(node.right);
// // }

// // public static void main(String[] args) {
// // Node root = new Node(10);
// // root.left = new Node(20);
// // root.right = new Node(30);
// // root.left.left = new Node(40);
// // root.left.right = new Node(50);

// // System.out.println("preorder travesal method : ");
// // preorderTraversal(root);
// // }
// // }

// //post order traversal method (left -> Right-> Root )
// class Node{
// int data;
// Node left,right;

// Node(int data){
// this.data = data;
// left = right =null;
// }
// }

// public class Tree{
// Node root;
// static void postorderTraversal(Node node){
// if(node == null)
// return;
// postorderTraversal(node.left);
// postorderTraversal(node.right);
// System.out.print(node.data+" ");
// }

// public static void main(String[] args) {
// Node root = new Node(10);
// root.left = new Node(20);
// root.right = new Node(30);
// root.left.left = new Node(40);
// root.left.right = new Node(50);

// System.out.println("postorder travesal method : ");
// postorderTraversal(root);
// }
// }

// count total Numders of Nodes 

// public class Tree {
//   static class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//       this.data = data;
//       this.left = this.right = null;
//     }
//   }

//   public static int countNode(Node root) {
//     if (root == null)
//       return 0;
//     return 1 + countNode(root.left) + countNode(root.right);

//   }

//   static void postorderTraversal(Node node) {
//     if (node == null)
//       return;
//     postorderTraversal(node.left);
//     postorderTraversal(node.right);
//     System.out.print(node.data + " ");
//   }
//  static void preorderTraversal(Node node){
//  if(node == null)
//  return;
//  System.out.print(node.data+" ");
//  preorderTraversal(node.left);
//  preorderTraversal(node.right);
// }
// static void inOrderTraversal(Node node){
//  if(node == null)
//  return;
// inOrderTraversal(node.left);
//  System.out.print(node.data+" ");
// inOrderTraversal(node.right);
//  }
//   public static void main(String[] args) {
//     Node root = new Node(7);
//     root.left = new Node(5);
//     root.right = new Node(3);
//     root.left.right = new Node(6);
//     root.left.left = new Node(9);
//     int totalCount = countNode(root);
//     System.out.println("Total number of nodes: " + totalCount);

//     System.out.println("postorder travesal method : ");
//     postorderTraversal(root);
//     System.out.println();
//      System.out.println("preorder travesal method : ");
//      preorderTraversal(root);
//      System.out.println();
//      System.out.println("Inorder travesal method : ");
//       inOrderTraversal(root);
//   }
// }

// BFS-> breadth first search algorithm
// BFS -> using queue

// import java.util.*;
// class Node {
//     int data;
//     Node left, right;

//     Node(int data) {
//         this.data = data;
//         left = right = null;
//     }
// }

// public class Tree {

//     // Level Order Traversal (BFS)
//     static void orderLevel(Node node) {
//         if (node == null)
//             return;

//         Queue<Node> queue = new LinkedList<>();
//         queue.add(node); // Start with root node

//         while (!queue.isEmpty()) {
//             Node curr = queue.poll(); // Remove from front node 
//             System.out.print(curr.data + " ");// visit current node 
//             // add left and right child to queue if not null

//             if (curr.left != null)
//                 queue.add(curr.left);
//             if (curr.right != null)
//                 queue.add(curr.right);
//         }
//     }

//     public static void main(String[] args) {
//         Node root = new Node(10);
//         root.left = new Node(20);
//         root.right = new Node(30);
//         root.left.left = new Node(40);
//         root.left.right = new Node(50);
//         System.out.println("BFS - Level Order Traversal:");
//         orderLevel(root);
//     }
// }


      

