package string_homework;

/*
    1. Write a Java program print your full name on screen and then print your
       surname on a separate line.
* */
public class Program_1 {
    public static void main(String[] args) {
        String full_name = "Patel Sneh Kanjibhai";
        String surname = full_name.substring(0, 5);

        System.out.println("Full Name: " + full_name);
        System.out.println("Surname: " + surname);
    }
}
