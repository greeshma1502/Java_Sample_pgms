import java.util.Scanner;

public class PermutationsOfString {

	public static void main(String[] args) {
		PermutationsOfString pos = new PermutationsOfString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = sc.nextLine();
		pos.findPermutationsOfString(input);
	}

	public void findPermutationsOfString(String input) {
		findPermutationsOfString("", input);
	}

	public void findPermutationsOfString(String prefix, String input) {

		int size = input.length();
		if (size == 0) {
			System.out.println(prefix);
		}
		for (int i = 0; i < size; i++) {

			findPermutationsOfString(prefix + input.charAt(i),input.substring(0, i) + input.substring(i + 1, size));
		}
	}
}












