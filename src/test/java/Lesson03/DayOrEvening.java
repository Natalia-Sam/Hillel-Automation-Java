package Lesson03;

import java.util.Scanner;

public class DayOrEvening {
    public static void main(String[] args){
        // Is it day or evening? In case time is more than 18, show Good evening, otherwise Good day.
        // Try to use IF and Ternary.


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time: ");
        int time = scan.nextInt();

        if(time > 18){
            System.out.println("Good evening");
        }else {
            System.out.println("Good day");
        }



        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a time: ");
        int time2 = scan2.nextInt();

       String result =  (time2 > 18) ? "Good evening" : "Good day";
        System.out.println(result);

    }
}
