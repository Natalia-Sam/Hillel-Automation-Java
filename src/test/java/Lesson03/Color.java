package Lesson03;

import java.util.Scanner;

public class Color {
    public static void main(String[] args){

//        Write the program which takes a name of color from user (red, blue, green, yellow, orange, black, white, pink)
//        and print out length of this word. Use input from console
//        You can’t use .length() of String. Use switch operator.


        Scanner colorName = new Scanner(System.in);
        System.out.println("Enter a name of the color: ");
        String color = colorName.nextLine();
        int colorLength = color.length();
        System.out.println("color " + color + " consists of " + colorLength + " letters");


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name of the color: ");
        String colors = input.nextLine();

        switch (colors){
            case "red":
                System.out.println("This color consists of 3 letters");
                break;

            case "blue":
                System.out.println("This color consists of 4 letters");
                break;

            case "green":
                System.out.println("This color consists of 5 letters");
                break;

            case "yellow":
                System.out.println("This color consists of 6 letters");
                break;

            case "orange":
                System.out.println("This color consists of 6 letters");
                break;

            case "black":
                System.out.println("This color consists of 5 letters");
                break;

            case "white":
                System.out.println("This color consists of 5 letters");
                break;

            case "pink":
                System.out.println("This color consists of 4 letters");
                break;

            default:
                System.out.println("Sorry, I don't know this color");


        }



    }
}
