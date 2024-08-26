package programming;

import java.util.List;

public class FP01Structure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersinListStructured(List.of(12,9,13,4,6,2,4,12,15));
		System.out.println("even numbers");
		printAllEvemNumbersinListStructured(List.of(12,9,13,4,6,2,4,12,15));
	}

	private static void printAllNumbersinListStructured(List<Integer> numbers) {
		for(int number : numbers)
		{
			System.out.println(number);
		}
		
	}
	private static void printAllEvemNumbersinListStructured(List<Integer> numbers) {
		for(int number : numbers)
		{
			if(number % 2 != 0)
			{				
				System.out.println(number);
			}
			
		}
		
	}

}
