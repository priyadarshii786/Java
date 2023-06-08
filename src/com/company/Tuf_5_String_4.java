package com.company;
import java.util.Scanner;

public class Tuf_5_String_4 {
    public static void main(String[] args) {
//        string methods operate on java strings. They can be used to find length of the string, convert to lowercase, etc.
//        name.length() ------- returns length of string name.
        String name = "Priyadarshi";
        int value = name.length();
        System.out.println(value);

//        name.tolowerCase() ------- returns a new string whch has all the lowercase characters from the string name.
        String lstring = name.toLowerCase();
        System.out.println(lstring);

//        name.tolowerCase() ------- returns a new string whch has all the uppercase characters from the string name.

//        name.trim() ------- returns a new string after removing all the leading and trailing spaces from the original string.
        String nonTrimmedString = "    priyadarshi   ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

//        name.substring(int start) or name.substring(2) ------- returns a substring from start to the end (note that index starts from 0) or from index 2 to the end.

//         name.substring(int start, int end) or name.substring(2,5) ------- this returns a substring from start index to the end index. start index is included and end index is excluded.

//        name.replace('r','p') ------- returns a new string after replacing 'r' with 'p'.
        String name2 = "priya";
        System.out.println(name2.replace('r','p'));
        System.out.println(name2.replace("riy","ppp"));

//        name.startsWith("Pr") ------- returns true if name starts with string "Pr". that is it returns boolean.
        System.out.println(name.startsWith("Pr"));

//        name.endsWith("Pr")

//        name.charAt(2) ------- returns character at a given index position.
        System.out.println(name.charAt(2));

//        name.indexOf(s) ------- returns the index of the given string. for ex: name.indexOf("ri") returns 1 which is the first occurence of ar in string priyadarshi. It returns the first index only.
        System.out.println(name.indexOf("ri"));

//        modifiedName.indexOf("riy", 3) ------- returns the index of the given string starting from the index '3'
        String modifiedName = "priyriyadarshi";
        System.out.println(modifiedName.indexOf("riy"));

//        name.lastIndexOf("r") ------- returns the last index of the given string.

        System.out.println(modifiedName.indexOf("riy",2));
//        name.lastIndexOf("r",2) ------- returns the last index of the given string before index 2.

//        name.equals("priyadarshi") ------- returns true if the given string is equal to priyadarshi. Also it is Case-sensitive.
        System.out.println(modifiedName.equals("priyadarshi"));

//         name.equalsIgnoreCase("priyadarshi") ------- returns true if two strings are equal ignoring the case of characters.

    }
}

// Escape sequence characters ------- \n, \t, \' etc
