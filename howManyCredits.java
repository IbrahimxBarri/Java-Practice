//Ibrahim Barry
        
package test;
import java.util.Scanner;
        

public class Test {
public static void main(String[] args) {
 // declare students name
//Create a scanner object
Scanner input = new Scanner(System.in);

// Prompt the user for their name
System.out.print("1.Enter Student name:  ");
String student_name = input.nextLine() ;// Student enters response for full anme


// Ask the student how many credits they completed
System.out.print("2. " + student_name +    ", please enter the amount of credits you have completed:  ");
double creditsCompleted = input.nextDouble( ) ;// Student enters the credit total 
double b;
b = creditsCompleted;

// Ask the student how many they need to complete their degree
System.out.print("3. " + student_name +    ", please enter the amount of credits needed to complete your associates degree:  ");
double creditsNeeded = input.nextDouble( ) ;// Student enters the number of credits need to complete degree
double c;
c = creditsNeeded;

// Ask the student how many credits they take per semester
System.out.print("4. " + student_name +    ", please enter the amount of credits you take per semester:  ");
double currentCredits = input.nextDouble( ) ;// Student enters the number of credits being taken per semester 
double d;
d = currentCredits;

// Ask the student how much does 1 credit per hour 
System.out.print("5. " + student_name +    ", please enter the cost per credit hour:  ");
double costPercredit = input.nextDouble( ) ;// Student enters the cost per credit 
double e;
e = costPercredit;

// Buffering message
System.out.println( " Calculating...:  ");

// Total cost calculation 
double totalCalculation = ((c - b) * e ) ;// Student enters the cost per credit 
double y;
y = totalCalculation;

// Total amount of semesters left before graduation 
double timeRemaining = ((c - b) / (d));// Student enters the cost per credit 
double x = Math.ceil(timeRemaining);


/* Output the number of remaining number of semesters ( be sure to use a whole number rounded up, you can't take .314 of a semester )
, and the estimated cost to complete the degree.*/
System.out.print( student_name + ", based on my calculations it will require  " + x + " more semesters to complete your degree, \n" +
"at a total cost of "+"$"+ y + " plus additional fees and cost of books.");


    }
  
  }
  

