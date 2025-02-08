package ex_03_Literals;

public class Lab029_Literals_P1 {
    public static void main(String[] args) {
        // Literal
        int age = 65;
        age = 66;

        // Constant
        final int girl_age = 18;
        //girl_age = 19;
    }
}
/*
Rules for Declaring Identifiers
1.Must Begin with a Letter, Underscore (_), or Dollar Sign ($)
The first character cannot be a digit.
Valid: _name, $price, age
Invalid: 1value, #name

2.Can Contain Letters, Digits (0-9), Underscore (_), and Dollar Sign ($)
Valid: student123, emp_id, price$
Invalid: emp-id (hyphen - is not allowed)

3.Cannot be a Java Reserved Keyword
Invalid: class, int, static, new
Valid: className, intValue, staticVar

4.Case-Sensitive
age and Age are considered different identifiers.

5.No Spaces Allowed
Valid: userName
Invalid: user name

6.No Special Characters Except (_) and ($)
Valid: _temp, $amount
Invalid: @value, name#1

7.No Length Limit, But Keep it Meaningful
Java allows long names, but best practice is to use meaningful and concise names.
*/
