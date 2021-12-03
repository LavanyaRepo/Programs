package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madam";
		String revStr = "";

		int strlength = str.length();

		for (int i = (strlength - 1); i >= 0; --i) {
			revStr = revStr + str.charAt(i);
		}

			if (str.equals(revStr)) {
				System.out.println("given string is a Palindrome");
			} else
				System.out.println("given string is not a Palindrome");
		}

	}


