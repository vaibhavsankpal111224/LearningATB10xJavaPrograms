package ex_13_Functions;

public class Lab127_User_defined_one {
    public static void main(String[] args) {
        Lab127_User_defined_one obj = new Lab127_User_defined_one();
        obj.greet();
        String s = greet1();
        System.out.println(s);


    }
    // 1.Without Parameters and without return type
     void greet()
    {
        System.out.println("This is function without parameter and without return type");

    }
    // 2.Without Parameters and with return type
    static String greet1()
    {
        return "This is function without parameter and with return type " ;

    }

    // 2.With Parameters and without return type
    static String greet2()
    {
        return "This is function with parameter and without return type " ;

    }
}
