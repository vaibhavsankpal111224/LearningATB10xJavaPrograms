package ex_15_Strings_Functions;

public class Lab143_StringBuffer_StringBuilder {
    public static void main(String[] args) {




        StringBuffer stringBuffer = new StringBuffer("Vaibhav");
        stringBuffer.append("Sankpal");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("Vaibhav");
        stringBuilder.append("Sankkkkpal");
        System.out.println(stringBuilder);

        stringBuilder.append(" World!"); // Modifies sb to "Hello World!"
        System.out.println(stringBuilder); // Output: Hello World!


        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);

    }
}




// String - > 90%
// StringBuilder -> 5-7% (Thread safty - we avoid it)
// ThreadLocal -> Multi Threading ->