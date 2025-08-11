package day4.java.interfacee;

public class Functional {
	public static void main(String[] args) {
		
		//Lambda Expression
		Greeding gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session");
		
		gd.greet();

	}
}
