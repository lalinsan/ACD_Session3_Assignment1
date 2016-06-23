/*
* Student: Eduardo Aguirre
* Session 3
* Assignment 1
* Java program that calculates square root and cube root of a provided number in Java. Use Math class and its static
* method sqrt(...) & cbrt(...).
*/
 
import java.util.Scanner; //Imports Scanner Class from java API Class Library
import java.text.*; //Imports Text Class from java API Class Library
 
public class SquareCubeRoot {
 
       public static void main(String[] args) { //Main Method to call to start the Program
              double square; //Variable to store the number to apply the Square root to
              double cube;   //Variable to store the number to apply the Cube root to
             
              @SuppressWarnings("resource")
              Scanner sc = new Scanner (System.in); //Creates an Instance if of Scanner Object to take user's input
             
              String choice ="Y"; //Variable to store the user's choice to run the App.
              while (choice.equalsIgnoreCase("Y")||choice.equalsIgnoreCase("Yes")) //Executes code as long as the User's choice = Y or Yes
              {
                     System.out.println("Welcome to calculate Square|Cube Root App"); //Initial Welcome Message
                     //Square Root
                     System.out.print("Enter number to calculate the Square Root for: "); //Prompts user to enter a Number
                     square = sc.nextDouble(); //Stores the number to calculate the Square Root
                     double squareRoot = Math.sqrt(square); //Calculates Square Root using Math Class square root Method
                    
                     //Cube Root
                     System.out.print("Enter number to calculate the Cube Root for: ");//Prompts user to enter a Number
                     cube = sc.nextDouble();//Stores the number to calculate the Cube Root
                     double cubeRoot   = Math.cbrt(cube);   //Calculates Cube Root using Math Class and method cube root Method
                    
                    
                     DecimalFormat df = new DecimalFormat("0.000"); //Uses the DecimalFormat class and stores the defined format 3 decimal into the df variable
                    
                     System.out.println("Square Root of : " +square +" is " + df.format(squareRoot)); //Prints out the Square Toot
                     System.out.println("Cube   Root of : " +cube   +" is " + df.format(cubeRoot)); //Prints out Cube Root
                 
                     System.out.print("Do you want to calcualte another number (Y|N) ? "); //Prompts user to enter another number
                     choice = sc.next(); //Stores User's selection
              }
              System.out.println("Thanks for using Square|Cube Root App ");
       }
 
}