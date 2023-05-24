package StringPrograms;

public class StringProg2 {

	// find all subsets of the program

	public static void findSubsets(String s) {

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
			System.out.println(str);
		}

	}

	// check if string is palindrome

	public static void isStringPalidrome(String s) {

		String reverString = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverString = reverString + s.charAt(i);

		}
		System.out.println(reverString);

		if (s.equalsIgnoreCase(reverString)) {
			System.out.println("String is palidrome");
		}

	}

	public static void main(String arg[]) {

		isStringPalidrome("FUN");

	}

}
