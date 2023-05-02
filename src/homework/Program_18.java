package homework;

/*
*
    18. Write a Java Program using below steps.
        18.1 Declare your council name as static variables.
        18.2 Declare your house number as instance variables.
        18.3 Declare one instance method name borough() and call Static variable
        18.4 Declare static method name address() and call instance variable
        18.5 Call both user defined methods into main method.
* */
public class Program_18 {

    // 18.1 Declare your council name as static variables.
    static String council_name = "Croydon Council";

    // 18.2 Declare your house number as instance variables.
    int house_number = 23;

    // 18.3 Declare one instance method name borough() and call Static variable
    public void borough(){
        System.out.println("Council Name: "+council_name);
    }

    // 18.4 Declare static method name address() and call instance variable
    public static void address(){
        Program_18 p1 = new Program_18();
        System.out.println("My House number is: "+p1.house_number);
    }

    // 18.5 Call both user defined methods into main method.
    public static void main(String[] args) {
        Program_18 p2 = new Program_18();
        p2.borough();
        address();
    }
}
