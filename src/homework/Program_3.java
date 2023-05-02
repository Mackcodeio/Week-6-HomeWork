package homework;

/*
    3. Write a Java programme using the following steps.
        3.1 Declare one instance and one static variable.
        3.2 Declare one instance method.
        3.3 Declare one static method.
        3.4 Call both instance and static variables into both instance and static methods inside the
        print statement.
        3.5 Declare the Main method.
        3.6 Call both instance and static methods into the Main method and run the programme.
* */

public class Program_3 {

    // 3.1 Declare one instance and one static variable.
    int a = 20;
    static int b = 30;

    // 3.2 Declare one instance method.
    public void instance_m1(){
        System.out.println("------------------ Start Instance Method  ---------------");
        System.out.println("Value of Instance Variable A: "+a);
        System.out.println("Value of Static Variable B: "+b);
    }

    // 3.3 Declare one static method.
    // 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void static_m2(){
        Program_3 p1 = new Program_3();
        System.out.println("------------------ Start Static Method -----------------");
        System.out.println("Value of Instance Variable A: "+p1.a);
        System.out.println("Value of Static Variable B: "+b);
    }

    // 3.5 Declare the Main method.
    // 3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program_3 p3 = new Program_3();
        p3.instance_m1();

        static_m2();
    }
}
