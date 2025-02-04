package ex_14_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab139_String_Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Password");
        String name = sc.next();

        System.out.println("Enter the Second Password");
        String name1 = sc.next();


        if(name1.equals(name))
        {
            System.out.println("Passwords are matching");

        }
        else
        {
            System.out.println("Passwords not Matching");
        }


    }
}
