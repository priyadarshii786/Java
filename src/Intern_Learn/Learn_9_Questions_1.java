package Intern_Learn;
import java.util.Scanner;

public class Learn_9_Questions_1 {
    //jai ganesh

//    Find the average of n user defined numbers.
//    Sample input - 5
//    Enter those numbers - 1,1,1,1,1
//    Output : sum = 5
//           : average = 1
    public static void main(String[] args) {
        int num, sum=0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=0;i<num;i++)
        {
            sum+=sc.nextInt();
        }
        System.out.println(sum/num);
    }
}
