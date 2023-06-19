package Intern_Learn;
import java.util.Scanner;
public class Learn_9_Questions_4 {

    public static boolean solution()
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n<=1)
            return false;

        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i == 0)
                return true;
        }

        return true;
    }
    public static void main(String[] args) {
//        jai ganesh

//        To check whether a number is prime or not.

        if(solution())
            System.out.println("is a prime number");

        else
            System.out.println("is a not prime number");

    }
}
