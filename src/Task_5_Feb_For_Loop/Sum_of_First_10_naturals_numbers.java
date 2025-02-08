package Task_5_Feb_For_Loop;

public class Sum_of_First_10_naturals_numbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print("First 10 Naturals numbers are :");
        for (int i = 1 ; i <= 10 ; i++)
        {
          sum  = sum + i ;
            System.out.print(" "+i);
                 }
        System.out.println();
        System.out.println("The_Sum_of_First_10_naturals_numbers: "+sum);
    }
}
