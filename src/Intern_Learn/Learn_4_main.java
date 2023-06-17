package Intern_Learn;
/*---------------------4th Lect is important to understand these basic concepts of class and object------------------*/


import com.sun.tools.javac.Main;

public class Learn_4_main {
//    Insight: class ka koi v element bina uske object ke accessible nahi hota hai.
    int num =10; //these are the example of the instance variable.
    static String name = "Chikku"; //for this we want to demonstrate that ki static rhne pr object bnane ki jarurat nhi hoti hai. see there where we are printing this. Note that ki upar int jo tha vo static nahi tha, toh usko print krwane ke liye object bnana pda tha. And also ki static ka ye funda within the class hi hai.
    public void display(){ //here making another method.
//        public static void display(){  <-------- yaha pr agar hmlog display() method ko static rkhte then there would be no need of making object of the display() method "within the class" and we could have simply written mere display() instead of obj_1.display(); in the last. <------- Important concept
        System.out.println("Levitating by Dua Lipa");
    }
//    now we have to make the object of Learn_4_main, as display ko Learn_4_main ke andar define kiya hai, hence we havve to make object of this class as well as then only display ka element accessible hoga. And usko psvm ke andar hi banaege ie; object will be made inside the psvm.







    public static void main(String[] args) {

        int i = 10;
        char c = 'A'; //these are the example of Local variable.


//        kisi v class ka object aise banta hai. See below.
        Learn_4_main_first_class obj = new Learn_4_main_first_class(); //Learn_4_main_first_class ka object bana rahe hai here.
//        show method ko access krne ke liye ek object mil gaya whose name is obj.
//        you can refer obj here as object, reference, or instance.
//        but the main thing here is to create the object which is being done by those two keywords written after the '=' sign (ie; new keyword and the constructor)..
//        Insight: constructor ka name same hota hai exactly class ke name se and constructor ka kaam hota hai initialise.
        obj.show();
        obj.hello();







//        kisi v class ka object aise banta hai. see below
        Learn_4_main obj_1 = new Learn_4_main(); //Learn_4_main ka object bana rhe hai so that hmlog display ke elements ko access kr paaye, as it is imperative to make object of the class jiska element access krna chahte hai and display method is inside the Learn_4_main class. Iske just upar "Learn_4_main_first_class" ka object bnaaye the na ki "Learn_4_main" ka, so don't get confused. Yaha do chiz ko handle kr rhe hai.....ek to yhi pr Main ke andar hai ie; display and another one Learn-4_main_first_class me hai.
        obj_1.display();

        System.out.println(obj_1.num);
        System.out.println(name);//yaha pr object bnane ka koi need nhi tha as ye string static tha. And also ki static ka ye funda within the class hi hai.
    }
}



/*
*  ----------------------Variables in Java---------------------
* 1. Local variable - declared inside any method (see program for clarity)
* 2. Instance Variable - declared inside any class but outside any method (see program for clarity)
* 3. Static Variable - If you create any "method" or "variable" as static then you do not require any object to access it within the class.                         (abhi thoda der pahle hi iss concept ka use kiye hai upar me)
*                    - your variable can hold your previous value. vo hmesa reset nahi hoga
*                    - Also a static variable cannot be a local variable.(let this sink in!!!)
* */


