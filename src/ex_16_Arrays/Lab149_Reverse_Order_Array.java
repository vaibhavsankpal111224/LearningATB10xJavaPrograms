package ex_16_Arrays;

import java.util.Arrays;

public class Lab149_Reverse_Order_Array {
    public static void main(String[] args) {


        int[] numbers = {12, 42, 33, 74, 15};
        Arrays.sort(numbers);
        System.out.println("Sorted Array :" +Arrays.toString(numbers));
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(" "+numbers[i]);
        }
    }
}