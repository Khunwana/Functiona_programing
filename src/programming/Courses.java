package programming;

import java.util.List;

public class Courses {
	public static void main(String[] args) {
		// ex1
		printAllCoursesindividually(List.of("Spring","Spring boot","API","AWS","PCP","AZURE","DOCKER") ); //printing indidual string using for loop
		//ex2
		printAllCoursesindividuallyFunctional(List.of("Spring","Spring boot","API","AWS","PCP","AZURE","DOCKER") ); //printing indidual string using functiona programming
		//ex3
		printAllCoursesWithSpringindividuallyFunctional(List.of("Spring","Spring boot","API","AWS","PCP","AZURE","DOCKER") ); //using functional programming for String with Spring
		//ex4
		printAllCoursesWithAtleast4LettersindividuallyFunctional(List.of("Spring","Spring boot","API","AWS","PCP","AZURE","DOCKER") ); // using functional programming for String with more than 4 characters
		//ex5
		prinNumbeOfCharInString(List.of("Spring","Spring boot","API","AWS","PCP","AZURE","DOCKER") ); //length of String using functional programming
		
	
	}

	private static void printAllCoursesindividually(List<String> courses) {
		for (String course : courses )		
		{
			System.out.println(course);
		}
	}	
	
	private static void printAllCoursesindividuallyFunctional(List<String> courses) {
		courses.stream()
				.forEach(Courses::printCourses);
	}	

	private static void printAllCoursesWithSpringindividuallyFunctional(List<String> courses) {
		courses.stream()
				.filter(course -> course.contains("Spring"))
				.forEach(Courses::printCourses);
	}	

	private static void printAllCoursesWithAtleast4LettersindividuallyFunctional(List<String> courses) {
		courses.stream()
				.filter(course -> course.length() > 4)
				.forEach(Courses::printCourses);
	}
	private static void prinNumbeOfCharInString(List<String> courses) {
		courses.stream()	
				.filter(course -> course.length() > 4)
				.filter(course -> course.contentEquals("Spring"))
				.map(course -> course.length())
				.forEach(System.out::println);
	}	
	
	
	private static void printCourses(String courses)
	{
		System.out.println(courses);
	}
}
