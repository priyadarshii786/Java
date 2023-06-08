package com.company;
import java.util.Scanner;

public class Tuf_5_String_5_Practice_3 {
    public static void main(String[] args) {
//        -------------- write a java program to fill in a letter template --------------
        String text = "Hi!! <|name|>";
        text = text.replace("<|name|>","Priyadarshi");

        System.out.println(text);
    }

}
