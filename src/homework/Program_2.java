package homework;

/*

    2. Write a Java programme using the following steps.
        2.1 Declare two static variables.
        2.2 Declare one static method.
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and run the programme.
* */

public class Program_2 {

    // 2.1 Declare two static variables.
    static int a = 10;
    static int b = 20;

    // 2.2 Declare one static method.
    // 2.3 Call both static variables into the static method inside the print statement.
    public static void test(){
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
    }

    // 2.4 Declare the Main method.
    // 2.5 Call the static method into the Main method and run the programme.
    public static void main(String[] args) {
        test();
    }
}
