package class5;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
//		Assignment:
//
//			1.Build a basic calculator (Plus, Minus, Multiplication, Division)
//			   a.(Ask user for a number and then ask for the second number
//			   – then ask for the operation: ADD, SUB, MULTI, DIV)
//
//			   b.Two of the math operation needs to be a static Methods and two of them to be non-static methods.
//		          All 4 operations should be in a separate class.
//			   c.Use “IF and ELSE” or “SWITCH”
//			 
//
//			2.Ask the USER for a string and print if the string is palindrome // wow = wow
//			 
//
//			3.Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
//			  
     
	@SuppressWarnings("resource")
	Scanner scan = new Scanner(System.in);
     
     System.out.println("Enter a number");
     double num1 = scan.nextDouble();
     System.out.println("Enter 2nd number");
     double num2 = scan.nextDouble();
     System.out.println("Enter:"+ " 1 to Plus, " + " 2 to Minus, "+ " 3 to Mult, "+ " 4 to Div, ");
     int calc = scan.nextInt();
     if(calc == 1) {
    	 System.out.println("ADD: "+ (num1 + num2));
     } 
     else if (calc == 2){
    	 System.out.println("SUB: "+ (num1 - num2));
     }
     else if (calc == 3) {
    	 System.out.println("MULTI: " + (num1 * num2));
    	 }
     else if (calc ==4) {
    	 System.out.println("DIV: "+ (num1 /num2));
     }
     else 
    	 System.out.println("Try again");
     
	}

}
