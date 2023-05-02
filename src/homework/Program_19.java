package homework;

/*
    19. Write a Java Program using below steps.
        19.1 Declare one of your group member names as instance variable.
        19.2 Declare one of your group member names as static variable.
        19.3 Declare one instance method name with group name (e.g. selenium())and call both global
        variables.
        19.4 Declare static method name agile() and call both variable
        19.5 Call both user defined methods into main method.

        Note: Declare 1 local variables in all user defined method and main method and print in to statement.
* */
public class Program_19 {

    // 19.1 Declare one of your group member names as instance variable.
    String member1 = "Sneh Patel";

    // 19.2 Declare one of your group member names as static variable.
    static String member2 = "Ketan Patel";

    // 19.3 Declare one instance method name with group name (e.g. selenium())and call both global variables.
    public void selenium(){
        System.out.println("----------------- Instance selenium() Method Start ----------------");
        System.out.println("Instance member: "+member1);
        System.out.println("Static member: "+member2);

        String group_name1 = "selenium";
        System.out.println("Selenium Method local variable Group name: "+group_name1);

    }

    //
    public static void agile(){

        System.out.println("----------------- Static agile() Method Start ---------------------");
        Program_19 p1 = new Program_19();
        System.out.println("Instance member: "+p1.member1);
        System.out.println("Static member: "+member2);

        String group_name2 = "Agile";
        System.out.println("Agile Method local variable Group name: "+group_name2);

    }
    public static void main(String[] args) {
        String course_name = "Software Testing";
        System.out.println("Print Main Method Local Variable: "+course_name);
        Program_19 p2 = new Program_19();
        p2.selenium();
        agile();
    }
}
