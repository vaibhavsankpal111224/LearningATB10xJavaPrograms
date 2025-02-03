package ex_02_JavaBasics;

public class Fib {
    public static void main(String[] args) {
        int a=0,b=1,c,count=10;
        System.out.print(+a); // printing o an 1
        System.out.print("," +b);
        for(int i=2;i<count;i++) {

            c = a + b;
            System.out.print("," +c);
            a = b;
            b = c;
        }

    }

}




