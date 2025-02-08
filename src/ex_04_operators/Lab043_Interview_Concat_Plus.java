package ex_04_operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Vaibhav";
        String last_name = "Sankpal";
        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // perform concatenation only
        // VaibhavSankpal1010 - first operator - + performed as Concatenation

        System.out.println(a + b + first_name + last_name);
        // First + math -> 20VaibhavSankpal



        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub

        System.out.println((first_name + last_name) + (a + b));

        System.out.println(first_name +( last_name+ a + b));

    }
}