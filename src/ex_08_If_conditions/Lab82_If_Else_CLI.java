package ex_08_If_conditions;

public class Lab82_If_Else_CLI {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);

        System.out.println("Age is = " +a);

        if (a > 18)
        {
            System.out.println("Allow to take driver lience");

        }
        else
        {
            System.out.println("Not allow to take driver lience");
        }
    }
}
