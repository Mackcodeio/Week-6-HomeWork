package string_homework;

/*
     6. Write a java program which replace a “I@love@java” to “we love java”
    Expected output: We love java
* */
public class Program_6 {

    public static void main(String[] args) {
        String s1 = "I@love@java";
        String output = s1.replace("@", " ");
        System.out.println(output);
    }

}
