/**
 * Madeline Puryear
 * Course: Java I
 * Date: 09/30/2025
 * File: ArrayCreationLab.java
 *
 * This file does 4 things (each separated into methods) to test the understanding of Arrays.
 * Part 1 declares the array before initializing it.
 *
 * Part 2 Declares and initializes it on one line
 *
 * Part 3 Declares it then initializes each part on different lines. As well as printing the values
 * on one line
 *
 * Part 4 takes user input to determine the length and values of/in the array. Then prints
 * them out on one line
 */

import java.util.Scanner;
public class ArrayCreationLab {

    // Part 1
   public static void declareFirst(){
       int[] firstDeclare;
       firstDeclare = new int[5];
       System.out.println("Array length: " + firstDeclare.length);
   }

   // Part 2
   public static void oneLine(){
       String[] colors = {"Red", "Green", "Blue"};
       for(String color : colors){
           System.out.println(color);
       }
   }

   // Part 3
   public static void byIndex(){
       double[] prices = new double[3];
       prices[0] = 9.99;
       prices[1] = 14.50;
       prices[2] = 20.00;

       for (double price : prices){
           System.out.print(price + " ");
       }
   }


   //Part 4
    public static void userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many favorite foods do you have? ");
        int size = scanner.nextInt();

        String[] foods = new String[size];
        scanner.nextLine();

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.print("Your favorite foods are: ");
        for(String food : foods){
            System.out.print(food + " ");
        }

        scanner.close();

    }


    public static void main(String[] args) {
        declareFirst();
        System.out.println("");

        oneLine();
        System.out.println("");

        byIndex();
        System.out.println("");

        userInput();
        System.out.println("");
    }
}
