package com.company;
import java.util.Scanner;
public class Tuf_8_Question_2 {
    public static void main(String[] args) {
        //jai ganesh

        int day;
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        switch (day) {
            //this is the enhanced switch property suggested by the IntelliJ Idea itself.
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
