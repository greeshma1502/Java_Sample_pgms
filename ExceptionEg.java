import java.util.Scanner;

public class ExceptionEg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		divideNumbers(i, j);
	}

	public static void divideNumbers(int i, int j) {
		try {
			int result = i / j;
			System.out.println("result is " + result);
		} catch (ArithmeticException e1) {
			System.out.println("cannot divide by 0");
		}
	}
}


