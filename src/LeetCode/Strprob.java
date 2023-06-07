package LeetCode;

import java.util.*;

// leetcode problems from String
public class Strprob {

	// performa operation

	// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

	public static void performOperation() {

		String[] operations = { "--X", "X++", "X++", "X++" };

		int finalValue = 0;

		for (String s : operations) {

			if (s.equalsIgnoreCase("--X") || s.equalsIgnoreCase("X--")) {

				finalValue = finalValue - 1;

			}

			else if (s.equalsIgnoreCase("++X") || s.equalsIgnoreCase("X++")) {
				finalValue = finalValue + 1;

			}

		}

		System.out.println(finalValue);

	}

	// https://leetcode.com/problems/jewels-and-stones/
	public static void countJewels() {

		String jewels = "a", stones = "AAbbbb";

		int count = 0;

		String[] jarray = jewels.split("");
		String[] sarray = stones.split("");
		ArrayList<String> listJewels = new ArrayList<String>();

		for (String s : jarray) {

			listJewels.add(s);

		}

		for (String s : sarray) {

			if (listJewels.contains(s)) {

				count = count + 1;

			}

		}

		System.out.println(count);
	}
	
	
	//shuffle the string based on given array of same length
	
	public static String restoreString(String s, int[] indices) {
		
		//leetcode
		//4,5,6,7,0,2,1,3
		
		String final_string = "";
		char[] final_array = new char[s.length()];
		
		for (int i = 0;i<indices.length;i++) {
			
			final_array[indices[i]] = s.charAt(i);
			
		}
		
		for (int i =0;i<final_array.length;i++) {
			final_string = final_string + final_array[i];
		}
		
		System.out.println(final_string);
		
		return final_string;
        
		
		
		
    }

	// find all substrings for a given string

	public static void findSubStrings(String s) {

		int n = s.length();

		String[] strarray = new String[n * (n + 1) / 2];

		int temp = 0;

		for (int i = 0; i < n; i++) {

			for (int j = i; j < n; j++) {
				strarray[temp] = s.substring(i, j + 1);
				temp++;

			}

		}

		for (String str : strarray) {
			
			if (countLs(str)) {
				
				System.out.println(str);	
				
			};
			
		}

	}

	// count L and R in any string

	public static boolean countLs(String s) {

		int count_L = 0;
		int count_R = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'L') {
				count_L = count_L + 1;
			}

			else if (s.charAt(i) == 'R') {
				count_R = count_R + 1;
			}

		}
		
		if (count_L == count_R) {
			return true;
		}

		return false;
	}
	
	// input: aaabbcccaa   output: a3b2c3a2
	
	public static void countLetters() {
		
		String input = "aaabbcccab";
		char[] carray = input.toCharArray();
		int len = carray.length;
		int count = 1;
		//0-8
		
		for (int i=0; i<carray.length-2;i++) {
			
			if (carray[i] == carray[i+1]) {
				
				count = count + 1;
				
			}
			
			else if (carray[i] != carray[i+1]) {
				
				System.out.print(carray[i]);
				System.out.print(count);
				count = 1;
			}
			
						
		}
		
		if (carray[len-2] != carray[len-1]) {
			
			
			System.out.print(carray[len-2]);
			System.out.print(count);
			
			System.out.print(carray[len-1]);
			System.out.print(count);
			
			
		}
		
		else {
			System.out.print(carray[len-2]);
			System.out.print(count+1);
			
		}
		
		
		
	}
	
	// merge strings alternately
	//Input: word1 = "abc", word2 = "pqr"
	//Output: "apbqcr"

	public static void mergeStrings(String word1, String word2) {
		
		int word1_len = word1.length();
		int word2_len = word2.length();
		int finalString_len = word1_len>=word2_len ? word2_len : word1_len;
		String finalString="";
		
		for (int i=0; i< finalString_len;i++) {
			
			finalString = finalString + word1.charAt(i) + word2.charAt(i);
			
		}
		
		if (word1_len > finalString_len) {
			finalString = finalString + word1.substring(finalString_len);
		}
		
		if (word2_len > finalString_len) {
			finalString = finalString + word2.substring(finalString_len);
		}
		
		System.out.println(finalString);
	}
	
	// sort the person as per height
	//input: names = ["Mary","John","Emma"], heights = [180,165,170]
	//output: ["Mary","Emma","John"]
	
	
	public static void sortPerson(String[] names, String[] heights) {
		
		HashMap<String, String> heightMap = new HashMap<String, String>();
				
		
		for (int i=0; i<names.length; i++) {
			heightMap.put(heights[i], names[i]);
		}
		Collections.sort(Arrays.asList(heights));
		for (int i = heights.length-1; i>=0; i--) {
			System.out.println(heightMap.get(heights[i]) + ": "+heights[i]);	
		}
		
			
		
	}
	
	
	//optimal partition of strings
	
	// @ https://leetcode.com/problems/optimal-partition-of-string/
	
	public static void optimalPartitionsOfStrings() {
		
		
		//String s = "abacaba" ;
		String s = "sssss" ;
		int n = s.length();

		
		HashSet<Character> hset = new HashSet<>();
		int temp = 1;

		for (int i = 0; i < n; i++) {

			if (! hset.add(s.charAt(i))){
				
				temp = temp + 1;
				hset.clear();
				hset.add(s.charAt(i));
				
			}
			
			
		}
		System.out.println(temp);
		
			
		
	}
	
	
	public static void main(String[] args) {
		//findSubStrings("LLLLRRRR");
		
		/*
		 * String s = "abc"; int[] indices = {0,1,2};
		 * 
		 * restoreString(s, indices);
		 */
		
		//String[] names = {"Mary","John","Emma"};
	    //String[] heights = {"180","165","170"};
		//sortPerson(names, heights);
		
		optimalPartitionsOfStrings();

	}

}
