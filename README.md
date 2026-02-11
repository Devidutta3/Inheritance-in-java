## What is Inheritance?

Inheritance is a mechanism where one class (child/subclass) acquires the fields and methods of another class (parent/superclass) using the extends keyword.

## Why Use Inheritance?

Promotes code reusability

Reduces redundancy

Improves code readability

Supports method overriding and polymorphism

Types of Inheritance in Java

Single Inheritance

Multilevel Inheritance

Hierarchical Inheritance

<b><i>Note: Java does not support multiple inheritance using classes. It can be achieved using interfaces.</i></b>
## <u> Example</u>
<em>
class Parent { <br>
   <br> void show() { <br>
       <br> System.out.println("This is Parent class");<br>
    }<br>
}<br>
<br>
<br>class Child extends Parent {<br>
   <br> void display() {<br>
      <br>  System.out.println("This is Child class");<br>
  <br>  }<br>
<br>}<br>
<br>
public class Main {<br>
  <br>  public static void main(String[] args) {<br>
      <br>  Child obj = new Child();<br>
     <br>   obj.show();<br>
    <br>    obj.display();<br>
   <br> }<br>
<br>}<br>
</em>

## Key Features

<ol type="1">Uses extends keyword

Enables runtime polymorphism

Encourages hierarchical class structure </ol>

## Advantages

Easy maintenance

Better scalability

Clean and modular code

## Limitations

Increases coupling between classes

Multiple inheritance not supported with classes

<em>Conclusion<em>

<i>Inheritance helps build reusable, organized, and efficient Java applications. It is a fundamental OOP concept that every Java developer must understand.<i>

<strong>Author<strong>

Krishna
Creator of CodingHub 🚀<img width="1249" height="514" alt="1_mcv2uIZnDYodmTBJGjtwXg" src="https://github.com/user-attachments/assets/1fadc7f2-b91e-4233-a899-c5712441c622" />
<img width="280" height="180" alt="images" src="https://github.com/user-attachments/assets/c2e52573-1c41-4357-a1a9-eb4c3f1518cb" />
<img width="1249" height="514" alt="1_mcv2uIZnDYodmTBJGjtwXg" src="https://github.com/user-attachments/assets/497ef272-8f25-44a4-bc12-c355905ed3a3" />


# Shape Program using Hierarchical Inheritance (Java)

This repository contains a simple Java program that demonstrates **Hierarchical Inheritance** using a `Shape` example.  
The program calculates the **area of Rectangle and Circle** using inheritance, `this` keyword, and `Scanner` class.

---

## 📘 Concept Used

**Hierarchical Inheritance**  
- One superclass  
- Multiple subclasses  
- All subclasses directly extend the same superclass  

In this project:
- `Shape` → Superclass  
- `Rectangle`, `Circle` → Subclasses  

---

## 🏗️ Class Structure

    Shape
   /     \

---

## 🧩 Program Features

- Demonstrates **Hierarchical Inheritance**
- Uses **`this` keyword** for instance variables
- Takes **user input** using `Scanner`
- Simple and **exam-oriented** Java program
- Beginner friendly

---

## 📂 Files Included

- `Shape.java` – Super class
- `Rectangle.java` – Sub class to calculate rectangle area
- `Circle.java` – Sub class to calculate circle area
- `ShapeTest.java` – Main class

---

## ▶️ How to Run the Program

1. Clone the repository
   ```bash
   git clone https://github.com/Devidutta3/your-repo-name.git
javac ShapeTest.java
java ShapeTest


Enter length: 5
Enter breadth: 4
Area of Rectangle = 20

Enter radius: 7
Area of Circle = 153.86

