package com.company; //Group classes

public class TUF_1_Main {  //Entry point into the Java program
    public static void main(String[] args) //this is the main() method of the Java program and every java program must contain main() method.
    {
        System.out.println("Helloooo world!");
        int num1 = 5, num2 = 6, num3 = 7;
        System.out.println(num1 + num2 + num3);
    }
}

//recall the concept of plumber and household repair to understand the concept of Function and class.-----------ie; household repair naam ke class me hmlog plumber, electrician, painter naam ke function(method) ko store ya fir group krwaate hai iss class ka object bana kr.

// class ek template hoti hai jisse object bnti hai. for example if you have the template form jiske andar name, address, and age likha hai then agar ek baar uss form ko bhar krke entity bna di toh uska object ho jaayega

// you are required to make the object of the class in order to run it.

/* ----------------------------public class main---------------------
-----------In Java, every program must contain a class.
-------------The "filename" and "name of the class" should be the same.
-------------Here, we've created a class named "Main".
-------------It is the entry point to the application.*/

//ln in print statement changes the line. If we do not write ln with print then line will not get changed automatically in the output.

//yaha iss case me hmlogo ne koi function nhi bnaya hai or aisa iss liye possible hua because we have used a "static" keyword.

// "void main" me jo void hai vo hme ye bta rha hai ki ye function call hone ke baad koi bhi value return nhi deta hai.

// "public" here is the access modifier mtlb ye jo class ka method hai isko kahi se v access kr skte hai.

// "static" makes it possible for us to run these "functions" without creating any "object" of the class. And it is known to us the in order to run a class we are required to make object of that class.

// agar if we want a function to be independent( or uska class ke object se koi mtlb na rhe ya fir kisi fulnction ko uske class ke object se dissociate kr du and at the same time class ke andar ke reside kr paaye) then mai usko "static" method bana dunga so agar mai kisi v function ko kisi class ke object se dissociate kr du, yaani uska class ke object se mtlb na rhe or vo ek independent function ki tarah istemal ho paaye and at the same time class ke andar reside kr paaye toh mai usko simply "static" method bna dunga

// "public class Main" me Main hai jo class ka name hai and isko capital letter se likhe hai, but "void main" me jo function ka naam "main" hai usko small letter se likhe hai

  /* -----------------Naming convention----------------
  ------for class we use Pascal convention
  ie; we have to write the name of the class like this - PascalConvention ie; first letter of every word will be in uppercase

  ------for functions we use camelCaseConvention
  ie; the first letter of the first word will be in lowercase and thenafter first letter of next words will be in uppercase. like this - camelCaseConvention

  "classes ko group krne ke liye" ya similar tarah ke code ko group krne ke liye, ek parent package use hota hai java me, jo ki most of the time company ke naam se associate kiya jaata hai, taaki ek company ke liye jo aapne code likha hai uska naam aaplog wha pr likh do. This is optional for us

  -----------------------Anatomy of a JAVA program----------------------

  ------documentation section - it is suggested. it can be set of comments

  ------package statement - yaha batana hota hai ki java ka class kiss package se belong kr rha hai. Hmlog package me apni classes ko group kr skte hai. Or here you have to tell that, your class of java belongs to which package. we can group classes in the package. ----It is optional

  ------import statements - we can use scanner class by importing it, you can take any inputs from any user through keyboard. Again it is also optional

  ------interface statements - these are also optional and will talk about them later.

  ------class definitions - let say, you have written the "employee class", "programmer class", then iss tarah ke classes ko hmlog apne java program me add kr skte hai. Again these are optional too

  -------Main Method Class
         {
              Main Method definition
         }
  main method ki class or can say,(class of main method) jiske andar main method ki definition hoti hai. And these are not optional blki these are essential. Like "public static void main" method hmne likha tha, toh ye method java program ka entry method hota hai and yahi se java program ka execution start hota hai

  ----------------------------Data types-------------------------
  ------primitive data type - int, byte, long, float, double, char, bool, short
  ------non-primitive data type - these are derived from primitive data type. Will read later.

  "static", "void" are example of reserved keyewords/keywords

--------------------IF NEEDED NOW SEE THE NOTES PROVIDED-----------

  */