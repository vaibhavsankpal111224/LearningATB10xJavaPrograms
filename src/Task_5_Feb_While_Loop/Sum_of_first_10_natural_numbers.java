package Task_5_Feb_While_Loop;

public class Sum_of_first_10_natural_numbers {
    public static void main(String[] args) {
        int sum=0;
        int i =1;
        System.out.print("First 10 natural numbers are :");
        while(i<=10)
        {

            System.out.print(" " +i);
            sum = sum +i;
            i++;
        }
        System.out.println();
        System.out.println("The Sum of First 10 natural number is : "+sum);
    }
}
