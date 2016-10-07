import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SpellChecker {

	public static void main(String[] args) throws IOException {
		SpellChecker spellchecker = new SpellChecker();
		URL url = new URL(
				"http://www.andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner(url.openStream());

		HashSet<String> spellCheck = new HashSet<String>();
		ArrayList<String> words = new ArrayList<String>();
		while (sc.hasNext()) {
			spellCheck.add(sc.next());
		}
		// for (String s : spellCheck) {
		// System.out.println(s);
		// }
		BufferedReader reader = new BufferedReader(
				new FileReader("newfile.txt"));
		String line;
		while ((line = reader.readLine()) != null) {
			words.add(line);
		}
		// System.out.println(words);
		spellchecker.spellChecker(spellCheck, words);
	}

	public void spellChecker(HashSet<String> spellCheck, ArrayList<String> words) {

		System.out.println("Misspelled words");
		System.out.println(".............................");
		for (String s : words) {
			if (!spellCheck.contains(s)) {
				System.out.println(s);
			}

		}
	}
}
