package com.company;
import java.util.Scanner;

public class Tuf_6_Conditionals_1 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter the Age : ");

        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>=56)
        {
            System.out.println("You're experienced");
        }
        else if(age>=46)
        {
            System.out.println("You need experience");
        }
        else
        {
            System.out.println("You're beginner");
        }
    }
}
