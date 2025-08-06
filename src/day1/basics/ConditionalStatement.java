package day1.basics;

public class ConditionalStatement {
	public static void main(String[] args) {
		int x = 21;
		float y = 21.5f;
		int a = 10;
		int b = 11;

		if (x >= y) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (!(a > b) || (a == b)) {
			System.out.println("Condition is TRUE");
		} else

		{
			System.out.println("Condition is FALSE");
		}
	}
}
