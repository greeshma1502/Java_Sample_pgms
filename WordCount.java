import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public static void main(String[] args) throws Exception {
		WordCount wordcount = new WordCount();
		Scanner sc = new Scanner(System.in);
		String result = wordcount.getHtml(args[0]);
		System.out.println("Enter the word to find out the WordCount");
		String inputWord = sc.nextLine();
		int count = wordcount.countWordFrequency(result, inputWord);
		System.out.println("Count of the word is " +count);
	}

	private String getHtml(String urlRead) throws Exception {
		StringBuilder result = new StringBuilder();
		URL url = new URL(urlRead);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		BufferedReader read = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line;

		while ((line = read.readLine()) != null) {
			result.append(line);
			result.append('\n');
		}
		read.close();
		return result.toString();
	}

	private int countWordFrequency(String result, String inputWord) {

		int i = 0;
		Pattern p = Pattern.compile(inputWord);
		Matcher m = p.matcher(result);
		while (m.find()) {
			i++;
		}
		return i;
	}
}
