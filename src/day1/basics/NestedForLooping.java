package day1.basics;

public class NestedForLooping {

	public static void main(String[] args) {
		int beg=200;
		int end=210;

		for (int i = beg; i <= end; i++) {
			for (int j = 10; j >= 5; j--) {
				System.out.println(i + "*" + j + "= " + i * j);
			}
			System.out.println();

		}
	}

}
