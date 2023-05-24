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
	
	//

	public static void main(String[] args) {
		//findSubStrings("LLLLRRRR");
		
		String s = "abc";
		int[] indices = {0,1,2};
		
		restoreString(s, indices);
		
		

	}

}
