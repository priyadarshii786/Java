/*------28/01/2023------*/
package com.company;//jai ganesh
import java.util.Scanner;
public class Tuf_5_String_1_Question {

    /*------write a java program which asks the user to enter his name and greets him with "Hello <name> have a good day"------*/
    public static void main(String[] args) {

        System.out.println("What is your name");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();/*------here we are basically taking a string as an input------*/
        /*------the name must not contain any space in between------*/
        /*------Use   String name = sc.nextLine();  to print the whole sentence containing spaces in between them------*/

        System.out.println("Hello "+ name +" have a good day");  /*------here we are combining two strings with third input string------*/

    }
}
