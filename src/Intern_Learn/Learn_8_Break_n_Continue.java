package Intern_Learn;

public class Learn_8_Break_n_Continue {
    public static void main(String[] args) {
        for(int i=1; i<=10; i++)
        {
            if(i==4)
            {
                continue; //yaha pr continue statement lgane pr 4 ko chhodkar 1 to 10 ko print kr diya. Lekin yahi agar yaha break statement rhta toh sirf 1 to 4 tk hi print hota and then iterator loop ke baahar aa jaata. It's the key difference between them.
            }
            System.out.println(i);

            if(i==7)
            {
                break;
            }
        }

    }
}
