package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class StringProg {

	// Divide string into n equal parts.

	// le = 12
	// N = 3
	// part = 4

	public static void divideString(int N) {

		String s = "Prashant";

		int partition = s.length() / N;
		int i;
		while (!s.isEmpty()) {

			if (s.length() % N != 0) {

				System.out.println("String can not be divided into {N} equal parts");
				break;
			}

			for (i = 0; i < partition; i++) {

				System.out.print(s.charAt(i));

			}
			System.out.println();
			s = s.substring(partition);

		}

	}
	
	//input = A$b$d#r# 
	//output = Abdr$$##
	
	public static void manipulateString() {
		
		String input = "A$b$d#r#";
		String[] sarray = input.split("");
		String charString = "";
		String signString = "";
		
		for (int i = 0; i<sarray.length; i++) {
			
			if (sarray[i].matches("[A-Za-z]")) {
				
				charString = charString.concat(sarray[i]);
			}
			
			else {
				signString = signString.concat(sarray[i]);
			}
		}
		
		System.out.println(charString + signString);
		
		
		
		
		
	}
	
	
	

	/* Remove whitespces from the string */

	public static void removeWhiteSpaces(String s) {

		for (int i = 0; i < s.length(); i++) {
			{

				s = s.replaceAll(" ", "");

			}

		}
		System.out.println(s);

	}

	// replace lower case with upper case and vice-versa.

	public static void changeCasing(String s) {

		StringBuffer newString = new StringBuffer(s);

		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(s.charAt(i))) {
				newString.setCharAt(i, Character.toUpperCase(s.charAt(i)));

			}

			else if (Character.isUpperCase(s.charAt(i))) {
				newString.setCharAt(i, Character.toLowerCase(s.charAt(i)));
			}

			else {
				newString.setCharAt(i, s.charAt(i));
			}
		}

		System.out.println(newString);

	}

	// program to find maximum and minimum occurring character in any string.

	public static void findOccur(String s) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String[] strArr = s.split("");
		for (String str : strArr) {
			if (!map.containsKey(str)) {
				map.put(str, 1);
			}

			else {
				map.put(str, map.get(str) + 1);
			}

		}

		ArrayList<Integer> valuelist = new ArrayList<>();
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();

		for (Map.Entry m : map.entrySet()) {

			valuelist.add((Integer) m.getValue());
		}

		Collections.sort(valuelist);
		for (int i : valuelist) {

			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue().equals(i)) {
					lmap.put(entry.getKey(), i);
				}
			}

		}

		System.out.println(lmap);

	}

	// find the reverse of the string
	public static void reverseString(String s) {

		String[] sarray = s.split("");
		String reverserString = "";
		for (int i = sarray.length - 1; i >= 0; i--) {

			reverserString = reverserString.concat(sarray[i]);

		}

		System.out.println(reverserString);

	}

	// find the duplicate character
	public static void findDupChar(String s) {

		HashSet<Character> hset = new HashSet<>();
		char[] carray = s.toCharArray();

		for (char c : carray) {
			if (! hset.add(c)) {
				
				System.out.println(c);
			}
		}
		
		/*
		 * for (char c : carray) {
		 * 
		 * if (!map.containsKey(c)) { map.put(c, 1); }
		 * 
		 * else { map.put(c, map.get(c) + 1); }
		 * 
		 * }
		 * 
		 * ArrayList<Character> dupChar = new ArrayList<>();
		 * 
		 * for (Entry<Character, Integer> entry : map.entrySet()) {
		 * 
		 * if (entry.getValue() > 1) { dupChar.add(entry.getKey()); }
		 * 
		 * }
		 * 
		 * System.out.println(dupChar);
		 */
	}

	// find duplicate worlds in any string
	public static void findDupWords(String s) {

		HashMap<String, Integer> map = new HashMap<>();
		String[] sarray = s.split(" ");

		for (String str : sarray) {

			if (!map.containsKey(str)) {
				map.put(str, 1);
			}

			else {
				map.put(str, map.get(str) + 1);
			}

		}

		ArrayList<String> dupword = new ArrayList<>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {

				dupword.add(entry.getKey());

			}

		}

		System.out.println(dupword);

	}

	// find the largest and smallest word in the string.

	public static void findLargestWord(String s) {

		HashMap<String, Integer> map = new HashMap<>();

		String[] sarray = s.split(" ");

		for (String str : sarray) {

			map.put(str, str.length());

		}

		ArrayList<Integer> list = new ArrayList<>();

		for (Entry<String, Integer> entry : map.entrySet()) {

			list.add(entry.getValue());

		}

		Collections.sort(list);
		
		int leastLength = list.get(0);
		
		int maxLength = list.get(list.size() - 1);
		
		
		ArrayList<String> longestWord = new ArrayList<>();
		ArrayList<String> shortestWord = new ArrayList<>();

		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() == maxLength) {
				longestWord.add(entry.getKey());
				
			}
			
			if (entry.getValue() == leastLength) {
				shortestWord.add(entry.getKey());
				
			}

		}
		
		
		System.out.println("Longest words in the strings are: " + longestWord);
		System.out.println("Shortest words in the strings are: " + shortestWord);
		
		

	}

	public static void main(String[] args) {

		manipulateString();
	}

}
