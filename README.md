
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
```

Classes: Instance Fields
-

```java
public class Car { 

 /* 
 declare fields inside the class 
 by specifying the type and name 
 */ 

//instance variables
 public String color; 
 public int year; 
 public String modelName; 
 public String make; 

 public Car() { 
   /*  
   instance fields available in 
   scope of the constructor method 
   */ 
 } 
} 
```

Instance variables are specific to each instance of the class which means that each object created from the class will have its own copy of these variables. These fields can be set in the following three ways:

1. If they are public, they can be set like this instanceName.fieldName = someValue;
2. They can be set by class methods
3.They can be set by the constructor method


Classes: Constructor Parameters
-

```java
public class Car { 
  public String color; 

  // constructor method with a parameter 
  public Car(String carColor) { 
    // parameter value assigned to the field 
    color = carColor; 
  } 
} 
```
There are two types of parameters: formal and actual. The parameter we defined in the above example, String carColor, is a formal parameter. 

A class can have multiple 
constructors. We can differentiate them based on their parameters. The signature helps the  compiler to differentiate between different
methods

```java
public class Car { 
  public String color; 
  public int mpg; 
  public boolean isElectric; 

  // constructor 1 
  public Car(String carColor, int milesPerGallon) { 
    color = carColor; 
    mpg = milesPerGallon; 
  } 

  // constructor 2 
  public Car(boolean electricCar, int milesPerGallon) { 
    isElectric = electricCar; 
    mpg = milesPerGallon; 
  } 
} 
```
When we don’t define the constructor, the Java compiler creates a default constructor that assigns default values to an instance. Default values can be created by assigning values to the instance fields during their declaration:

```java
public class Car { 
 public String color = "red"; 
 public boolean isElectric = false; 
 public int cupHolders = 4; 

 public static void main(String[] args) { 
   Car myCar = new Car(); 
   System.out.println(myCar.color); // Prints: red 
 } 
} 
```
Classes: Assigning Values to Instance Fields
-

An argument refers to the actual values passed during the method call while a parameter refers to the 
variables declared in the method signature.
When we pass an argument, a copy of the argument value is passed to the parameter rather than the actual variables. This process of calling a method with an argument value is called a call-by-value.


Importing Arrays
-

If we want to have a more descriptive printout of the array itself, we need a toString() method that is provided by the  Arrays package in Java.
```java
import java.util.Arrays;
```
When we import a package in Java, we are making all of the methods of that package available in our code.
The Arrays package has many useful methods, including Arrays.toString(). When we pass an array into Arrays.toString(), we can see the contents of the array printed out:
```java
import java.util.Arrays;

public class Lottery(){
  
  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }

}
```
without using the library, we will see a memory address that doesnt  help us understand what was contained in the array.

Creating an Empty Array
-

```java
String[] my_names = new String[5];
int[] my_ages = new int[5];
```
When we use new to create an empty array, each element of the array is initialized with a specific value depending on what type the element is:
Data Type	Initialized Value
int	0
double	0.0
boolean	false
Reference	null

in the code above: Because a String is a reference to an Object, my_names will contain five nulls. my_ages will contain five 0s to begin with.

ArrayLists
-
to import the library
```java
import java.util.ArrayList;
```
To create mutable and dynamic lists, we can use Java’s 
ArrayList
Preview: Docs A dynamic array class in Java that automatically resizes and offers type safety along with convenient methods for data access and manipulation.
 class. ArrayList allows us to:

-Store object references* as elements
*An object reference is a variable that points to an object in memory.
```java
class Dog {
    String name;
}
Dog d = new Dog();
//d is the ref variable
```

Creating ArrayLists
-
```java
// This code won't compile:
ArrayList<int> ages;

// This code will compile:
ArrayList<Integer> ages;
```
```java
// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();

// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();
```
Adding an Item
-
```java
ArrayList<Car> carShow = new ArrayList<Car>();

carShow.add(ferrari);
// carShow now holds [ferrari]
carShow.add(thunderbird);
// carShow now holds [ferrari, thunderbird]
carShow.add(volkswagen);
// carShow now holds [ferrari, thunderbird, volkswagen]
```
```java
// Insert object corvette at index 1
carShow.add(1, corvette);
// carShow now holds [ferrari, corvette, thunderbird, volkswagen]

// Insert object porsche at index 2
carShow.add(2, porsche);
// carShow now holds [ferrari, corvette, porsche, thunderbird, volkswagen]
```
In the following snippet, assortment is an ArrayList that can store different values because we do not specify its type during initialization.
```java
ArrayList assortment = new ArrayList<>();
assortment.add("Hello"); // String
assortment.add(12); // Integer
assortment.add(ferrari); // reference to Car
// assortment holds ["Hello", 12, ferrari]
```
In this case, the items stored in this ArrayList will be considered Objects. As a result, they won’t have access to some of their methods without doing some fancy casting.

ArrayList Size
-
```java
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
System.out.println(shoppingCart.size());
// 1 is printed
shoppingCart.add("Tweed Houndstooth Hat");
System.out.println(shoppingCart.size());
// 2 is printed
shoppingCart.add("Magnifying Glass");
System.out.println(shoppingCart.size());
// 3 is printed
```

Accessing an Index
-
With arrays we can use bracket notation to access a value at a particular index:
```java
double[] ratings = {3.2, 2.5, 1.7};

System.out.println(ratings[1]);
//2.5
```
For ArrayLists, bracket notation won’t work. Instead, we use the method get() to access an index:
```java
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

System.out.println(shoppingCart.get(2));
```
Changing a Value
-
When we were using arrays, we could rewrite entries by using bracket notation to reassign values:
```java
String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};

shoppingCart[0] = "Tweed Cape";

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```
in ArrayList, we use set
```java
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.set(0, "Tweed Cape");

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```
Removing an Item
-
```java
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]
```
```java
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove("Trench Coat");
// shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]

```

Getting an Item's Index
-
```java
// detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
System.out.println(detectives.indexOf("Fletcher")); //4
```

Removing Elements During Traversal
-
When an element is removed from an ArrayList, all the items that appear after the removed element will have their index value shift by negative one

Removing An Element Using while
-
When using a while loop and removing elements from an ArrayList, we should not increment the while loop’s counter whenever we remove an element. We don’t need to increase the counter because all of the other elements have now shifted to the left. For example, if we removed the element at index 3, then the element that was at index 4 will be moved to index 3. If we increase our counter to 4, we’ll skip that element!
```java
int i = 0; // initialize counter

while (i < lst.size()) {
  // if value is odd, remove value
  if (lst.get(i) % 2 != 0){
    lst.remove(i);
  } else {
    // if value is even, increment counter
    i++;
  }
}
```
Removing An Element Using for
-
must increase our loop control variable — the loop control variable will always change when we reach the end of the loop (and it will usually change by 1 because we often use something like i++.) 
```java
for (int i = 0; i < lst.size(); i++) {
  if (lst.get(i) == "value to remove"){
    // remove value from ArrayList
    lst.remove(lst.get(i));
    // Decrease loop control variable by 1
    i--;    
  }
}
```
Note: Avoid manipulating the size of an ArrayList when using an enhanced for loop. Actions like adding or removing elements from an ArrayList when using a for each loop can cause a ConcurrentModificationException

String Methods
-
```java
String str = "Hello World!";  

System.out.println(str.length()); //12
```
```java
String name = new String("Code");

name = name.concat("cademy");

System.out.println(name);
//Strings are immutable objects which means that String 
methods , like concat() do not actually change a String object.
```
```java
String flavor1 = "Mango";
String flavor2 = "Peach";

System.out.println(flavor1.equals("Mango"));
// prints true

System.out.println(flavor2.equals("Mango"));
// prints false

System.out.println(flavor1.compareTo(flavor2)
//-3 

// equalsIgnoreCase() -> method that compares two strings without considering upper/lower cases.
```
When we use .compareTo(), we must pay attention to the return value:

If the method returns 0, the two Strings are equal.
If the value is less than 0, then the String object is lexicographically less than the String object argument.
If the value is greater than 0, then the String object is lexicographically greater than the String object argument.

```java
String letters = "ABCDEFGHIJKLMN";

System.out.println(letters.indexOf("C"));
//2
System.out.println(letters.indexOf("EFG"));
//4
System.out.println(letters.indexOf("z"));
//-1
```
```java
String str = "qwer";
System.out.println(str.charAt(2)); //e
System.out.println(str.charAt(4)); //java.lang.StringIndexOutOfBoundsException: String index out of range: 4
```
```java
String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(24)); //Constellations rung

String line = "The Heav'ns and all the Constellations rung";

System.out.println(line.substring(27, 33)); //(0 indexed)starts from 27 and ends at 32  //stella
```
```java
String input = "Cricket!";

String upper = input.toUpperCase();
// stores "CRICKET!"

String lower = input.toLowerCase();
// stores "cricket!"
```
## Access, Encapsulation, and Static Methods
What are Access and Scope?
-
