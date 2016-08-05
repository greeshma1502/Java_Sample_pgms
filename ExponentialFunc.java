import java.util.Scanner;

public class ExponentialFunc {

	public static void main(String[] args) {
		ExponentialFunc ef = new ExponentialFunc();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter two positive numbers");
		int a = sc.nextInt();
		int b = sc1.nextInt();
		if (a < 0 || b < 0) {
			System.out
					.println("Negatives not allowed, Enter two positive numbers");
		}
		int result = ef.exponentialOperation(a, b);
		System.out.println("Result is " + result);
	}

	public int exponentialOperation(int a, int b) {

		int temp = 1;
		int i = 1;
		while (i <= b) {
			temp = temp * a;
			i++;
		}
		return temp;
	}

}
