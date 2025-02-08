package Task_5_Feb_While_Loop;

public class Print_Multiplication_table_of_7 {
    public static void main(String[] args) {
        int i =1;
        int mul;
        while(i<=10)
        {
            mul = 7 * i;
            System.out.printf("7 * %d = "+mul,i);
            System.out.println();
            i++;
        }
    }
}
