
<img width="3542" height="3542" alt="Java Module 1- Lesson 1-JVM -ART 408" src="https://github.com/user-attachments/assets/a453de7f-efb6-4630-9932-ba78907d88d4" />


Java is a compiled programming language, meaning the code we write in a .java file is transformed into byte code by a 
compiler before it is executed by the Java Virtual Machine on your computer.

<img width="4376" height="959" alt="Java M1L1- Compilation Process ART 409" src="https://github.com/user-attachments/assets/d7a2451b-f45c-4549-8cac-999abf578026" />
The compiling process catches mistakes before the computer runs our code.

For example, with a file called Plankton.java, we could compile it with the terminal command:

''javac Plankton.java''


A successful compilation produces a .class file: Plankton.class, that we execute with the terminal command:

''java Plankton''

Run the ls command in the terminal to see the uncompiled .java file.

Java Data Types
-
Data types are divided into two categories, primitive data types and reference data types. Java is a statically-typed language.
Primitive Data Types

<img width="791" height="378" alt="Screen Shot 2026-02-06 at 10 44 25 PM" src="https://github.com/user-attachments/assets/70d6052e-8702-45e0-a3c7-dee9586cd8d2" />


Reference Data Types
Reference data types, also known as object data types, are data types which are defined by the user and are references to a specific object.

Reference data types include:
Annotations - allow metadata to be associated with elements of a program
Arrays - store elements of the same type
Classes - provide a template for object creation
Enumeration - stores a fixed set of constants
Interfaces - store a template for a class

Static Typing
-
In Java, the type of variable is checked at compile time. This is known as static typing. It has the advantage of catching the errors at compile time rather than at execution time.

classes in java
-
<img width="5059" height="3705" alt="image" src="https://github.com/user-attachments/assets/456dfaa0-b7ad-4c4b-b522-314769f5ccce" />

In Java, classes are blueprints or templates for objects in Java. Classes are classified as a reference data type.


<img width="734" height="229" alt="Screen Shot 2026-02-06 at 10 52 23 PM" src="https://github.com/user-attachments/assets/58e74903-bbbd-4e94-b4e0-fd155d010727" />

They use an accessModifier (public, private, and protected) to determine its visibility to other files.
Inside the class “blueprint” are members.

Class Instances
-
instances are objects that are based on existing classes.

Every instance has access to its own set of variables known as instance fields. These are variables declared within the scope of the instance and supplied with new values within the class constructor method during initialization.


```java
// Person.java
public class Person {
  int age;
  String name;

  // Constructor method
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public static void main(String[] args) {
    Person Bob = new Person(31, "Bob");
    Person Alice = new Person(27, "Alice");

    System.out.println(Bob.name + " is " + Bob.age + ".");
    System.out.println(Alice.name + " is " + Alice.age + ".");
  }
}
```


Classes: Constructors
-

the constructor is a special type of method defined within the class, used to initialize fields when an instance of the class is created.The name of the constructor method must be the same as the class itself

```java
public class Car { 

 // Constructor
 public Car() { 

   // instructions for creating a Car instance 
 }   
} 
```



```java
Car ferrari = new Car(); 
```

After the assignment operator, (=), we call the constructor method, Car(), using the keyword new to indicate that we’re creating a new instance of the Car class.
## What Happens When You Write:

```java
Car ferrari = new Car();
Java performs this in two steps.

✅ Step 1 — The Constructor Runs (Object Initialization)
java
Copy code
new Car();
This does the following:

Creates a Car object in memory (heap)

Executes the constructor

Initializes the object’s fields (speed, color, etc.)

Example:

java
Copy code
public Car() {
    speed = 0;
    color = "red";
}
At this point, a real object exists in memory:

ini
Copy code
speed = 0
color = red
This is the actual object.

✅ Step 2 — The Variable Stores the Object’s Address (Reference)
java
Copy code
Car ferrari = ...
The variable ferrari does not store the object itself.

Instead, it stores a reference (memory address) pointing to the object.

Conceptually:

nginx
Copy code
ferrari → 0x76ed5528
So:

The constructor initializes the object

The variable stores the reference to that object
