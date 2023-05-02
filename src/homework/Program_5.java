package homework;

/*
Program 5
-------------------------------------------------------------------------------------------------
Write a program for a calculator with addition, subtraction, multiplication, and division methods
all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.)
-------------------------------------------------------------------------------------------------

* */

public class Program_5 {

    int a = 10;
    int b = 5;
    static int c = 8;
    static int d = 4;

    public static void main(String[] args) {
        Program_5 obj = new Program_5();

        obj.addition(obj.a, obj.b);
        obj.subtraction(obj.a, obj.b);
        obj.multiplication(c, d);
        obj.division(c,d);
    }

    public void addition(int a,int b){

        System.out.println("Addition:" +(a+b));
    }

    public void subtraction(int a,int b){
        System.out.println("Subtraction: " +(a-b));
    }

    public void multiplication(int a,int b){
        System.out.println("Multiplication: " +(a*b));
    }

    public void division(int a,int b){
        System.out.println("Division: " +(a/b));
    }

}
