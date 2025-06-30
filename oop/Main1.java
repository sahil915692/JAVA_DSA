// // // // // core oop concept
// // // // // inheritance (single , multiple , hirarachical)
// // // // // super keyword
// // // // // method overriding
// // // // *//

// // // // //advanced oop concept
// // // // // abstraction
// // // // // (abstraction class,interface)
// // // // // polymorpsim
// // // // // encapasuiation
// // // // //
// // // // //* */
// // // // utility oop concept
// // // // static keyword

// // // real world use and patterns
// // //
// // object composition
// // aggregation vs composition
// // factory patterns
// // singleton class

// // class car {
//java.lang.String colour = "black";
// // int speed = 200;

// // void display() {
// // System.out.println("Colour is " + colour);
// // System.out.println("Speed is " + speed);
// // }

// // public static void main(String[] args) {
// // car myCar = new car();
// // myCar.display();
// // }
// // }

// // // multiple object of a class

// class oop{
// String name = "Sahil";
// int Age =20;
// void display(){
// System.out.println(" Age is :" +Age);
// System.out.println("name is :"+name);
// }
// }
// public class Main{
// public static void main(String[] args) {
// oop obj =new oop();
// oop s1 = new oop();
// s1.name =" gopal";
// s1. Age =20;
// s1 .display();
// obj. display();
// }

// class with method performing calculation
// public class Main {
// int add(int a, int b) {
// return a + b;
// }
// public static void main(String[] args) {
// Main calc = new Main();
// int result = calc.add(10,20);
// System.out.println("Result: " + result);
// }
// }
// import java.util.Scanner;
// public class Main {
// public static void main(String[] args) {
// Main calc = new Main();

// }
// Scanner sc = new Scanner(System.in);
// int a= sc.nextInt();
// int b= sc.nextInt ();
// {

// }
// System.out.println("Result: " + result);
// int add(int a, int b) {
// return a + b;
// }
// }

// import java.util.Scanner;
// public class Main {
// int multiple(int a, int b) {
// return a * b;
// }
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter first number: ");
// int a = sc.nextInt();
// System.out.print("Enter second number: ");
// int b = sc.nextInt();
// Main calc = new Main();
// int result = calc.multiple(a, b);
// System.out.println("Result: " + result);
// }
// }

// class Product{
// String name;
// double price;
// void set_value(String p_name, double Amount){
// name = p_name;
// price = Amount;
// }
// void Display(){
// System.out.println("Name :"+Name);
// System.out.println("price :"+price);
// }
// }
// public class Main(String[] args) {
// Product obj = new Product();
// obj.set_value(Remote:4555,Amount:250);
// }

// class Product {
// String name;
// double price;
// void set_value(String p_name, double Amount) {
// name = p_name;
// price = Amount;
// }
// void Display() {
// System.out.println("Name: " + name);
// System.out.println("Price: " + price);
// }
// }
// public class Main {
// public static void main(String[] args) {
// Product obj = new Product();
// obj.set_value("Remote", 250);
// obj.Display();
// }
// }

// area of circle
// import java.util.Scanner;

// public class CircleArea {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter radius of the circle: ");
// double radius = sc.nextDouble();

// double area = Math.PI * radius * radius;

// }
// }

//

// class Rectangle {
// double length;
// double width;
// void setValues(double length, double width) {
// this.length = length;
// this.width = width;
// }
// double getArea() {
// return length * width;

// }
// void display() {
// System.out.println("Length: " + length);
// System.out.println("Width: " + width);
// System.out.println("Area: " + getArea());
// }
// }
// public class Main {
// public static void main(String[] args) {
// Rectangle rect = new Rectangle();
// rect.setValues(10, 5);
// rect.display();
// }
// }

// import function.string;

// class circle{
// double PI=3.14;
// double r,l,s,b;

// void set_value(double radius){
// r= radius;
// double Area=PI*r*r}
// system.out. print("area of circle is:" +area);
// }

// double Area_of_Rectangle(double length,double width){
// return l*b;

// }
// double Area_of_sqr(double side){
// return side*side;
// }

// void display(){
// System.out.println("Aera of squre:" +Area_of_sqr(s));
// System.out.println("Area_of_Rectangle:"+Area_of_Rectangle(l,b));
// }

// public Main{
// public
// }

// class Circle {
// double PI = 3.14;
// double r, l, b, s;
// void setCircleValue(double radius) {
// r = radius;
// double area = PI * r * r;
// System.out.println("Area of Circle: " + area);
// }

// double areaOfRectangle(double length, double width) {
// l = length;
// b = width;
// return l * b;
// }

// double areaOfSquare(double side) {
// s = side;
// return s * s;
// }
// void display() {
// System.out.println("Area of Rectangle: " + areaOfRectangle(l, b));
// System.out.println("Area of Square: " + areaOfSquare(s));
// }
// public static void main(String[] args) {
// Circle obj = new Circle();
// obj.setCircleValue(7);
// obj.areaOfRectangle(5, 3);
// obj.areaOfSquare(4);
// obj.display();
// }
// }

// /// objtes with diffent data types;

// Public person {
// String name;
// int Age;
// float salary;

// void set_value (string n,int b,float s){
// name =n;
// Age=b;
// salary=s;

// }
// void Display(){
// system.out.println("name:" +name);
// system.out.println("Age:" +Age);
// system.out.println("salary" +salary);

// }

// class Employee {
// String name;
// float salary;
// }

// public class Main {
// public static void main(String[] args) {
// Employee e = new Employee();
// e.name = "Sahil";
// e.salary = 4000;
// System.out.println("Name: " + e.name);
// System.out.println("Salary: " + e.salary);
// }
// }

// constructor in JAVA

// Constructor is a method used to initialize objectsit.
// it called automatically when object is created.

// types
// default constructor : no parameters
// parameterized constructor : with parameter
// copy constructor : copy values from another object (manual in java)

/*
 * rules
 * constructor name = class name
 * no return type(not even void).
 * can be overloaded like method.
 *  
 * 
 */

//  default constructor  

// class Employee{
//     Employee(){
//         System.out.println("Default  constructor");

//     }
// }
// public class Main {

//     public static void main(String[] args) {
//         Employee e= new Employee();

// class Student {
//     int Age;
//     String name;
//     // Constructor
//     Student(String n, int a) {
//         this.Age = a;
//         this.name = n;
//     }
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + Age);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student scStudent = new Student("Sahil", 20);
//         scStudent.display(); 
//     }
// }

// copy constructor : copiess value from another object 
// class Student{
//     String name;
//     int salary;
//     Student(String n, int s) {
//         this.name = n;
//         this.salary = s;
//     }
//     Student(Student s) {
//         this.name = "Gopal Kaka";
//         this.salary = 200000;
//     }
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//     }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student("Sahil", 50000); 
//         Student s2 = new Student(s1); 
//         s1.display(); 
//         s2.display(); 
//     }
// // }
// // }

// class Student{
//     String name;
//     int salary;
//     Student() {
//         this.name = "sahil che papa";
//         this.salary ="100000";
//     }
//     Student(Student s) {
//         this.name = "Gopal Kaka";
//         this.salary = 200000;
//     }
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//     }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student(); 
//         Student s2 = new Student(); 
//         s1.display(); 
//         s2.display(); 
//     }
// }
// }

// class Student {
//     String name;
//     int salary;
//     Student() {
//         this.name = "Sahil Che Papa";
//         this.salary = 100000;
//     }
//     Student(Student s) {
//         this.name = "Gopal Kaka";
//         this.salary = 200000;
//     }
//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Salary: " + salary);
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s1 = new Student();       
//         Student s2 = new Student(s1);     
//         s1.display();
//         s2.display();
//      }

//   

// import function.string;

// class Rect {
//     int length;
//     int width;
//     // Default constructor
//     Rect() {
//         length = 25;
//         width = 15;
//     }
//     // Parameterized constructor
//     Rect(int l, int w) {
//         length = l;
//         width = w;
//     }
//     void Area() {
//         int area = length * width;
//         System.out.println("Area of rectangle: " + area);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Rect r1 = new Rect();       
//         Rect r2 = new Rect(10, 20);  
//         r1.Area(); 
//         r2.Area();  
//     }
// }

// // using  constructor to greet user 
// // // class greeting{
// //     string name ;
// //     String a;

// // }

// this key world to reffer current class variable 
//  class Student{
//     String name;
//     Student( string name){
//         this .name= name;

//     }
//       void display(){
//         System.out.println("name :"+name);
//       }
//        void show (){
//         this.display();
//        }
//      public static void main(String[] args) {
//         Student sc = new Student(name:"SAHIL")
//         sc show();

//      }
// }

// class Student {
//     String name;
//     Student(String name) {
//         this.name = name; 
//     }
//     void display() {
//         System.out.println("name: " + name);
//     }
//     void show() {
//         this.display(); 
//     }
//     public static void main(String[] args) {
//         Student sc = new Student("SAHIL"); 
//         sc.show(); 
//     }
// }
//this () to call another constructor

// class student{
//     String name;
//     int num1,num2;
//     student(String name){
//         this.name = name;
//     }
//  //call current class method
//  student(){
//     //this(3,6);
//     this("SAHIL");
//     System.out.println("default " );
//  }
//  void display(){
//      System.err.println("name:" +name);
//     }
//  void show(){
//     this.display();
//  }
//     student(int a,int b){
//     num1=a;
//     num2=b;
//     System.out.println("parameterized" +(num1+num2) );
//  }
// }
// public class constructor{
//     public static void main(String[] args) {
//         student sc=new student();
//         student sc1=new student("VARUN");
//          sc.show();
//          sc1.show();
//     }
// }
//         class student{
//     student getstudent(){
//      return this;
//     }
//     void mess(){
//         System.out.println("welcome from current object");
//     }
// }
// public class constructor{
//    public static void main(String[] args) {
//        student s= new student();
//        s.getstudent().mess();
//    }
// }

// class Person {
//     void show(Person p) {
//         System.out.println("object is: Sahil");
//     }

//     void call() {

//         show(this);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Person p = new Person();  
//         p.call();                
//     }
// }

// method over loading 

// defining multiple methods with same name in same class but 
// different parameter 
// rules of method over loading 
/* */
// 1 method name must be the same 
//2. parameter list  must be diffent( type,name,or order)
//3.return type can be same or different
/* */

// class Moverloading {
//     void add(int a, int b) {
//         System.out.println("sum: " + (a + b));
//     }
//     void add(int a, int b, int c) {
//         System.out.println("sum: " + (a + b + c));
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Moverloading m = new Moverloading();
//         m.add(5, 10);       
//         m.add(2, 5, 7);      
//     }
// }

// class Moverloading {
//     void add(int a, int b) {
//         System.out.println("sum: " + (a + b));
//     }
//     void multiple(int a, int b, int c) {
//         System.out.println("multiple: " + (a * b * c));
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Moverloading m = new Moverloading();
//         m.add(5, 10);         
//         m.multiple(2, 5, 7);   
//     }
// }

// method overriding
/* 
 * method overiding ocours when a sub class provid 
 * a specific implementation of a method that is already defined in its superclass 
*/

// */* key points:
// 1. method name, return type  and parameter must be same
// 2. only inherited method can be overiding
// 3. access modifiers must be same or more accessibles
// 4.you cannot oveeride final , static or private method
// 5. use @Override annotation for better readability
// (optional but recomonded)
// key */

// class car{
//     void Horn (){
//         System.out.println("car makes sound like hahahahahah");
//     }

// }
//  class Truck extends car{
//     @Override 
//     void Horn(){
//         System.out.println("Truck makess sound tanananana");
//     }
//  }
// public class Main {

//     public static void main(String[] args) {
//         car c = new car();
//         c.Horn();
//         Truck T= new Truck();
//         T.Horn();

//     }
// }

/*
 1.Superclass: the parent class
 2.subclass: the child class that inherits from the superclass
 3. extends: keyword used to define inheritance 
 4.super : keyword to access parent class method or constructor
 */
// iava does not support multiple inheritance with class but it 
// does with interfaces\

// multilevel inheritance 
// class Animal{
//     void eat(){
//         System.out.println("Animal can eatn food");
//     }
// }
// class dog extends Animal{
//     void bark(){
//         System.out.println("dog can dark");
//     }
// }
// class puppy extends dog{
//     void weep(){
//         System.out.println("puppy nhgyhbgyhy");
//     }
// }

// interface  a{
//   void display();
//     }
//    interface b{
//    void show();
//    }
//     class c implements  a,b{
//     public void display(){
//       System.out.println("display method a");
//     }
//     public void show(){
//       System.out.println("show method of b");
//     }
//     }
//     public class inheritance{
//     public static void main(String[] args) {
//         c C=new c();
//         C.display();
//         C.show();
//         }
//     }

// super key word refers to immediate parent class object 

// use
/*
> to call parent class constructor 
> to call parent class method
> to call parent classs variable
*/

// class Animal {
//     String name = "animal";

//     void Display() {
//         System.out.println("this is an animal");
//     }
//  }

//  class Dog extends Animal {
//      String name = "Dog";

//      void Display() {
//          System.out.println("this is a dog");
//          System.out.println("parent class " + super.name);
//          System.out.println("child class " + name);

//      }
//  }

//  public class inheritance {
//      public static void main(String args[]) {
//          Animal a = new Animal();
//          a.Display();
//          Dog d = new Dog();
//          d.Display();
//     }
//  }

// final keyword and inheritance 
/*
final method cannot be overriden 
final class cannot be extended
 */
//  class Animal{
//   void display(){
//     System.out.println(" final class cannot inherited");
//   }
//  }
//  class Dog{
//   final void bark(){
//     System.out.println("final method can not be inherited");
//   }
//  }
//  public class Main {

//   public static void main(String[] args) {
//     Animal a= new Animal()
//     a.display();
//   }
//  }

// constructor and inheritance

//  class car{
//     car(){
//         System.out.println("car constructor call");
//     }
//  }
//   class Truck extends car{
//     Truck(){
//         super();
//         System.out.println("Truck constructor");
//     }
//   }
//   public class Main {

//     public static void main(String[] args) {
//       car c = new car();
//     }
//   }

// 

// Abstraction 
/*
improve code readility
reduce complexity
increase security by hiding internal logic 
achives loss 

way to achive ab
aproaches class
class that cannot instantiated ,may contain abstract 
(unimplemented ) methods


2.interface
a pure abstraction contains only method declaration (
untill java 8/9 defaulta


// rules of abstract class 
1.. use abstract key word to declare class and method 
2.. abstact class can have both abstract and concrete method
3.. you cannot create object of an abstract class 
4.. subclasses must implement abstract
*/

// Abstract class
// abstract class Animal {
//   abstract void sound();
//   void sleep() {
//     System.out.println("Animal can sleep...");
//   }
// }
// // concrete subclass
// class Cat extends Animal {
//   void sound() {
//     System.out.println("Cat  can meow meow");
//   }
// }
// public class Main {
//   public static void main(String[] args) {
//     Animal a1 = new Cat();
//     a1.sleep();// animal
//     a1.sound();// cat
//   }
// }



// abstract class with constructor 
// abstract class person {
// person(){
//   System.out.println("person constructor called");
// }
// abstract void details();
// }
// class memory extends person{
//   void details(){
// System.out.println("memory man");
//   }

// }
// public class Main {

//   public static void main(String[] args) {
//     person p= new memory(); 
//     p.details();
//   }
// }


// encapsulation 
//
/*/
encapsulation is the process of wrappng data ( variables ) 
and code (methods ) into a single unit 
like a capsule 


it restricts direct access to some of an objects 
components which is way of protecting data and 
improving security

data hiding 
controlled access 
improved code maintainence 
increased security 

 how to achive encapsulation in java ?
 ans::::: Declare class variable as private 
 provide public getter and setter method to acces 
 update them 
 */
//  class Student {
//     private String name;
//     private int age;
//     public String getName() {
//         return name;
//     }
//     public int getAge() {
//         return age;
//     }
//     public void setName(String n) {
//         name = n;
//     }

//     public void setAge(int a) {
//         age = a;
//         if (a>0) {
//           this.age=a;
          
//         } else{
//             System.out.println("Invalid age");

//         }
//     }
// }
// public class Main {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setName("Sahil");
//         s.setAge(0);
//         System.out.println("Name: " + s.getName());
//         System.out.println("Age: " + s.getAge());
//     }
// }

class Animal {
    Animal() {
        System.out.println("Animal family");
    }
}
interface Dog {
    void show();
}
interface Cat {
    void display();
}
class D implements Dog, Cat {
    public void display() {
        System.out.println("D constructor");
    }
    public void show() {
        System.out.println("B constructor");
    }
}
public class Main1 {
    public static void main(String[] args) {
        D c = new D();
        c.display();
        c.show();
    }
}
