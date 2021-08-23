package Lesson03;

import java.util.Scanner;

public class SrtingLength {
    public static void main(String[] args) {
        // Check length of string, if string is more than expected print error.

        Scanner stringLength = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String text = stringLength.nextLine();
        int valueLength = text.length();

        if(valueLength < 20){
        System.out.println("Tis text consists of " + valueLength + " symbols");
        } else {
            System.out.println("Error. Enter shorter text");
        }
    }
}
