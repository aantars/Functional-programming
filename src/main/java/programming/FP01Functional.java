package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //printAListOFNumbersFunctional(numbers);

        List<String> courses = Arrays.asList("Spring", "Spring boot", "API", "microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

       // printListOfCoursesFunctional(courses);
        // printOnlySpringCourses(courses);
        printCoursesWithDefinedLength(courses);
    }

    private static void printCoursesWithDefinedLength(List<String> courses) {

        courses.stream().filter(course -> course.length()>4).forEach(System.out::println);
    }

    // print courses individually
    private static void printListOfCoursesFunctional(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }


    // Print courses containing the word "Spring"
    private static void printOnlySpringCourses(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }
    // PRint courses whose name has at least 4 letters

/*    private static void printAListOFNumbersFunctional(List<Integer> numbers) {

        numbers.stream().filter(integer -> integer % 3 == 0).forEach(System.out :: println);
    }*/





}

    /*
    private static boolean isEven(Integer integer) {
         return integer%2==0;
    }*/

    /*private static void printNumber(Integer integer) {
         System.out.println(integer);
    }
}*/
