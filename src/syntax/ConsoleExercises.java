package syntax;

import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

// TODO: Copy this code into your main method:

        double pi = 3.14159;

// TODO: Write some Java code that uses the variable pi to output the following: The value of pi is approximately 3.14.

        PrintStream format;
        System.out.printf("The value of pi is approximately: %s\n", pi);

// TODO: Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.

        System.out.format("The value of pi is now: 3.0\n", pi);

// TODO: Prompt a user to enter a integer and store that value in an int variable using the nextInt method.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        int number = scanner.nextInt();

        System.out.println("You entered: --> \"" + number + "\" <--");



// TODO: What happens if you input something that is not an integer?

        // it throws an InputMismatchException
//
// TODO: Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline. What happens if you enter less than 3 words? What happens if you enter more than 3 words?



//
// TODO: Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user. do you capture all the words?

// TODO: Rewrite the above example using the nextLine method.

// Calculate the perimeter and area of Codeup's classrooms.

// TODO: Prompt the user to enter values of length and width of a classroom at Codeup.
//
// TODO: Use the nextLine method to get user input and parse the resulting string to a numeric type. Assume that the rooms are perfect rectangles. Assume that the user will enter valid numeric data for length and width.
//
// TODO: Display the area and perimeter of that classroom. The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.


    }
}
