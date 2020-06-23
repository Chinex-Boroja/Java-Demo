package com.codewithchinex;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        double[]myList = {1, 3.0, 6.77, 67, 89, 4.2, 2.6,};
        for (double e: myList) {
           
            System.out.println(myList[5]);
        }
        System.out.println();
        int x = 90;
        int[]numbers = new int[x];
        x = 60;
        System.out.println("x is " + x);
        System.out.println("the size of numbers is " + numbers.length);

        //deck example
        int[]deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "Kings"};

        for(int i = 0; i < deck.length; i++)
            deck[i] = i;
        for (int i = 0; i < deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
        for (int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("Card Number " + deck[i] + ":" + rank + " of " + suit);
        }

        //new experience
        double[]myWork = {8.2, 7, 4, 2, 5, 3.3, 38, 309, 65, 5.5};
        double sum = myWork[0] + myWork[1];
        double total = 0;
        for (int i = 0; i < myWork.length; i++){
            total += myWork[i];
        }
        System.out.println(" total is " + total);
        System.out.println("sum of index0 and index1 is " + sum);
        //minimum number
        double min = myWork[0];
        for (int i = 0; i < myWork.length; i++){
            if (myWork[i]< min) min = myWork[i];
        }
        System.out.println("min is " + min);
        //generating an index
        for (int i = 0; i < myWork.length; i++){
            myWork[i] = Math.random() * 10;
            System.out.println(" the index is " + myWork[i] + " ");
        }
        //another one
        int[]list = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i < list.length; i++)
            list[i] = list[i-1];
        for (int i = 1; i < list.length; i++)
            System.out.println(list[i] + " ");

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items : ");
        int n = input.nextInt();
        double[]number = new double[n];
        double summation = 0;

        System.out.print(" Enter the numbers : ");
        for(int i = 0; i < n; i++){
            number[i] = input.nextDouble();
            summation +=number[i];
        }

        double average = summation / n;

        int count = 0;
        for (int i = 0; i < n; i++)
            if(number[i] > average)
                count++;

        System.out.println("print average " + average);
        System.out.println("number of element above average is " + count);

        //copying arrays
        int[] sourceArray = {2, 5, 9, 6, 8, 9};
        int[] targetArray = new int[sourceArray.length];
        for(int i = 0; i < sourceArray.length; i++){
            targetArray[i] = sourceArray[i];
        }
        System.out.println();



        





    }
}
