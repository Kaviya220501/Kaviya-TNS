package day4.java;

public class TryCatch {
	public static void main(String[] args) {
		System.out.println("I am in main method");
		int result;
		try {

			result = TryCatchMain.performDivision(0, 5);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");

			result = TryCatchMain.performDivision(12, 3);
			if (result != 0)
				System.out.println("Division is " + result);

			System.out.println("------------------------------");
		} catch (ArithmeticException e) {
			//System.out.println("I am in catch block: " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println(TryCatchMain.performDivision(12f, 5f));

		System.out.println("------------------------------");
		System.out.println(TryCatchMain.performDivision(12f, 0f));

	}
}
