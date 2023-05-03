package string_homework;

/*
    2. Write a java program which remove extra space from both side “ I love java ”
    Expected output: “I love java”
* */
public class Program_2 {
    public static void main(String[] args) {
        String s = "  I love java   ";
        String out = s.trim();
        System.out.println("Orinal String: " + s);
        System.out.println("Without Space String: " + out);
    }

}
