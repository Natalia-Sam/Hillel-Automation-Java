package Lesson03;
import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
//
//        Write a program which takes a number of month from user and prints out name of season (summer, winter ...)
//        Use input from console!
//        Input example: 4
//        Expected output: "It's a spring season!"


        Scanner monthNumber = new Scanner(System.in);
        System.out.println("Enter a number of month: ");
        int month = monthNumber.nextInt();

        if ((month == 12) || (month == 1) || (month == 2)) {
            System.out.println("It's a winter!");
        }

        if ((month == 3) || (month == 4) || (month == 5)) {
            System.out.println("It's a spring!");
        }

        if ((month == 6) || (month == 7) || (month == 8)) {
            System.out.println("It's a summer!");
        }

        if ((month == 9) || (month == 10) || (month == 11)) {
            System.out.println("It's an autumn!");
        }

    }
}
