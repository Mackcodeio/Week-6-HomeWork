package homework;

import java.text.DecimalFormat;

/*
 13. Write a Java program to print the area and perimeter of a rectangle.
        Test Data:
            Width = 5.5 Height = 8.5

        Expected Output:
            Area is 5.6 * 8.5 = 47.60
            Perimeter is 2 * (5.6 + 8.5) = 28.20
* */
public class Program_13 {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        double Area = width * height;
        double Perimeter = 2 * (width + height);
        System.out.println("Area : " + df.format(Area));    //3.14

        System.out.println("Area: "+Perimeter);


    }
}
