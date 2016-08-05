import java.util.Scanner;

public class ExceptionEg {

	public static void main(String[] args) {
		// String s1 = "abdc";
		// String s2 = "chdgs";
		// convertNumbers(s1, s2);
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

// public static void convertNumbers(String s1, String s2) {
// try {
//
// int i = Integer.parseInt(s1);
// int j = Integer.parseInt(s2);
// System.out.println("Converted values" + i + j);
// divideNumbers(i, j);
//
// } catch (NumberFormatException e) {
// System.out.println("Args must be integers");
// } catch (ArithmeticException e1){
// System.out.println("Cannot divide by 0");
// }
//
// }

