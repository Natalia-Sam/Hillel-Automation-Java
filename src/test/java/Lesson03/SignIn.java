package Lesson03;

import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        // Create program that logs you into system. Check name validity. Check password length. Example:
        //•Enter your name:  Helen (in case the name is empty print error)
        //•Enter your password:  pass (in case wrong pass print error)


        Scanner inputUserName = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName2 = inputUserName.nextLine();
        int userNameLength2 = userName2.length();

        if(userNameLength2 != 0){
            System.out.println("Enter your password: ");
        }else{
            System.out.println("Error! The name is empty");
        }
        int expectedPassword = 22;
        Scanner inputPassword = new Scanner(System.in);
        int password2 = inputPassword.nextInt();
        if(password2 == expectedPassword){
            System.out.println("Welcome to your account!");
        }else{
            System.out.println("Name or password are incorrect");
        }






        Scanner scanUserName = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanUserName.nextLine();
        int userNameLength = userName.length();

        Scanner scanPassword = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = scanPassword.nextLine();
        int passwordLength = password.length();

        if ((userNameLength != 0) && (passwordLength > 6)) {
            System.out.println("Welcome to your account!");
        } else {
            System.out.println("Name or password are incorrect");
        }

        }
    }





