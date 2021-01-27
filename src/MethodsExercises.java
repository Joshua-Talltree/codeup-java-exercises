import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

        // 3.
        int num;
        int number = 0;
        System.out.print("Enter a number between 1 & 10: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        long fact = 1;
        int i = 1;
        while (i <= number) {
            fact = fact * i;
            i++;
        }

        System.out.println(doSum(3, 4));
        System.out.println(doSub(7, 4));
        System.out.println(doMul(6, 8));
        System.out.println(doEqa(0, 5));
        System.out.println(doMod(1, 2));
        System.out.println(getMul(10, 20));
        System.out.println("Factorial of " + number + " is " + fact);
        accountVal(1, 10);
    }

    // 1. Basic Arithmetic

    public static int doSum(int num1, int num2) {

        return num1 + num2;
    }

    public static int doSub(int num3, int num4) {
        return num3 - num4;
    }

    public static int doMul(int num5, int num6) {
        return num5 * num6;
    }

    public static int doEqa(int num7, int num8) {

        return num7 / num8;
    }

    public static int doMod(int num9, int num10) {

        return num9 % num10;
    }

    public static long getMul(int num5, int num6) {
        long result = 0;
        for (int i = 0; i < num5; i++) {
            result += num6;
        }
        return result;
    }

    // 2. Create a method that validates that user input is in certain range. The method signature should look like this:

    public static int accountVal(int min, int max) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number between 1 & 10: ");
        int userInput = sc.nextInt();

        if (userInput >= min && userInput <= max) { // >= can hit the min with this operand and <= with this operand you can hit the max value.
            System.out.println("You're a validated user!");
            return userInput;
        } else {
            System.out.println("user is not valid!");
            accountVal(min, max);

        }
        return userInput;

        // 3. Calculate the factorial of a number.
            // Prompt the user to enter an integer from 1 to 10.
            // Display the factorial of the number entered by the user.
            // Ask if the user wants to continue.
            // Use a for loop to calculate the factorial.
            // Assume that the user will enter an integer, but verify it’s between 1 and 10.
            // Use the long type to store the factorial.
            // Continue only if the user agrees to.
            // A factorial is a number multiplied by each of the numbers before it.
            // Factorials are denoted by the exclamation point (n!). Ex:

        // see above on void main


        // 4. Create an application that simulates dice rolling.
            // Ask the user to enter the number of sides for a pair of dice.
            // Prompt the user to roll the dice.
            // "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
            // Use static methods to implement the method(s) that generate the random numbers.
            // Use the .random method of the java.lang.Math class to generate random numbers.

        // 5. Game Development 101
            // Welcome to the world of game development!
            // You are going to build a high-low guessing game. Create a class named HighLow inside of src.
            // The specs for the game are:
            // Game picks a random number between 1 and 100.
            // Prompts user to guess the number.
            // All user inputs are validated.
            // If user's guess is less than the number, it outputs "HIGHER".
            // If user's guess is more than the number, it outputs "LOWER".
            // If a user guesses the number, the game should declare "GOOD GUESS!"


    }

}