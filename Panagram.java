import java.io.*;
import java.util.*;

class Panagram {
    public static void main(String [] args) throws Exception{
        BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));
        // Get raw input
        String str = in.readLine();
        
        // Build a set of lower case alphabets
        
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        Set<Character> lowerCaseAlphabets = new HashSet<Character>();
        for (int i=0; i < alphabets.length(); i++) {
        	lowerCaseAlphabets.add(alphabets.charAt(i));
        }
        
        // Basic check, return all alphabets
        if (str == null || str.length() < 1) {
        	   System.out.println(alphabets.toUpperCase());
        }
        
        // convert to lowerCase
        char input[] = str.toLowerCase().toCharArray();
        
        // Build a set of found alphabets
        Set<Character> foundAlphabets = new HashSet<Character>();
        for (int i=0; i < input.length; i++) {
        	int asciiValue = (int) input[i];
        	if (asciiValue >= 97 && asciiValue <= 122) {
        		foundAlphabets.add(input[i]);
        	}
        }

        // Do a diff between lowerCaseAlphabets and foundAlphabets
        lowerCaseAlphabets.removeAll(foundAlphabets);
        
        // Print the output accordingly
        if (lowerCaseAlphabets.size() == 0) {
     	   System.out.println("-");

        } else {
        	String missingAplabhets = "";
        	for (Character c : lowerCaseAlphabets) {
        		missingAplabhets = missingAplabhets + c;
        	}
        	System.out.println("Missing alphabets:" + " " + missingAplabhets.toUpperCase());
        }
        
    }
}