package homework;

/*
    17. Write a Java Program using below steps.
        17.1 Declare your city as instance variables.
        17.2 Declare your country as static variables.
        17.3 Declare one instance method and call static variable in print statement
        17.4 Declare static method and call instance variable in print Statement.
        17.5 Call both user defined methods into main method.
* */
public class Program_17 {

    // 17.1 Declare your city as instance variables.
    String city = "London";

   // 17.2 Declare your country as static variables.
    static String country = "UK";

    // 17.3 Declare one instance method and call static variable in print statement
    public void print_instance_method(){
        System.out.println("Country Name: "+country);
        Program_17 p1 = new Program_17();
    }

    // 17.4 Declare static method and call instance variable in print Statement.
    public static void print_static_method(){
        Program_17 p1 = new Program_17();
        System.out.println("City Name: "+p1.city);
    }

    // 17.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        Program_17 p2 = new Program_17();
        p2.print_instance_method();
        print_static_method();
    }
}
