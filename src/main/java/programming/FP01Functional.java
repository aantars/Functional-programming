package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        // printAListOFNumbersFunctional(numbers);

//        printAListOFSquaredNumbersFunctional(numbers);
//        printAListOfCubeNumbersFunctional(numbers);

        List<String> courses = Arrays.asList("Spring", "Spring boot", "API", "microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printCharacterAmountOfEachCourse(courses);

       // printListOfCoursesFunctional(courses);
        // printOnlySpringCourses(courses);
        // printCoursesWithDefinedLength(courses);
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

    private static void printAListOFNumbersFunctional(List<Integer> numbers) {

        numbers.stream().filter(integer -> integer % 3 == 0).forEach(System.out :: println);
    }

    private static void printAListOFSquaredNumbersFunctional(List<Integer> numbers) {

        numbers.stream().map(number -> number * number).forEach(System.out :: println);
    }

// print cubes of odd numbers
    private static void printAListOfCubeNumbersFunctional(List<Integer> numbers){
        numbers.stream().filter(number -> number %2 !=0).map(number -> Math.round(Math.pow(number,3))).forEach(System.out::println);
       }
    // print the number of characters in eachy course name

        private static void printCharacterAmountOfEachCourse(List<String> courses){
            courses.stream().map(course -> course.length()).forEach(System.out::println);
        }

}

    /*
    private static boolean isEven(Integer integer) {
         return integer%2==0;
    }*/

    /*private static void printNumber(Integer integer) {
         System.out.println(integer);
    }
}*/
