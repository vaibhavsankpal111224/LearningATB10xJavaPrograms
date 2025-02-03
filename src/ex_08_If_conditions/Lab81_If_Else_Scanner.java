package ex_08_If_conditions;

import java.util.Scanner;

public class Lab81_If_Else_Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number!");
        int a = sc.nextInt();

        if ( a > 18)
        {
            System.out.println("Allow to caste the vote");

        }
        else
        {
            System.out.println("Not allow to caste the vote");
        }
    }
}
