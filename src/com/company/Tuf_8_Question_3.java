package com.company;
import java.util.Scanner;
public class Tuf_8_Question_3 {
    public static void main(String[] args) {
        //jai ganesh

        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".org"))
        {
            System.out.println("This is an Organizational website");
        }
        else if(website.endsWith(".com"))
        {
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("This is an Indian website");
        }
    }
}
