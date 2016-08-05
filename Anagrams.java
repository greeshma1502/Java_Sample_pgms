public class Anagrams {

	public static void main(String[] args) {
		Anagrams an = new Anagrams();
		String str1 = "silent";
		String str2 = "listenp";

		boolean bool = an.anagrams(str1, str2);
		System.out.println("Anagrams? " + bool);
	}

	public boolean anagrams(String str1, String str2) {

		char[] ch1 = str1.toCharArray();
		
		if (str1.length() != str2.length()) {
			return false;
		}
					
		for (int i = 0; i < ch1.length; i++) {
				if (str2.indexOf(ch1[i]) >= 0) {
					System.out.println("index " +str2.indexOf(ch1[i]));
				}
				else
					return false;
			}
		return true;
	}
}

// int[] a1 = new int[ch1.length];
// int[] a2 = new int[ch2.length];
//
// if (str1.length() == str2.length()) {
// for (int i = 0; i < a1.length; i++){
// for (char ch : ch1) {
// char temp = str1.charAt(ch);
// a1[i] = (int) temp;
// }
// }
//
// System.out.println("ascii array " +a1);
// }

