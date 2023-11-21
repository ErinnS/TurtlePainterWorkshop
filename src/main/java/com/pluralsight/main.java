package com.pluralsight;

import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        while (true) {
           Scanner scanner = new Scanner(System.in);
           double userInput;
           String userChoice;

            System.out.println("What would you like to do?");
            System.out.println("1) Add Shape");
            System.out.println("2) Save Image");
            System.out.println("3) Exit");
            System.out.print("Please enter a number: ");
            userInput = scanner.nextInt();

            if (userChoice.equals("1")) {
                System.out.println("What shape would you like to add?");
                System.out.println("1) Square");
                System.out.println("2) Triangle");
                System.out.println("3) Circle");
                System.out.print("Please enter a number: ");
                userInput = scanner.nextInt();

                if (userChoice.equals("1")){
                    System.out.println("What is the border width?: ");
                    userInput = scanner.nextInt();
                    System.out.println("What is the border color?: ");
                    userChoice = scanner.nextLine();
                    System.out.println("What is the location of the shape (x,y)?: ");
                    userInput = scanner.nextDouble();
                }
                if (userChoice.equals("2")) {
                    System.out.println("What is the border width?: ");
                    userInput = scanner.nextInt();
                    System.out.println("What is the border color?: ");
                    userChoice = scanner.nextLine().trim().toUpperCase();
                    System.out.println("What is the location of the shape (x,y)?: ");
                    userInput = scanner.nextInt();
                }
                if (userChoice.equals("3")) {
                    System.out.println("What is the radius?: ");
                    userInput = scanner.nextInt();
                    System.out.println("What is the border width?: ");
                    userInput = scanner.nextInt();
                    System.out.println("What is the border color?: ");
                    userChoice = scanner.nextLine().trim().toUpperCase();
                    System.out.println("What is the location of the shape (x,y)?: ");
                    userInput = scanner.nextInt();

                }
            }
        }
    }
}
