package string_homework;

/*
    5. Write a java program to concat 2 string.
    Expected output: I love java I dream java
* */
public class Program_5 {
    public static void main(String[] args) {
        String s1 = "I love java,";
        String s2 = " I dream java";
        String concat = s1.concat(s2);
        System.out.println("Two String Concat: " + concat);
    }
}
