package homework;

/*
    20. Write a Java Program using below steps.
        20.1 Declare your Spain as static variable.
        20.2 Declare your United Kingdom as instance variable.
        20.3 Declare instance method name homeCountry()and call static variable.
        20.4 Declare static method name holidays() and call instance variable
        20.5 Call both methods in main method.
* */
public class Program_20 {

    // 20.1 Declare your Spain as static variable.
    public static String country_1 = "Spain";

    // 20.2 Declare your United Kingdom as instance variable.
    public String country_2 = "United Kingdom";

    // 20.3 Declare instance method name homeCountry()and call static variable.
    public void homeCountry(){
        System.out.println("Static Variable: "+country_1);
    }

    // 20.4 Declare static method name holidays() and call instance variable
    public static void holidays(){
        Program_20 print = new Program_20();
        System.out.println("Instance Variable: " +print.country_2);
    }

    // 20.5 Call both methods in main method.
    public static void main(String[] args) {
        Program_20 printing = new Program_20();
        printing.homeCountry();
        holidays();
    }
}
