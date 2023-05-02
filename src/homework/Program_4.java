package homework;

/*
    4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.
* */
public class Program_4 {

    //  4.1 Declare two instance and two static variables.
    int a=10, b= 20;
    static int c=30, d= 40;

    // 4.2 Declare one instance method.
    // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public void instance_method(){
        System.out.println("----------------- Instance Method Start ---------------");
        System.out.println("Value of Instance Variable A: "+a);
        System.out.println("Value of Instance Variable B: "+b);
        System.out.println("Value of Static Variable C: "+c);
        System.out.println("Value of Static Variable D: "+d);

    }

    // 4.3 Declare one static method.
    // // 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
    public static void static_methode(){
        System.out.println("----------------- Static Method Start ---------------");

        // Object Creation for use Instance Variable inside static method.
        Program_4 p1 = new Program_4();
        System.out.println("Value of Instance Variable A: "+p1.a);
        System.out.println("Value of Instance Variable B: "+p1.b);
        System.out.println("Value of Static Variable C: "+c);
        System.out.println("Value of Static Variable D: "+d);
    }

    // 4.5 Declare the Main method.
    public static void main(String[] args) {

        // 4.6 Call both instance and static methods into the Main method and run the programme.

        Program_4 p2 = new Program_4();
        p2.instance_method();
        static_methode();
    }
}
