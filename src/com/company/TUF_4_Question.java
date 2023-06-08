package com.company;
import java.util.Scanner;
public class TUF_4_Question {
    public static void main(String[] args) {

        System.out.println("Enter the number of 5 subjects");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   /*------here we are basically taking an integer as an input------*/
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int avg = (a+b+c+d+e)/5;

        System.out.println(avg);

        /*
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 90 && a <= 100) {
            System.out.println("A");
        }
        else if (a > 80 && a <= 90) {
            System.out.println("B");
        }
        else if (a > 70 && a <= 80) {
            System.out.println("cc");
        }
        else {
            System.out.println("Fail");
        }
        */

    }
}