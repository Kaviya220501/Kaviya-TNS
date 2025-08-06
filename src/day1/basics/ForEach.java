package day1.basics;

public class ForEach {
	public static void main(String[] args) {
		int num[]= {101,102,103,104,105};	
				for(int num1:num)
				{
				System.out.println("numbers in for each :"+num1);	
				}
				
				char charr[]= {'Y','a','z','h','a','n'};
				for(char char1:charr)
				{
					System.out.print(char1);		
				}
				
				System.out.println(" ");
				
				String string[]= {"welcome","to","the","world"};
				for(String string1:string)
				{
					System.out.print(string1+" ");		
				}
	}
}
