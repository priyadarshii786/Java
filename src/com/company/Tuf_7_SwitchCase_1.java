package com.company;
import java.util.Scanner;

import static java.lang.System.*; //this here helped in reducing System.out.println(); to out.println();

public class Tuf_7_SwitchCase_1 {
    public static void main(String[] args) {

        int age;
        out.println("Enter your age :");

        Scanner sc = new Scanner(in);
        age = sc.nextInt();

        switch(age)
        {
            case 18:
//                System.out.println("You're going to be an adult!!");
                out.println("You're going to be an adult!!");
                break;

            case 23:
                out.println("You're going to join a job!!");
                break;

            case 60:
                out.println("You're going to get retired!!");

            default:
                out.println("Enjoy your life!!");
        }

        out.println("This is just for the demonstration of break statement"); // ie; after coming out from the loop ie; after encountering break statement.
    }
}
