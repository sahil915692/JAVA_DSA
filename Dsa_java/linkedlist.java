// Linked List************************************* */
/*
 * A linke list is a linera data structure where each element (called node)
 * contains two parts.
 * 
 * 1. Data = the value stored
 * 2. Next = A pointer/reference to the next node in the list.
 *************** 
 * Types***************
 * 
 * 1 Singly linked list : each node point with a next node
 * 2 Doubly linked list : each node point to both the next node and previous
 * node
 * 3 Circular linked list : last node point back to the head node
 */
// class Node {
// int data;
// Node next;
// Node(int data) {
// this.data = data;
// this.next=null;
// }
// }

// class Node {
// int data;
// Node next;
// Node(int d) { data = d; }
// }
// public class LinkedList {
// Node head;

// void insert(int data) {
// Node n = new Node(data);
// if (head == null) head = n;
// else {
// Node temp = head;
// while (temp.next != null) temp = temp.next;
// temp.next = n;
// }
// }

// void display() {
// for (Node temp = head; temp != null; temp = temp.next)
// System.out.print(temp.data + " -> ");
// System.out.println("null");
// }

// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.insert(1);
// list.insert(2);
// list.insert(3);
// list.display();
// }
// }

// class Node {
// int data; // to store data
// Node next; // to print to the next node
// // constructor

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public class LinkedList {
// Node head;

// public void append(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// Node temp = head;
// while (temp.next != null) {

// temp = temp.next; // move to next node
// }
// temp.next = newNode; // link the last node
// }

// public void Printlist() {
// Node temp = head;
// while (temp != null) {

// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// public static void main(String[] args) {
// LinkedList list = new LinkedList();
// list.append(10);
// list.append(20);
// list.append(30);
// list.append(40);
// list.append(50);
// list.Printlist();
// }
// }

//// Each node store an integer and a referance to next node
/// the linklistExample mange the head
// class Node {
// int data; // to store data
// Node next; // reference to next node

// // constructor
// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public class Linkedlistexample {
// Node head; // head of the list
// // Insert at the beginning

// public void InsertAtbegining(int data) {
// Node newNode = new Node(data); // create a new node
// newNode.next = head; // point newNode to current head
// head = newNode; // update head to newNode
// }

// // insert after a given value
// public void InsertAfetervalue(int data, int value) {
// Node curr = head;
// while (curr != null && curr.data != value) {
// curr = curr.next;
// }
// if (curr != null) {
// Node newNode = new Node(data); // creating new node
// newNode.next = curr.next; // new node points to next of current
// curr.next = newNode; // current now points to new node

// }
// }

// // Append at the end
// public void append(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next; // move to next node
// }
// temp.next = newNode; // link the last node
// }

// // Print the list
// public void Printlist() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("null");
// }

// // Main method
// public static void main(String[] args) {
// Linkedlistexample list = new Linkedlistexample();
// list.append(10);
// list.append(20);
// list.append(30);
// list.append(40);
// list.Printlist();
// list.InsertAtbegining(5);
// System.out.println("After inserting at beginning:");
// list.Printlist();
// System.out.println("After value insert");
// list.InsertAfetervalue(15, 20);
// list.Printlist();
// }
// }

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }
// public class Linkedlistexample {
// Node head;
// public void insertAtBeginning(int data) {
// Node newNode = new Node(data);
// newNode.next = head;
// head = newNode;
// }
// public void insertAfterValue(int value, int data) {
// Node curr = head;
// while (curr != null && curr.data != value) {
// curr = curr.next;
// }
// if (curr != null) {
// Node newNode = new Node(data);
// newNode.next = curr.next;
// curr.next = newNode;
// }
// }
// public boolean search(int value) {
// Node temp = head;
// while (temp != null) {
// if (temp.data == value) {
// return true;
// }
// temp = temp.next;
// }
// return false;
// }
// public int countNodes() {
// int count = 0;
// Node curr = head;
// while (curr != null) {
// count++;
// curr = curr.next;
// }
// return count;
// }
// public void append(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next;
// }
// temp.next = newNode;
// }
// public void PrintList() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("null");
// }
// public static void main(String[] args) {
// Linkedlistexample list = new Linkedlistexample();
// System.out.println("List after appending:");
// list.append(10);
// list.append(20);
// list.append(30);
// list.append(40);
// list.PrintList();
// list.insertAtBeginning(10);
// list.insertAtBeginning(5);
// System.out.println("List after inserting at beginning:");
// list.PrintList();
// list.insertAfterValue(20, 25);
// System.out.println("List after inserting 25 after 20:");
// list.PrintList();
// System.out.println("Search for 40: " + (list.search(40) ? "Found" : "Not
// Found"));
// System.out.println("Number of nodes: " + list.countNodes());iiiiiiiii
// list.PrintList();
// }
// }

// class Node {
// int data; // to store data
// Node next; // reference to next node
// // constructor
// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }
// public class Linkedlistexample{
// Node head; // head of the list
// // Insert at the beginning
// public void InsertAtbegining(int data) {
// Node newNode = new Node(data); // create a new node
// newNode.next = head; // point newNode to current head
// head = newNode; // update head to newNode
// }
// //insert after a given value
// public void InsertAfetervalue(int data,int value){
// Node curr = head;
// while (curr != null && curr.data != value) {
// curr = curr.next;//transverse till we value find
// }
// if(curr != null){
// Node newNode = new Node(data);//creating new node
// newNode.next = curr.next;//new node points to next of current
// curr.next = newNode;//current now point to new node

// }
// }
// //search value
// public boolean search(int key){
// Node temp = head;
// while(temp != null){
// if(temp.data == key){//30 == key//20
// return true;
// }
// temp = temp.next;
// }
// return false;
// }
// // Count the number of nodes in the linked list
// public int countNodes() {
// int count = 0;
// Node temp = head;
// while (temp != null) {
// count++;
// temp = temp.next;
// }
// return count;
// }
// //reverse Linked List
// public void ReverseLinkedlist(){
// Node prev = null;
// Node curr = head;
// Node next = null;
// while((curr != null)){
// next = curr.next;
// curr.next = prev;
// prev = curr;
// curr = next;
// }
// head = prev;
// }
// //Delete from Begining
// public void DeletefromBegining(){
// if(head !=null){
// head = head.next;
// }
// }
// //Delete from End
// public void DeletefromEnd(){
// if(head == null){
// return;//empty list
// }
// if(head.next == null){
// head = null;//only one element
// return;
// }
// Node temp = head;
// while(temp.next.next != null){
// temp = temp.next;
// }
// temp.next = null;
// }
// // Delete the value
// public void Deletevalue(int value){
// return;
// }
// Node temp =head;
// while(temp.Next!=null&&temp.Next.data!=value){
// temp=temp.next;

// }
// if(temp.Next !=null){
// temp.next=temp.next.next; // skip the Target node
// }
// // Append at the end
// public void append(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// Node temp = head;
// while (temp.next != null) {
// temp = temp.next; // move to next node
// }
// temp.next = newNode; // link the last node
// }
// // Print the list
// public void Printlist() {
// Node temp = head;
// while (temp != null) {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// }
// System.out.println("null");
// }
// // Main method
// public static void main(String[] args) {
// Linkedlistexample list = new Linkedlistexample();
// list.append(10);
// list.append(20);
// list.append(30);
// list.append(40);
// list.Printlist();
// list.InsertAtbegining(5);
// System.out.println("After inserting at beginning:");
// list.Printlist();
// System.out.println("After value insert");
// list.InsertAfetervalue(15, 20);
// list.Printlist();
// System.out.println(list.search(20));
// System.out.println("number of nodes (conut) is "+list.countNodes());
// list.ReverseLinkedlist();
// list.DeletefromBegining();
// list.DeletefromEnd();
// list.Printlist();
// list.Deletevalue(30);
// list.Printlist();

// }
// }

// A Circular Linked List (CLL) is a variation of linked list in which the last
// node points back to the first node, forming a circle.
// There is no Null at the end like in singly or doublylinked list
// There are two types of Circular Linked Lists:
// Singly Circular Linked List → Each node has only next pointer, and the last
// node points to head.
// Doubly Circular Linked List → Each node has next and prev, last node next →
// head, head prev → last node.

// operations we will Implement :
// insert at end
// insert at beginning
// delate from begining
// delate from end
// traverse/print
// count nodes
// search for value

// class Node {
// int data; // to store data
// Node next; // reference to next node

// // constructor
// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// public class Linkedlistexample {
// Node head = null, tail = null;

// // Insert at the beginning
// public void insertAtBeginning(int data) {
// Node newNode = new Node(data);
// // If list is empty
// if (head == null) {
// head = tail = newNode;
// newNode.next = head;
// } else {
// newNode.next = head; // New node points to current head
// head = newNode; // Head updated to new node
// tail.next = head; // Tail should now point to new head to maintain
// circularity
// }
// }

// // Delete at beginning
// public void deleteAtBeginning(int data) {
// if (head == null) {
// System.out.println("List is empty. Nothing to delete.");
// return;
// }

// // Only one node
// if (head == tail) {
// head = tail = null;
// } else {
// head = head.next;
// tail.next = head;
// }
// }

// // Insert at end
// public void insertAtEnd(int data) {
// Node newNode = new Node(data);
// // If list is empty
// if (head == null) {
// head = tail = newNode;
// newNode.next = head;
// } else {
// tail.next = newNode; // Link last node to new node
// newNode.next = head; // New node points to head
// tail = newNode; // Update tail to new node
// }
// }

// // delate from end
// public void deleteAtend(int data) {
// if (head == null) {
// return;
// }
// }

// public void add(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = tail = newNode;
// } else {
// tail.next = newNode;
// tail = newNode;
// tail.next = head;
// }
// }

// // Delete by value
// public void deleteByValue(int value) {
// if (head == null) {
// return;
// }
// // Case: Only one node
// if (head == tail && head.data == value) {
// head = tail = null;
// return;
// }
// Node curr = head;
// Node prev = tail;
// do {
// if (curr.data == value) {
// if (curr == head) {
// head = head.next;
// tail.next = head;
// } else if (curr == tail) {
// tail = prev;
// tail.next = head;
// } else {
// prev.next = curr.next;
// }
// return;
// }
// prev = curr;
// curr = curr.next;
// } while (curr != head);

// System.out.println("Value " + value + " not found in the list.");
// }

// public void Printlist() {
// if (head == null)
// return;
// Node temp = head;
// do {
// System.out.print(temp.data + " -> ");
// temp = temp.next;
// } while (temp != head);
// System.out.println("head");
// }

// public static void main(String[] args) {
// Linkedlistexample Cll = new Linkedlistexample();
// Cll.add(10);
// Cll.add(20);
// Cll.add(30);
// Cll.add(40);
// Cll.add(50);
// Cll.add(60);
// Cll.add(70);
// Cll.Printlist();
// Cll.insertAtBeginning(5);
// System.out.println("inserting at beginning:");
// Cll.Printlist();
// Cll.deleteAtBeginning(5);
// System.out.println("Delete at bigining");
// Cll.Printlist();
// System.out.println("insert at end");
// Cll.insertAtEnd(50);
// Cll.Printlist();
// Cll.deleteAtend(50);
// System.out.println("Delete at end");
// Cll.Printlist();

// }
// }

// **********************************************************************************************************
/*
 * DOUBLY LINKLIST
 * A doubly linked list (Dll) is a linar data structure
 * where each node has:
 * data: stores the value
 * prev: points to the previous node
 * next :points to the next node
 * This allows bidirectional traversal(both forward and dackward),
 * unlike singly linked list .
 */
// public class linkedlist {
//     Node head;

//     class Node {
//         int data;
//         Node prev;
//         Node next;

//         Node(int data) {
//             this.data = data;
//         }
//     }

//     public void InsertAtBegining(int data) {
//         Node newNode = new Node(data);
//         newNode.next = head;
//         if (head != null) {
//             head.prev = newNode;
//         }
//         head = newNode;
//     }

//     public void InsertatEnd(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newNode;
//         newNode.prev = temp;
//     }

//     public void insertAfterGivenValue(int data, int val) {
//         Node temp = head;
//         while (temp != null && temp.data != val) {
//             temp = temp.next;
//         }
//         if (temp == null) return;

//         Node newNode = new Node(data);
//         newNode.next = temp.next;
//         newNode.prev = temp;
//         if (temp.next != null) {
//             temp.next.prev = newNode;
//         }
//         temp.next = newNode;
//     }

//     public void DeleteFromEnd() {
//         if (head == null || head.next == null) {
//             head = null;
//             return;
//         }
//         Node temp = head;
//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.prev.next = null;
//     }

//     public void Printlist() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " <-> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         linkedlist dll = new linkedlist();
//         dll.head = dll.new Node(10);
//         Node secNode = dll.new Node(20);
//         Node thirNode = dll.new Node(30);
//         Node fourtNode = dll.new Node(40);
//         Node fiveNode = dll.new Node(50);

//         dll.head.next = secNode;
//         secNode.prev = dll.head;
//         secNode.next = thirNode;
//         thirNode.prev = secNode;
//         fourtNode.prev=fourtNode;
//         fiveNode.prev=fiveNode;


        
//         dll.Printlist();           
//         dll.InsertAtBegining(5);   
//         dll.Printlist();
//         dll.InsertatEnd(40);       
//         dll.Printlist();
//         dll.insertAfterGivenValue(25, 20); 
//         dll.Printlist();
//         dll.DeleteFromEnd();       
//         dll.Printlist();
// }
// }
