package ex_02_JavaBasics;

public class Lab024_printF {
    public static void main(String[] args) {
/*
      int a = 10;
        System.out.printf("Your variable name is  %d",a);
        %d -> int, byte, long, short - data,
         %s -> String,
        %f -> float,
       %b -> boolean

       byte b = 10;
      System.out.println();
      System.out.printf("%d",b);

 */
        int num = 42;
        float pi = 3.14159f;
        char letter = 'A';
        String str = "Hello, World!";

        System.out.printf("Integer: %d\n", num);                // Integer,byte, long, short - data
        System.out.printf("Floating-point: %.1f\n", pi);        // Floating-point with precision
        System.out.printf("Character: %c\n", letter);           // Character
        System.out.printf("String: %s\n", str);                  // String
        System.out.printf("Hexadecimal: %x\n", num);            // Hexadecimal
        System.out.printf("Octal: %o\n", num);                   // Octal
        System.out.printf("Percentage: 90%%\n");



    }
}