package class5;

import java.util.Scanner;

public class OddndEven {
   //3.Ask user for a number and print out ODD if the number is odd; otherwise print EVEN.
	public static void main(String[] args) {
		 System.out.println("Please enter your number:");
		 Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num% 2 == 0) {
			System.out.println("The number is even.");
		}
		else if (num% 2!=0){
			System.out.println("The number is odd.");
		}
	}	 
}
