package class5;

public class Calculator_DIV {
	
	public double div(int num1, int num2) {
		int result;
		if (num2!=0) {
			result = num1/num2;
		}
		else {
			System.out.println("Second number can't be 0");
			result = 0;
		}
		return result;
	}

}
