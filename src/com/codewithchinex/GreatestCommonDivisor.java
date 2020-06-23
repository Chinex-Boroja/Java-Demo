package com.codewithchinex;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE FIRST INTEGER :");
        int number1 = input.nextInt();
        System.out.print("ENTER THE NEXT INTEGER :");
        int number2 = input.nextInt();
        int gcd = 1;
        int k = 2;
        while (k <= number1 && k <= number2) {
            if (number1 % k/2 == 0 && number2 % k/2 == 0)
                gcd = k;
                k++;
        }
        System.out.println( "THE NEW GCD FOR " + number1 + " AND " + number2 + " is " + gcd);

        //double tuition fee man
        double tuitionFee = 10000;
        int year = 0;
        while ( tuitionFee < 20000) {
            tuitionFee *= 1.07;
            year++;
        }
        System.out.println("the tuition fee will double in " + year + " years ");
        System.out.printf("the new tuition fee is &%.2f in %1d years ", tuitionFee, year);
        System.out.println();

        //decimal to hex
        System.out.print("Enter the decimal number: ");
        int decimal = input.nextInt();
        String hex = "";

        while (decimal != 0){
            int hexValue = decimal % 16;
            char hexDigit = (hexValue <= 9 && hexValue >= 0)? (char)(hexValue + '0' ): (char)(hexValue - 10 + 'A');
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("the hexadecimal number is:" + hex);

        //palindrome in java

        Scanner b = new Scanner( System.in);

        System.out.print(" type the word: ");
        String s = b.nextLine();
        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;
        while ( low < high){
            if(s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome)
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
        

    }

}
