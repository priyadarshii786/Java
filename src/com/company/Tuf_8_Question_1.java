package com.company;
import java.util.Scanner;

public class Tuf_8_Question_1 {
    public static void main(String[] args) {
        //jai ganesh
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of first subject: ");
        m1 = sc.nextInt();

        System.out.println("Enter the marks of second subject: ");
        m2 = sc.nextInt();

        System.out.println("Enter the marks of third subject: ");
        m3 = sc.nextInt();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println("Your Overall percentage is : " + avg);

        if(m1>=33 && m2>=33 && m3>=33 && avg>=40)
        {
            System.out.println("Congratulations!! You have Qualified");
        }
        else {
            System.out.println("Sorrry!! You have not Qualified");
        }
    }
}
