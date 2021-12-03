package week1.day2;

public class Calculator {

	// (a) add(int num1, int num2, int num3), it should return sum of num1+num2+num3
	public int add(int num1, int num2, int num3) {
		// int a= 100, b= 45;
		int sum = num1 + num2 + num3;
		return sum;
	}

	// (b) sub(int num1, int num2), it should return subtraction of of num1-num2
	public int sub(int num1, int num2) {

		int sub = num1-num2;
		return sub;
	}

	// (c) mul(double num1, double num2), it should return product of num1 * num2
	public double mul(double num1, double num2) {

		double mul = num1*num2;
		return mul;
	}

	// (d) divide(float num1, float num2), it should return division of num1 / num2
	public double div(float num1, float num2) {

		double div = num1/num2;
		return div;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int result = cal.add(100, 45, 75);
		System.out.println("add result:"+ result);

	}

}
