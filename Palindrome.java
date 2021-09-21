package class5;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Ask the USER for a string and print if the string is palindrome // wow = wow
		
		System.out.println("Please print your string here:");
		@SuppressWarnings("resource")
		Scanner pal = new Scanner(System.in);
		String newui  = pal.next();
		
		char[] nchar =  newui.toCharArray();
		String result = "";
		 for (int i = newui.length()-1 ; i>=0 ; i--) {
			 result = result + nchar[i];
		 }
		 System.out.println("Reverse sequence of the string = " + result);
		 
		 if (newui.equals(result)) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("Not Palindrome" );
		 }
		
		

	}

}
