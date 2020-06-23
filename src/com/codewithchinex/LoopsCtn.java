package com.codewithchinex;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsCtn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the integer ( The input ends if it is not zero) ");
        int data = input.nextInt();

        int sum = 0;
        while (data!=0){
            sum += data;

            System.out.print(" Enter the integer ( The input ends if it is not zero) ");
            data = input.nextInt();
        }
        System.out.println(" Then sum is " + sum);

        int i = 1;
        while (i < 10 )
            if ((i++) % 2 == 0)
                System.out.println(i);

        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0){
            number = input.nextInt();
            if ( number > max)
                max = number;
        }
        System.out.println(" max is " + max);
        System.out.println(" number is " + number);

        //for WHILE
        int sum1 = 0, count, number1;
        for (count = 0; count< 1; count++){
            number1 = input.nextInt();
            sum1 += number1;
        }
        System.out.println("count is " + count);
        System.out.println("sum is " + sum1);

        int i1 = 1;
        int sum2 = 0;
        while (sum2 < 10) {
            sum2 = sum2 + i1;
            System.out.println(" is " + i1);
            System.out.println("sum is" + sum2);
            i1++;
        }
        int sum3 = 0;
        int m;
        for (m = 1; sum3 < 10; m++) {
            sum3 += m;
            System.out.println( "m is " + m);
            System.out.println(" sum3 is " + sum3);

        }

        System.out.println("            Multiplication Table ");
        System.out.print("    ");
        for(int j = 1; j<=9; j++)
            System.out.print("   " + j);
        System.out.println("\n---------------------------------------------");
        for (int n = 1; n <=9; n++) {
            System.out.print(n + " | ");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%4d", n * j);
            }
            System.out.println();
        }
        //instance
        for(int h =0; h<10; h++) {
            for (int g = 0; g < h; g++) {
                System.out.println(" the value of h is: " + h + " & " + " the value of g is : " + g + "  " + " product " + h * g);
            }
            System.out.println(" ");
        }
    }
}
