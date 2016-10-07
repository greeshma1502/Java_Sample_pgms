import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// brute force method
public class Anagrams {

	public static void main(String[] args) throws IOException {
		Anagrams anagrams = new Anagrams();
		URL url = new URL(
				"http://www.andrew.cmu.edu/course/15-121/dictionary.txt");
		Scanner sc = new Scanner(url.openStream());

		// HashSet to store words from the webpage (stores 5000 out of 18000 words).
		
		HashSet<String> dictionaryWords = new HashSet<String>();
		int counter = 0;
		while (sc.hasNext() && counter < 5000) {
			dictionaryWords.add(sc.next());
			counter++;
		}

		HashMap<String, ArrayList<String>> anagramMap = new HashMap<String, ArrayList<String>>();

		for (String word : dictionaryWords) {

			String keyWord = anagrams.keyWordSorted(word);
			ArrayList<String> value = anagrams.findAnagrams(keyWord,
					dictionaryWords);
			anagramMap.put(keyWord, value);
		}

		for (ArrayList<String> temp : anagramMap.values()) {
			if (temp.size() > 1) {
				System.out.println(temp);
			}
		}
	}

	// method to find anagrams of the keyword passed
	public ArrayList<String> findAnagrams(String keyWord,
			HashSet<String> dictionaryWords) {

		ArrayList<String> temp = new ArrayList<String>();
		char[] ch1 = keyWord.toCharArray();
		char[] ch2;

		for (String word : dictionaryWords) {
			ch2 = word.toCharArray();
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
				temp.add(word);
			}
		}
		return temp;
	}

	// sorting the word in alphabetical order
	public String keyWordSorted(String keyWord) {
		char[] chr = keyWord.toCharArray();
		Arrays.sort(chr);
		return String.valueOf(chr);
	}
}
