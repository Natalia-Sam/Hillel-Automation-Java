package Lesson03;

import java.util.Scanner;

public class MorningDayEvening {
    public static void main(String[] args){

//        Is it morning, day or evening? In case time more than 18, show Good evening,
//        before 10 Good morning, otherwise Good day. Use input from console.
//        Примечание от меня: вроде бы, утро считается до 12.00, день после 12.00, но по заданию до 10.00, поэтому пусть будет так


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a time: ");
        double time = scan.nextDouble();

        if((time >= 18.00) && (time <= 23.59)){
            System.out.println("Good evening!");
        } else if((time >= 00.00) && (time <= 10.00)){
            System.out.println("Good morning!");
        } else if((time >= 10.01) && (time < 18.00)){
            System.out.println("Good day!");
        } else {
            System.out.println("Please, enter correct time");
        }

    }
}
