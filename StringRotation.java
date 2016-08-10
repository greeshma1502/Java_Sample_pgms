import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) {
		StringRotation sr = new StringRotation();
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the strings");
		String str = sc.next();
		String str1 = sc1.next();
		boolean bool = sr.checkStringRotation(str, str1);
		System.out.println("Answer " + bool);
	}

	public boolean checkStringRotation(String str, String str1) {

		if (str.length() == str1.length()) {
			String concat = str1 + str1;
			if (concat.contains(str)) {
				return true;
			}
		}
		return false;
	}
}
