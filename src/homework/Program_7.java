package homework;

/*
* 7. Write a program to insert any temperature value in degree Fahrenheit and convert
to degree Celsius ((F − 32) × 5/9 = 0°C).
* */
public class Program_7 {
    public static void main(String[] args) {
        int fahrenheit = 32;
        int Celsius = ((fahrenheit - 32) * 5/9);

        System.out.println(Celsius+"°C");
    }
}
