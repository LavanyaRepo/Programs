package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		
		// ClassName Object = new Constructor();
		Calculator cal = new Calculator();
		
		int result1 = cal.sub(200, 100);
		System.out.println("sub result:"+ result1);
		double result2 = cal.mul(200.00, 100.00);
		System.out.println("mul result:"+ result2);
		double result3 = cal.div(200, 100);
		System.out.println("div result:"+ result3);
	}

}
