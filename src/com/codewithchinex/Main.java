package com.codewithchinex;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabetical order are " +
                    city1 + ", " + city2);
        else
            System.out.println("The cities in alphabetical order are " +
                    city2 + ", " + city1);
        String message = " Welcome to Ghost";
        String message2 = message.substring(0,11) + " NEX";
        System.out.println("new string is:" + message2);

        System.out.println("Welcome to Java".indexOf('W'));

       //hexadecimal conversion from decimal
        Scanner conversion  = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = conversion.nextLine();
        // Check if the hex string has exactly one character
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        // Display decimal value for the hex digit
        char ch = hexString.charAt(0);
        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);
        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch);
        }
        else {
            System.out.println(ch + " is an invalid input");
             }
        //formatting strings
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        // Display values for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        // Display values for 60 degrees
        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));

        int count = 0;
        while (count < 100){
            System.out.println("Welcome");
            count++;
        }
        int sum = 0;
        int i = 1;
        while (i < 10){
            sum +=i;
            i++;
        }
        System.out.println(" sum is " + sum);

        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        Scanner addition = new Scanner(System.in);
        System.out.println(" what is " + number1 + " + " + number2 + " ? ");
        int answer = addition.nextInt();

        while (number1 + number2 !=answer) {
            System.out.println(" wrong answer!! Try again. What is " + number1 + " + "+ number2 + " ? ");
            answer = addition.nextInt();
        }
        System.out.println(" That is the correct answer !!");

        // RANDOM GUESSING
        int number3 = (int)(Math.random() * 100);
        Scanner guessNumbers = new Scanner(System.in);
        System.out.println( " Guess number from 0 - 101 : ");

        int guess = 0;
        while (guess != number3){
                System.out.print(" \nEnter the guess number ");
                guess = guessNumbers.nextInt();

                if (guess == number3)
                    System.out.println(" your correct, the number is : " + number3);
                else if ( guess > number3 )
                    System.out.println( " Guess is too high");
                else
                    System.out.println( " Guess is too low");
        }
        //subtraction quiz
        final int NUMBER_OF_QUESTIONS = 5;
        int correctKount = 0;
        int kount = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner subQuiz = new Scanner(System.in);

        while (kount < NUMBER_OF_QUESTIONS){
            int number4 = (int)(Math.random() * 10);
            int number5 = (int)(Math.random() * 10);

            if (number4 < number5){
                int temp = number4;
                number4 = number5;
                temp = number5;
            }
            System.out.print("What is " + number4 + " - " + number5 + " ? ");
            int result = subQuiz.nextInt();
            if (number4 - number5 == result){
                System.out.println(" You are correct ");
                correctKount++;
            }
            else
                System.out.println(" you are wrong" + number4 + " - " + number5 + " should be " + ( number4 - number5));
            kount++;
            output += "\n" + number4 + " - " + number5 + " = " + result + ((number4 - number5 == result) ? " correct " : " wrong ");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("correct count is " + correctKount +"\nTest time is " + testTime/1000 + " seconds is\n " + output );
    }
}
