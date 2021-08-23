package Lesson03;

import java.util.Scanner;

public class NumberOfDay {
    public static void main(String[] args) {

        // Print name of Weekday according to number. For example: Enter 1, Print “Monday”


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of the day: ");
        int numberOfDay = scan.nextInt();

        switch(numberOfDay){
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Sorry, I don't know this day");
        }

    }
}
