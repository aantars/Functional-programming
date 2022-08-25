package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Functional {
     public static void main(String[] args){
         printAListOFNumbersFunctional(Arrays.asList(2,4,6,8,12,14,4,8,15,2));
     }

    private static void printAListOFNumbersFunctional(List<Integer> numbers) {

         numbers.stream().forEach(FP01Functional::printNumber);
    }

    private static void printNumber(Integer integer) {
         System.out.println(integer);
    }
}
