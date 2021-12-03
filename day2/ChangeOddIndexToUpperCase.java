package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		String output= "";
		
		// a) Convert the String to character array
		char[] ch = new char[test.length()];
		
		 for (int i = 0; i < test.length(); i++) {
			 if(i%2 == 1)
	            {
	                output += Character.toUpperCase(test.toCharArray()[i]);
	            }else
	            {
	                output += Character.toLowerCase(test.toCharArray()[i]);
	            }
	        }

	        System.out.println("String Change Odd Index to UpperCase: "+ output);
			
		}
		
	}

	
