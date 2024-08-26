package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printAllNumbersinListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		System.out.println("Even numbeers");
		printAllEvenNumbersinListFunctional(List.of(12,9,13,4,6,2,4,12,15));
		
	}
	
	private static void print(int number)
	{
		System.out.println(number);
	}
	private static boolean isEven(int number)
	{
		return number%2==0;
	}

	private static void printAllNumbersinListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			.forEach(FP01Functional::print);
//		for(int number : numbers)
//		{
//			System.out.println(number);
//		}
		
	}
	private static void printAllEvenNumbersinListFunctional(List<Integer> numbers) {
		
		numbers.stream()
//			.filter(FP01Functional::isEven) //filter for even numbers 
			.filter(number -> number % 2 == 0) //using lambda expression for even numbers
			.forEach(FP01Functional::print); //printing numbers
//		for(int number : numbers)
//		{
//			System.out.println(number);
//		}
		
	}

}
