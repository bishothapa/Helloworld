package class5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Give me a String");
		Scanner ui = new Scanner(System.in);
		String word = ui.next();
		 
		char[] wordArray = word.toCharArray();
		
		
		String reverseWord = "";
		for(int i = wordArray.length-1; i >= 0 ; i-- ) {
		//System.out.print(wordArray[i]);
			reverseWord = reverseWord + wordArray[i];
		}
		System.out.println(reverseWord);
	}

}
