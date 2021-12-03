package week1.day2;

public class Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss"; 
		
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1== length2) {
			
			System.out.println("Both text lengths are equal:" + length2);
			
			char[] char1 = new char[text1.length()];
			char[] char2 = new char[text2.length()];
			System.out.println(char2);
		}
		
	}

}

