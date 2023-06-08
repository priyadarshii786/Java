package com.company;
import java.util.Scanner;

public class Tuf_5_String_5_Practice_2 {
    public static void main(String[] args) {
//          ----------------- Write a Java Program to replace spaces with underscores. -----------------
        String text = "hello   Chikku";
        text = text.replace(" ","_");
        text = text.toLowerCase(); //this was not asked in the question (optional).

        System.out.println(text);
    }
}
