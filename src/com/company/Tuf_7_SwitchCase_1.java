package com.company;
import java.util.Scanner;
public class Tuf_7_SwitchCase_1 {
    public static void main(String[] args) {

        int age;
        System.out.println("Enter your age :");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age)
        {
            case 18:
                System.out.println("You're going to be an adult!!");
                break;

            case 23:
                System.out.println("You're going to join a job!!");
                break;

            case 60:
                System.out.println("You're going to get retired!!");

            default:
                System.out.println("Enjoy your life!!");
        }

        System.out.println("This is just for the demonstration of break statement"); // ie; after coming out from the loop ie; after encountering break statement.
    }
}
