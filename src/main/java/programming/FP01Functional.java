package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
     public static void main(String[] args){
         List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

         printAListOFNumbersFunctional(numbers);
     }

    private static void printAListOFNumbersFunctional(List<Integer> numbers) {

         numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
    }

    private static boolean isEven(Integer integer) {
         return integer%2==0;
    }
    }

    /*private static void printNumber(Integer integer) {
         System.out.println(integer);
    }
}*/
