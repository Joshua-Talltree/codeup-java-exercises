package syntax;
import java.util.Scanner;


public class ControlFlowExercises {

    public static void main(String[] args) {

        // TODO: Loop Basics While Create an integer variable i with a value of 5. Create a while loop that runs so long as i is less than or equal to 15 Each loop iteration, output the current value of i, then increment i by one. Your output should look like this: 5 6 7 8 9 10 11 12 13 14 15

        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

        // TODO: Do While Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line. Alter your loop to count backwards by 5's from 100 to -10. Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:

        int j = 105;
//        do {
//            System.out.println(j -= 5);
//        }
//        while (j >= -5);

        int k = 2;
//        do {
//            System.out.println(k = k * 2);
//            i++;
//        }
//        while (k < 1000000);

        // TODO: Refactor the previous two exercises to use a for loop instead.

        for (i = 5; i <= 15; i++) {
            System.out.println(i);
        }


        for (j = 105; j >= -5; i--) {
            System.out.println(j -= 5);
        }


        for (k = 2; k < 1000000; i++) {
            System.out.println(k = k * 2);
        }

        // TODO: Fizzbuzz: One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//        class fizzBuzz {
//
//            public void fizzBuzzWhile(int num) {
//
//                int l = 1;
//
//                while (l <= num) {
//                    if (l % 15 == 0) {
//                        System.out.println("Fizzbuzz");
//                    } else {
//                        if (l % 3 == 0) {
//                            System.out.println("Fizz");
//                        } else if (l % 5 == 0) {
//                            System.out.println("Buzz");
//                        } else {
//                            System.out.println(l);
//                        }
//                        l++;
//                    }
//                }
//            }
//        }

//        Display a table of powers.Prompt the user to enter an integer. Display a table of squares and cubes from 1 to the value entered. Ask if the user wants to continue. Assume that the user will enter valid data. Only continue if the user agrees to.


        // User starts here
        System.out.println("This is the Number, Squared, and Cubed Table");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String choice = "y";

        do {
            // User input
            System.out.print("Please enter an integer: ");
            int integer = scanner.nextInt();

            // Number/Squared/Cubed Header
            String header = "Number  " + "Squared " + "Cubed   " + "\n"
                    + "======  " + "======= " + "=====   ";
            System.out.println(header);

            int square = 0;
            int cube = 0;

            String row = "";
            for (int m = 1; i <= integer; i++) {

                square = m * m;
                cube = m * m * m;

                row = m + "       " + square + "       " + cube;
                System.out.println(row);
            }

            // Does the user want to continue?
            System.out.print("Continue? (y/n): ");
            choice = scanner.next();
            System.out.println();

        }
        while (!choice.equalsIgnoreCase("n"));

    }

}

