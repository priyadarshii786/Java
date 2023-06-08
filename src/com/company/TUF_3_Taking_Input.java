package com.company;
import java.util.Scanner;

import java.util.Scanner; /*-------isse scanner class ko hmne import kr liya hai, abhi ke liye smjho ki koi external code ko import kiya hai hmne. And hence, now we can use "Scanner class"-------*/

/*-----------------------Reading data from the Keyboard-----------------------*/
public class TUF_3_Taking_Input {
    public static void main(String[] args) {
        System.out.println("It works!!");
        System.out.println("Taking input from the user");

        /*------in order to read data from the keyboard, Java has a scanner class------*/
        /*------"scanner class" has a lot of methods to read the data from the keyboard------*/

        Scanner sc = new Scanner(System.in);/*---yaha scanner class ka ek object bnaya, ie; Creating an object named "sc" of the Scanner class. Also we can name anything there at the place of "sc"---*/
        /*------Scanner class of java.util package is used to take input from the user's keyboard. The Scanner class has many methods for taking input from the user depending upon the type of input. To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class. And softhow we can create an object of the scanner class, so by writing sc.nextInt(), sc.nextFloat(), sc.nextLine()  and more like this and calling it------*/



        /*------"system.in" ka mtlb ye hai ki mai keyboard ke through input lena chahta hu------*/
        /*------class/template and object me difference btaya tha examination sheet ka example lekr. see video 5: 7:15 ------ */
        /*------All blank answer-sheets in the hand of invigilator - class/template
          ------submission made by different students by writing different answers in the blank answer-sheet - object ------*/

        System.out.println("Enter number 1");
//        float a = sc.nextFloat();
        int a = sc.nextInt();
        /*------"sc.nextInt()" here is used to take "integer" input from the keyboard and isko likhne se pahle upar me Scanner sc = new Scanner(System.in) likhna jaruri hai, nhi toh fir error show krega as ye sb chiz usi ke andar lie krta hai------*/

        System.out.println("Enter number 2");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);


        /*------here we are using the boolean to check the validation ie; whether the input from the user is integer or not------*/
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        /*------here we will see how to take a string as an input from the user------*/
        String str = sc.next();
        System.out.println(str);
        /*------agar "sc.next()" use krenge to sirf ek hi word print krega, mtlb space ke baad waala words ko ignore kr dega
        To overcome this problem, we use "sc.nextLine()" instead of "sc.next()" when we want to print the whole sentence.------*/

        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
