/*******************************************************************************
 W3Schools Java Tutorial
00_basic_syntax.java
*******************************************************************************/

/*
=== Basic Syntax ===
Java "Hello World" / System.out.println()
Java data types
    byte    : Stores whole numbers from -128 to 127
    short   : Stores whole numbers from -32,768 to 32,767
    int     : Stores whole numbers from -2,147,483,648 to 2,147,483,647
    long    : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float   : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double  : Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
    boolean : Stores true or false values
    char    : Stores a single character/letter or ASCII values
Java strings
Java operators
Java string concat
Java if, else if, and else
Java switch
Java while loop
Java for loop
Java break/continue
Java arrays

Java functions
Java function params
Java method overloading
Java scope
Java recursion
*/

/*
=== Java Classes ===
Java OOP
Java Classes/Objects
Java Class Attributes
Java Class Methods
Java Constructors
Java Modifiers
Java Encapsulation
Java Packages / API
Java Inheritance
Java Polymorphism
Java Inner Classes
Java Abstraction
Java Interface
Java Enums
*/

/*
=== User IO and Data Structures ===
Java User Input (import java.util.Scanner;) (std::cin >>)
Java Date
Java ArrayList
Java LinkedList
Java List Sorting
Java HashMap
Java HashSet
Java Iterator
Java Wrapper Classes
Java Exceptions
Java RegEx
Java Threads
Java Lambda
Java Advanced Sorting
*/

/*
=== Java File IO ===
Java Files
Java Create/Write Files
Java Read Files
Java Delete Files
*/

/*
=== Java How To's ===
Add Two Numbers
Count Words
Reverse a String
Sum of Array Elements
Convert String to Array
Sort an Array
Find Array Average
Find Smallest Element
ArrayList Loop
HashMap Loop
Loop Through an Enum
Area of Rectangle
Even or Odd Number
Positive or Negative
Square Root
Random Number
*/

public class Main{
    public static void example_00(String[] args){
        
    }
    

    public static void main(String[] args){
        //example_00();
        
        // printing to stdout
        System.out.println("Hello, World.");
        System.out.println("I am learning Java.");
        
        System.out.print("It is awesome! ");
        System.out.print("This will print on the same line.\n");
        
        System.out.println(3); // we can print numbers
        System.out.println(3 + 3); // we can do calculations
        
        // different data types:
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello"
        System.out.println(myText + " " + myNum) // combining string and numbers in a print statement
        
        /*
        byte    : Stores whole numbers from -128 to 127
        short   : Stores whole numbers from -32,768 to 32,767
        int     : Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long    : Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float   : Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double  : Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean : Stores true or false values
        char    : Stores a single character/letter or ASCII values
        */
        
        // scientific numbers
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
        
        // booleans
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false



    }
}
