package ex_16_Arrays;

public class Lab145 {
    public static void main(String[] args) {
        // 1st way to initialize array
        int[] marks = {1, 2, 3, 4, 5, 6};
        int[] marks1 = {11,12,13,14,15,16,17,18,19,20};
        // 2nd way to initialize array
        int[] marks2 = new int[5]; // Fixed Size.
       int marks3[] = new int[5]; // Fixed Size.
        System.out.println(marks2.length); // .length -> it is defined as property
        String s1 = "Pramod";
        System.out.println(s1.length()); // length() -> This length function used for string

        marks2[0] = 91;
        marks2[1] = 12;
        marks2[2] = 13;
        marks2[3] = 14;
        marks2[4] = 15;


        System.out.println(marks2[0]);
        //System.out.println(marks2[4]);
        //System.out.println(marks2[10]); // ArrayIndexOutOfBoundsException






    }
}