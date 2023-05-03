package string_homework;

/*
    3. Write a java program which replace a “I love java” to “we love java”
    Expected output: We love java
* */
public class Program_3 {

    public static void main(String[] args) {
        String s = "I love java";
        String s1 = s.replace(s, "We love Java");
        System.out.println("Original String: "+s);
        System.out.println("After Replce: "+s1);
    }

}
