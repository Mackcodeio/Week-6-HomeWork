package homework;
/*
    14. Write a Java program to print the sum (addition), multiply, subtract, divide and
    remainder of two numbers.

    Test Data:
    Input first number: 125
    Input second number: 24

    Expected Output:
    125 + 24 = 149
    125 - 24 = 101
    125 x 24 = 3000
    125 / 24 = 5
    125 mod 24 = 5

* */

public class Program_14 {
    public static void main(String[] args) {
        int f_number= 125;
        int s_number= 24;

        int add = f_number + s_number;
        int sub = f_number - s_number;
        int mul = f_number * s_number;
        int div = f_number / s_number;
        int mod = f_number % s_number;

        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
    }
}
