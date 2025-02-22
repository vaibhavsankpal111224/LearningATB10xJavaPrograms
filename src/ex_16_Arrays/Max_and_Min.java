package ex_16_Arrays;

import java.util.Arrays;

import static ex_16_Arrays.Lab148_Arrays_Max_Value_Interview.give_min;

public class Max_and_Min {
    public static void main(String[] args) {
        int[] test = {22,12,59,14,30,40};
        Arrays.sort(test);
        System.out.println("Sorted Array :" + Arrays.toString(test));
        //int max_output = give_max(test);
        int min_output = give_min(test);
//        int max_output = give_max(array);
//        int min_output = give_min(array);

        //System.out.println("Maximum ->" +max_output);

        System.out.println("Minimum ->" +min_output);
    }
}
