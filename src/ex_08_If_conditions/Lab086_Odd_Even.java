package ex_08_If_conditions;

import java.util.Scanner;

public class Lab086_Odd_Even {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();

        if(num%2 == 0)
        {
            System.out.println("The Number "+num+" is Even");

        }
        else {
            System.out.println("The Number "+num+" is Odd");
        }
sc.close();
    }
}
