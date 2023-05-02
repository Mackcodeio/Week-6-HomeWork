package homework;

/*
*1. Write a Java programme using the following steps.
    1.1 Declare two instance variables.
    1.2 Declare one instance method.
    1.3 Call both instance variables into the instance method inside the print statement.
    1.4 Declare the Main method.
    1.5 Call the above instance method into the Main method and run the programme.
*
* */
public class Program_1 {

    //1.1 Declare two instance variables.
    int a = 2;
    int b = 3;

    // 1.2 Declare one instance method.
    // 1.3 Call both instance variables into the instance method inside the print statement.
    public  void test(){
        System.out.println("A value "+a);
        System.out.println("B value "+b);
    }


    // 1.4 Declare the Main method.
    // 1.5 Call the above instance method into the Main method and run the programme.
    public static void main(String[] args) {
        Program_1 p1 = new Program_1();
        p1.test();
    }
}
