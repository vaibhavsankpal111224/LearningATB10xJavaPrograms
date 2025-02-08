package ex_03_Literals;

public class Lab094_Interview {
    public static void main(String[] args) {
        char ch = 'A'; // 65
        switch (ch) { // it will take ASCII code value A -> 65
            case 65:
                System.out.println("A");
        }

//        boolean b = true;
//        switch (b) {
//        }

        long a11 = 30l;
        switch ((int) a11) {
        }

        int a = 98;
        switch (a){
            case 98:
                System.out.println("98");
         //case 98:
           //     System.out.println("Double");
        }


    }
}