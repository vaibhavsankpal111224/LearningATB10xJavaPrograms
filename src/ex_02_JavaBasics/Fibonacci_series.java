package ex_02_JavaBasics;

import java.sql.SQLOutput;

public class Fibonacci_series {
    public static void main(String[] args) {
        int a=0,b=1,c,d=10;
        System.out.print(" "+a); // Print 0
        System.out.print(" "+b); // Print 1
        for(int i=2 ; i<d ; i++)
        {
            c= a+b;
            System.out.print(" " +c);

            a=b;
            b=c;

        }

    }
}
