package Lesson03;
import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

//        Write a Java program that takes a year from user input and prints whether that year is a leap year or not. Use input from consol
//        Input example: 2045
//        Expected output: "Year 2045 is not a leap year"
//        Input example: 2012
//        Expected output: "Year 2012 is a leap year"

        Scanner yearInput = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = yearInput.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
