package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Structured {
     public static void main(String[] args){
         printAListOFNumbersStructured(Arrays.asList(2,4,6,8,12,14,4,8,15,2));
     }

    private static void printAListOFNumbersStructured(List<Integer> numbers) {

         for(int number:numbers){
             System.out.println(number);
         }
    }
}
