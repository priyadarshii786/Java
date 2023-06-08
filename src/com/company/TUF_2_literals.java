package com.company;
/*----------------------will see about "literals" here---------------------*/
public class TUF_2_literals {  /*------yaha pr hmlogo ka "literals" naam ka class ya java class bn gaya hai."File ka name" and "class ka name" dono "TUF_2_literals" hai, or aisa dono ka same rhna jaruri v hai.------*/

    public static void main(String[] args) {
        /*------isko likhne ka 2 way hai, ek ki psvm likh kr tab press karo, and dusra ki main likh kr tab press karo------*/

        /*------ Primitive data ke 4 type hote hai :- integral(byte,short,int,long - these are types of integral), float or decimal(float, double - these are types of float), char, boolean------*/

        byte age1= 35;
        int age2=36;
        long age3=23333333l; /*---last me "l" laga hai---*/
        /*------byte ka range -128 se 127 hota hai. Agar hme age lena ho toh hm use int me v le skte hai and byte me v le skte hai, ab byte me lene me ek condition hai ki age 127 se jyaada nhi hona chahiye, which is the range of the byte itself------*/

        char ch='A';
        float f1=5.8f;
        /*------yaha java me floating number ke saath last me "f" likhna jaruri hai------*/

        double d1=9.8; /*------yaha double me last me "d" likh v skte hai or nhi v, as yaha java me default double hi hota hai------*/

        boolean a=true;
        short age4=87;

        System.out.println(age1);
        System.out.println(age3);
        System.out.println(ch);
        System.out.println(f1);

        /*------current code run krne ke liye right click krke krna is the good practice, nhi toh upar me dekh lo ki kahi previous code toh run ni ho rha hai n------*/


        /*
        ----------------------------Types of Literals------------------------

        101 - integer literal
        10.1f - float literal
        10.1 - double literal (default type for decimals)
        'A' - character literal
        true - boolean literal
        "chikkuu" - string literal


       */

        String str="chikkuu";
        System.out.println(str);

    }
}
