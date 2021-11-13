package GenericsTestMaximum;

import org.junit.Test;

public class FindMaximumNumber {
	@Test
	int maxNumberatFirstPosition() {
		Integer num1 = new Integer(34);
		Integer num2 = new Integer(21);
		Integer num3 = new Integer(13);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1+ " is the maximum number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum number");
		} else {
			System.out.println(num3 + " is the maximum number");
		}
		return num1 ;
	}

	@Test
	int maxNumberatSecondPosition() {
		Integer num1 = new Integer(16);
		Integer num2 = new Integer(69);
		Integer num3 = new Integer(35);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum number");
		} else {
			System.out.println(num3 + " is the maximum number");
		}
		return num2;
	}

	@Test
	int maxNumberatThirdPosition() {
		Integer num1 = new Integer(21);
		Integer num2 = new Integer(37);
		Integer num3 = new Integer(73);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum number");
		} else {
			System.out.println(num3 + " is the maximum number");
		}
		return num3;
	}
	public static void main(String[] args) {
		FindMaximumNumber rv = new FindMaximumNumber();
		rv.maxNumberatFirstPosition();
		rv.maxNumberatSecondPosition();
		rv.maxNumberatThirdPosition();
	}
}


	

