package class5;

public class Calculator_SUB {

	public static int sub(int num1 , int num2) {
		 int res ;
		 if (num1 > num2) {
			 res = num1 - num2;
		 }
		 else {
			 System.out.println("First number must be greater than second number ");
			 res = 0;
		 }
		 return res;

	}

}
