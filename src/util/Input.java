package util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner;


    public Input() {
        scanner = new Scanner(System.in);
    }

    public static String getString() {
        return getString("Please enter a string:");
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        return yesNo("Please enter \"yes\" or \"no\": ");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);

        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals("y") ||
                answer.toLowerCase().equals("yes"));
    }

    public static int getInt() {
        return getInt("Please enter an integer: ");
    }

    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number;
        try{
            number = Integer.valueOf(getString());
            return number;
        }catch(NumberFormatException nfe) {
            System.out.println("Wrong input, try again");
            return getInt(prompt);
        }
    }

    public int getInt(int min, int max) {
        return getInt("Please enter an integer between " + min + " and " + max + ": ", min, max);
    }

    public int getInt(String prompt, int min, int max) {
        while (true) {
            System.out.println(prompt);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= max)
                return answer;
        }
    }

    public double getDouble() {
        return getDouble("Please enter a double: ");
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        Double number;
        try{
            number = Double.valueOf(getString());
            return number;
        }catch(NumberFormatException nfe) {
            System.out.println("Wrong input, try again");
            return getDouble(prompt);
        }
    }

    public double getDouble(double min, double max) {
        return getDouble("Please enter a number between " + min + " and " + max + ": ", min, max);
    }

    public double getDouble(String prompt, double min, double max) {
        while (true) {
            System.out.println(prompt);
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= max)
                return answer;
        }
    }
}