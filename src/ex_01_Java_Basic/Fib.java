package ex_01_Java_Basic;

public class Fib {
    public static void main(String[] args) {
        int c;

        String d = args[0]; // Assign Value by CLI
        int a = Integer.parseInt(d); // Convert String value into int

        String e = args[1]; // Assign Value by CLI
        int b = Integer.parseInt(e); // Convert String value into int


        System.out.print(" "+a);
        System.out.print(" "+b);
        for(int i=2;i<=10;i++)
        {
            c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;

        }




    }
}
