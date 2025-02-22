package ex_16_Arrays;

import java.util.Arrays;

public class Lab148_Arrays_Max_Value_Interview {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // MAX, MIN

        // Logic Building
        // 1 ->  inputs - array -> int
        // output ->  int - 77
        int max_output = give_max(array);
        int min_output = give_min(array);
        Arrays.sort(array);
        System.out.println("Sorted Array :" +Arrays.toString(array));
        System.out.println("Maximum -> " +max_output);
        System.out.println("Minimum -> " +min_output);




    }

    static int give_max(int[] array){
        // Logic
        int max = array[0]; //25
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    static int give_min(int[] array){
        // Logic
        int min = array[0]; //25
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }

        return min;
    }


}