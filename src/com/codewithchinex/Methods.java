package com.codewithchinex;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int i = 5;
        int j = 4;
        int k = max(i, j);
        System.out.println(" The maximum of " + i + " and " + j + " is " + k);

        //printing grades
        System.out.println("The grade is " + getGrade(78.5));

        System.out.println("The grade is " + getGrade(59.5));

        //increment
        int x= 1;
        System.out.println("before the call x is " + x);
        increment(x);
        System.out.println("after the call x is " + x);

        //practice
        int g = 1;
        while (g <= 6) {
            method1(g, 2);
            g++;
        }
        // Initialize times
        int times = 3;
        System.out.println("Before the call," + " variable times is " + times);
// Invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call," + " variable times is " + times);

        //grade
        System.out.print("your grade is ");
        printGrade(80);
        System.out.print("your grade is ");
        printGrade(60.5);

        //gcd program
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first integer: ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter the second integer: ");
        int secondNumber = input.nextInt();

        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcd(firstNumber,secondNumber));

        //checking primeNumbers
        System.out.println("the first 50 prime numbers are: \n");
        printPrimeNumbers(50);

        //convert hex to decimal
        Scanner broddy = new Scanner(System.in);
        System.out.print("Enter the hex string: ");
        String hex = broddy.nextLine();
        System.out.println(" the decimal value for the hex " + hex + " is " + hexToDecimal(hex.toUpperCase()));

        //random character

        final int NUMBER_OF_RANDOM_NUMBERS = 175;
        final int PER_LINE = 25;

        for(i =0; i< NUMBER_OF_RANDOM_NUMBERS; i++) {
            char ch = Methods.getRandomLowerCaseLetter();
            if ((i + 1) % PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }

    }
    //grade
    public static void printGrade( double scores){
        if ( scores >= 90) {
            System.out.println('A');
        }
        else if ( scores >= 80) {
            System.out.println('B');
        }
        else if ( scores >= 70) {
            System.out.println('C');
        }
        else {
            System.out.println('F');
        }
    }
    // Print the message n times

    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
    public static int max( int num1, int num2){
        int result;
        if( num1 > num2)
            result = num1;
        else if( num1 < num2)
            result = num2;
        else
            result = num2 | num1;
        return result;
    }
    public static char getGrade(double score){
        if(score >= 90){
            return 'A';
        }
        else if(score >= 80){
            return 'B';
        }
        else if (score >= 70){
            return 'C';
        }
        else {
            return 'F';
        }
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is " + n);
    }

    public static void method1(int g, int num) {
        for (int j = 1; j <= g; j++) {
            System.out.print(num + " ");
            num *= 2;
        }
        System.out.println();
    }
    public static int gcd(int firstNumber,int secondNumber){
        int gcd = 1;
        int k = 2;
        while(k<= firstNumber && k <= secondNumber ){
            if( firstNumber % k== 0 && secondNumber % k ==0)
                gcd = k;
            k++;
        }
        return gcd;
    }
    public static void printPrimeNumbers(int numberOfPrimes ) {
        final int NUMBER_OF_PRIME_NUMBERS = 10;
        int count = 0;
        int number = 2;

        while (count <= numberOfPrimes) {
            if (isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIME_NUMBERS == 0) {
                    System.out.printf("%-5s\n", number);
                } else
                    System.out.printf("%-5s", number);

            }
            number++;

        }
    }
    public static boolean isPrime(int number){
        for(int divisor = 2; divisor <= number/2; divisor++){
            if(number % divisor == 0){
                return false;
            }
        }
        return true;

    }

    public static int hexToDecimal(String hex){
        int decimalValue = 0;
        for(int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;

    }
    public static int hexCharToDecimal(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - 0;
    }
    public static char getRandomCharacter(char ch1, char ch2){
        return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
    }
    public static char getRandomLowerCaseLetter(){
        return getRandomCharacter('a','z');
    }
}
