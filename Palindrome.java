import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome pl = new Palindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		System.out.println(str);
		char[] chr = str.toCharArray();

		String str1 = pl.palindrome(chr);

		if (str1.equals(str))
			System.out.println("String is a palindrome");
		else
			System.out.println("Not a palindrome");
	}

	public String palindrome(char[] chr) {
		char[] temp = new char[chr.length];
		for (int i = 0, j = temp.length - 1; i < chr.length; i++, j--) {
			temp[j] = chr[i];
		}
		String str1 = new String(temp);
		return str1;
	}
}
