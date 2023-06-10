package com.company;
import java.util.Scanner;
public class Tuf_5_String_3 {
    public static void main(String[] args) {
        String name = new String("Tathagat");
        System.out.println(name);
        /*------In java, String is a class. Java ka andar string koi primitive data type (or,simply data type) nahi hota hai like in C++, but we can still use string as a data type------
            java.lang.String class is used to create a String object.
            The string is a class but can be used as a data type.*/

        /*------jaise scanner object me "new" keyword ka use krke naya scanner object bana skte hai, waise hi string me "new" keyword ka use krke naya ek naya string bana skta hu------*/

    /*------first method to print a string----------

        String name = new String("Tathagat");
        System.out.println(name);

    -------second method to print a string-------
    here in this case we will use string as a data type.

        String name = "Tathagat";
        System.out.println(name); 



       -------------- We can use the following ways to print in Java: --------------

System.out.print() // No newline at the end
System.out.println() // Prints a new line at the end
System.out.printf()
System.out.format()

int a = 6;
float b = 564f;
system.out.printf("The value of a is %d and value of b is %f", a, b);
system.out.format("The value of a is %d and value of b is %f", a, b);

--------------------both works same------------------


  %d for int
  %f for float
  %c for char
  %s for string


String str1 = new String("Keep coding");
String str2 = new String("Keep coding");
System.out.println(str1 == str2);
Output :
False

Although the value of both the string object is the same, still false is displayed as output because str1 and str2 are two different string objects created in the heap. That's why it is not considered a good practice two compare two strings using the == operator. Always use the equals() method to compare two strings in Java.

*/
        Scanner sc = new Scanner(System.in);
    }
}
