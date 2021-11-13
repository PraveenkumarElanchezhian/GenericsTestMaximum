package GenericsTestMaximum;
import java.lang.Integer;
import org.junit.Test;

public class FindMaximumNumber {

	public static void main(String[] args) {
		FindMaxIntegerNumber rv = new FindMaxIntegerNumber();
		rv.maxNumberatFirstPosition();
		rv.maxNumberatSecondPosition();
		rv.maxNumberatThirdPosition();
		System.out.println("*************************************");
		FindMaxFloatNumber rv1 = new FindMaxFloatNumber();
		rv1.maxNumberatFirstPosition();
		rv1.maxNumberatSecondPosition();
		rv1.maxNumberatThirdPosition();
	}
}

class FindMaxIntegerNumber {
	@Test
	int maxNumberatFirstPosition() {
		Integer num1 = new Integer(34);
		Integer num2 = new Integer(21);
		Integer num3 = new Integer(13);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum number");
		} else {
			System.out.println(num3 + " is the maximum number");
		}
		return num1;
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
}

class FindMaxFloatNumber {
	@Test
	Float maxNumberatFirstPosition() {
		Float num1 = new Float(3.4f);
		Float num2 = new Float(2.1f);
		Float num3 = new Float(1.3f);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum float number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum float number");
		} else {
			System.out.println(num3 + " is the maximum float number");
		}
		return num1;
	}

	@Test
	Float maxNumberatSecondPosition() {
		Float num1 = new Float(1.6f);
		Float num2 = new Float(6.9f);
		Float num3 = new Float(3.5f);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum float number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum float number");
		} else {
			System.out.println(num3 + " is the maximum float number");
		}
		return num2;
	}

	@Test
	Float maxNumberatThirdPosition() {
		Float num1 = new Float(2.1f);
		Float num2 = new Float(3.7f);
		Float num3 = new Float(7.3f);
		if (num1 >= num3 && num1 >= num3) {
			System.out.println(num1 + " is the maximum float number");
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println(num2 + " is the maximum float number");
		} else {
			System.out.println(num3 + " is the maximum float number");
		}
		return num3;
	}
}
